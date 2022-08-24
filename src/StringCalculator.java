import java.util.ArrayList;
public class StringCalculator {

    public static int add(String numbers) {

        if (numbers == "") {
            return 0;
        }
        else {
            ArrayList<Integer> negativenumbers = new ArrayList<Integer>();
            int sum = 0;
            int negativefound=0;

            String coma_separate[] = numbers.split(",");

            for (String x : coma_separate) {
                      int num = Stringtoint(x);
                     if(num>0) {
                         if (num>1000)
                         {
                             continue;
                         }
                         sum += num;
                     }
                     else {
                         negativenumbers.add(num);
                         negativefound=1;
                     }
                }
            try {
                if(negativefound==1)
                {
                    throw new RuntimeException("negatives not allowed: "+negativenumbers);
                }
            }
            catch (RuntimeException e)
            {
                System.out.println(e.getMessage());
                return -1;
            }

            return sum;
            }

        }

    public static int Stringtoint(String stringinput)
    {
        int numval = 0;
        try {
             numval = Integer.parseInt(stringinput);
            return numval;
        }
        catch (Exception e)
        {
            return (stringinput.charAt(0)+0)-96;
        }

    }

    public static void main(String[] args) {
        int ans = StringCalculator.add("4,a,b,1005,5");
        System.out.println(ans);
    }
}


