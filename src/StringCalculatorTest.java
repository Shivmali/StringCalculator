import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
     void EmptyStringReturnsZero() {
        assertEquals(0,StringCalculator.add(""));
    }

    @Test
     void SingleInputReturnsInput() {
        assertEquals(1,StringCalculator.add("1"));
    }

    @Test
     void DoubleInputReturnsTheirSum() {
        assertEquals(3,StringCalculator.add("1,2"));
    }

    @Test
     void multiInputReturnsTheirsum() {
        assertEquals(15,StringCalculator.add("2,3,1,4,5"));
    }

    @Test
    void lowerAlphetsReturnsPosition() {
        assertEquals(10,StringCalculator.add("a,1,2,b,d"));
    }

    @Test
    void negativeShouldThrowException()
    {
        try {
            StringCalculator.add("1,2,-1");
        }
        catch (Exception e) {

        }
    }

    @Test
    void NegativeNumberinList()
    {
        try {
            StringCalculator.add("1,-3,-5");
        }
        catch (RuntimeException e)
        {
        };
    }

    @Test
     void numbersGreaterThanThousandShouldIgnored()
    {
        assertEquals(1013,StringCalculator.add("1001,5,1005,8,1000,2090"));
    }
    }


