package NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void checkDayTest() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String exp = "2/1/2018";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }

    @Test
    void checkDayTest1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String exp = "1/2/2018";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }

    @Test
    void checkDayTest2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String exp = "1/5/2018";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }

    @Test
    void checkDayTest3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String exp = "1/3/2018";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }

    @Test
    void checkDayTest4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String exp = "1/3/2020";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }

    @Test
    void checkDayTest5() {
        int day = -3;
        int month = 12;
        int year = 2018;
        String exp = "Not Day";
        String result = NextDayCalculator.checkDay(day, month, year);
        assertEquals(exp, result);
    }
}