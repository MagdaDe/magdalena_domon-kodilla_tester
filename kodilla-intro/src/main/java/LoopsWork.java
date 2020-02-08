import java.util.Random;

public class LoopsWork {
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum += temp;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int max = 2;
        int wynik = getCountOfRandomNumber(max);
        System.out.println("Dla maksymalnej sumy wynoszącej " + max + " ilość losowań wynosi " + wynik);
    }
}
