package FizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translateTest1() {
        int number = 3;
        String desire = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest2() {
        int number = 5;
        String desire = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest3() {
        int number = 30;
        String desire = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest4() {
        int number = -5;
        String desire = "Number is not integer";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest5() {
        int number = 26;
        String desire = "Twenty Six";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest6() {
        int number = 121;
        String desire = "Cannot Translate number 121";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest7() {
        int number = 13;
        String desire = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }

    @Test
    void translateTest8() {
        int number = 56;
        String desire = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(desire, result);
    }
}