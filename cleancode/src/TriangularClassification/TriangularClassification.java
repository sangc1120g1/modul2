package TriangularClassification;

public class TriangularClassification {
    public static String checkTriangle(int firstSide, int secondSide, int thirdSide) {
        return checkClack(firstSide,  secondSide, thirdSide);
    }

    private static String checkClack(int firstSide, int secondSide, int thirdSide) {
        return checkSide(firstSide, secondSide, thirdSide);
    }

    private static String checkSide(int firstSide, int secondSide, int thirdSide) {
        boolean checkThirdSide = firstSide + secondSide <= thirdSide;
        boolean checkFirstSide = secondSide + thirdSide <= firstSide;
        boolean checkSecondSide = firstSide + thirdSide <= secondSide;
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            return "Not Triangle";
        } else {
            return checkTrueTriangle(firstSide, secondSide, thirdSide, checkThirdSide, checkFirstSide, checkSecondSide);
        }
    }

    private static String checkTrueTriangle(int firstSide, int secondSide, int thirdSide, boolean checkThirdSide, boolean checkFirstSide, boolean checkSecondSide) {
        boolean checkSideTriangle = checkThirdSide || checkFirstSide || checkSecondSide;
        boolean checkSideZero = firstSide == 0 || secondSide == 0 || thirdSide == 0;
        if (checkSideTriangle|| checkSideZero) {
            return "Not Triangle";
        }
        else {
            boolean checkThAndSeSide = (secondSide == thirdSide);
            boolean checkThAndFiSide = (thirdSide == firstSide);
            boolean checkSeAndFiSide = (secondSide == firstSide);
            if (checkThAndSeSide && checkThAndFiSide){
                return "Equilateral Triangle";
            } else if (checkThAndSeSide||checkThAndFiSide||checkSeAndFiSide){
                return "Isosceles Triangle";
            } else {
                return "Is Triangle";
            }
        }
    }
}
