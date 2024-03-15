public class Homework {
    public static void main(String[] args) {
        checkLeapYear(2021);

    }
    public static boolean checkLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year < 1584);
        if (leapYear) {
            System.out.println(year + " - Год является високосным");
        } else {
            System.out.println(year + " - Год не високосный");
        }
        return leapYear;
    }
}