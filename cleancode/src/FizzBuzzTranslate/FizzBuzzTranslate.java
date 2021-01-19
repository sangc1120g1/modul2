package FizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        return checkNumber(number);
    }

    private static String checkNumber(int number) {
        int surplus = number % 10;
        int checkSurplus = number / 10;
        if (number > 0) {
            return checkTranslateFizzBuzz(number, surplus, checkSurplus);
        } else {
            return "Number is not integer";
        }
    }

    private static String checkTranslateFizzBuzz(int number, int surplus, int checkSurplus) {
        int checkSurplusThan3 = number % 3;
        int checkSurplusThan5 = number % 5;
        if (checkSurplusThan3 == 0 && checkSurplusThan5 == 0) {
            return "FizzBuzz";
        } else if (checkSurplusThan3 == 0 || surplus == 3 || checkSurplus == 3) {
            return "Fizz";
        } else if (checkSurplusThan5 == 0 || surplus == 5 || checkSurplus == 5) {
            return "Buzz";
        } else {
            return checkTranslate(number, surplus);
        }
    }

    private static String checkTranslate(int number, int surplus) {
        if (number < 10) {
            return translateNumber(number);
        } else if (number < 20) {
            return translateLessThanTwenty(number);
        } else if (number < 100) {
            return translateGreaterThanTwenty(number) + " " + translateNumber(surplus);
        } else {
            return "Cannot Translate number " + number;
        }
    }

    private static String translateNumber(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Cannot Translate";
        };
    }

    private static String translateLessThanTwenty(int number) {
        int checkSurplus = number % 10;
        return switch (checkSurplus) {
            case 0 -> "Ten";
            case 1 -> "Eleven";
            case 2 -> "Twelve";
            case 3 -> "Thirteen";
            case 4 -> "Fourteen";
            case 5 -> "Fifteen";
            case 6 -> "Sixteen";
            case 7 -> "Seventeen";
            case 8 -> "Eighteen";
            case 9 -> "Nineteen";
            default -> "Cannot Translate";
        };
    }

    private static String translateGreaterThanTwenty(int number) {
        int checkNumber = number / 10;
        return switch (checkNumber) {
            case 2 -> "Twenty";
            case 3 -> "Thirty";
            case 4 -> "Forty";
            case 5 -> "Fifty";
            case 6 -> "Sixty";
            case 7 -> "Seventy";
            case 8 -> "Eighty";
            case 9 -> "Ninety";
            default -> "Cannot Translate";
        };
    }
}
