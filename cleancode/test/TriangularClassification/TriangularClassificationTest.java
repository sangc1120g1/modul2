package TriangularClassification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangularClassificationTest {

    @Test
    void checkClackTest1() {
        int firstSide = 1;
        int secondSide = 1;
        int thirdSide = 1;
        String desire = "Equilateral Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
    @Test
    void checkClackTest2() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 3;
        String desire = "Isosceles Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
    @Test
    void checkClackTest3() {
        int firstSide = 2;
        int secondSide = 3;
        int thirdSide = 4;
        String desire = "Is Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
    @Test
    void checkClackTest4() {
        int firstSide = 8;
        int secondSide = 2;
        int thirdSide = 3;
        String desire = "Not Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
    @Test
    void checkClackTest5() {
        int firstSide = -1;
        int secondSide = 2;
        int thirdSide = 1;
        String desire = "Not Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
    @Test
    void checkClackTest6() {
        int firstSide = 0;
        int secondSide = 2;
        int thirdSide = 1;
        String desire = "Not Triangle";
        String result = TriangularClassification.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(desire, result);
    }
}