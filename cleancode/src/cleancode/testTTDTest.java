package cleancode;

import static org.junit.jupiter.api.Assertions.*;

class testTTDTest {

    @org.junit.jupiter.api.Test
    void tinhtong() {
        int x =1;
        int y = 2;
        int result = 3;
        testTTD check = new testTTD();
        int Result = check.tinhtong(x,y);
        assertEquals(result,Result);
    }
}