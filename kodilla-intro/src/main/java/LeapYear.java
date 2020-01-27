public class LeapYear {
    public static boolean isLeapYear() {
        int year = 1940; // enter year

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void main(String[] args) {
        boolean leapYear = isLeapYear();
        System.out.println(leapYear);
    }
}
