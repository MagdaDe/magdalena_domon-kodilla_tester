public class Loops {
    public static int sumujLiczby(int[] liczby) {
        int wynik = 0;
        for (int i = 0; i < liczby.length; i++) {
            wynik += liczby[i];
        }
        return wynik;
    }

    public static void main(String[] args) {
        Loops liczba = new Loops();
        int[] liczby = new int[]{1000, 900, 80, 3};
        int sumaLiczb = liczba.sumujLiczby(liczby);
        System.out.println("Suma liczb z tablicy wynosi " + sumaLiczb);

        Loops kolejnaLiczba = new Loops();
        int[] kolejneLiczby = new int[]{1, 2, 3, 4, 5};
        int sumaKolejnychLiczb = kolejnaLiczba.sumujLiczby(kolejneLiczby);
        System.out.println("Suma liczb z tablicy wynosi " + sumaKolejnychLiczb);
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println();

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}