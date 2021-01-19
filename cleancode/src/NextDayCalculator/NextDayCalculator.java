package NextDayCalculator;

public class NextDayCalculator {

    public static String checkDay(int day, int month, int year) {
        return CheckDayBiggerZero(day, month, year);
    }

    private static String CheckDayBiggerZero(int day, int month, int year) {
        if (day >0) {
            return CheckMonth(day, month, year);
        }
        else {
            return "Not Day";
        }
    }

    public static String CheckMonth(int day, int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10 -> checkMonth31Day(day, month, year);
            case 4, 6, 9, 11 -> checkMonth30Day(day, month, year);
            case 2 -> checkYear(day, month, year);
            case 12 -> checkMonth12(day, month, year);
            default -> "not Day";
        };
    }

    private static String checkMonth12(int day, int month, int year) {
        if (day > 0 && day < 31) {
            return (day + 1) + "/" + month + "/" + year;
        } else {
            day = 1;
            month = 1;
            return day + "/" + month + "/" + (year + 1);
        }
    }

    private static String checkYear(int day, int month, int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return checkMonth29Day(day, month, year);
        } else {
            return checkMonth28Day(day, month, year);
        }
    }

    private static String checkMonth28Day(int day, int month, int year) {
        if (day > 0 && day < 28) {
            return (day + 1) + "/" + month + "/" + year;
        } else {
            day = 1;
            return day + "/" + (month + 1) + "/" + year;
        }
    }

    private static String checkMonth29Day(int day, int month, int year) {
        if (day > 0 && day < 29) {
            return (day + 1) + "/" + month + "/" + year;
        } else {
            day = 1;
            return day + "/" + (month + 1) + "/" + year;
        }
    }

    private static String checkMonth30Day(int day, int month, int year) {
        if (day > 0 && day < 30) {
            return (day + 1) + "/" + month + "/" + year;
        } else {
            day = 1;
            return day + "/" + (month + 1) + "/" + year;
        }
    }

    private static String checkMonth31Day(int day, int month, int year) {
        if (day > 0 && day < 31) {
            return (day + 1) + "/" + month + "/" + year;
        } else {
            day = 1;
            return day + "/" + (month + 1) + "/" + year;
        }
    }
}

