public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

//  wcześniej rozpoczęłam tak i sprawdzałam dla jednej zmiennej naraz:
//  public static boolean isLeapYear() {
//      int year = 1940; // enter year

    public static void main(String[] args) {
        LeapYear obiekt = new LeapYear();
        int year = 1940;
        boolean leapYear = obiekt.isLeapYear(year);
        System.out.println("Czy rok " + year + " jest przestępny? " + leapYear);

        LeapYear obiekt2 = new LeapYear();
        int year2 = 1800;
        boolean leapYear2 = obiekt2.isLeapYear(year2);
        System.out.println("Czy rok " + year2 + " jest przestępny? " + leapYear2);
    }

//  wywołanie dla jednej zmiennej naraz:
//  public static void main(String[] args) {
//        boolean leapYear = isLeapYear();
//        System.out.println(leapYear);
}
