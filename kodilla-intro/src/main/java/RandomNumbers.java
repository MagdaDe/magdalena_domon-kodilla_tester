import java.util.Random;

public class RandomNumbers {
    public static int[] createRandomNumbers(int max) {
        Random random = new Random();
        int sum = 0;
        int i = 0;
        int size = max;
        int[] table = new int[size];
        while (sum <= max) {
            int number = random.nextInt(31);
            System.out.println("[i]" + i + " liczba losowa z tablicy: " + number);
            table[i] = number;
            sum += table[i];
            System.out.println("Suma losowych z tablicy: " + sum);
            i++;
        }
        int[] tableSmaller = new int[i];
        for (int j = 0; j < tableSmaller.length; j++) {
            tableSmaller[j] = table[j];
        }
        return tableSmaller;
    }

    public static int getMinimum(int[] table) {
        int value = table[0];
        for (int i = 1; i < table.length; i++) {
            if (value > table[i]) {
                value = table[i];
            }
        }
        return value;
    }

    public static int getMaximum(int[] table) {
        int value = table[0];
        for (int i = 1; i < table.length; i++) {
            if (value < table[i]) {
                value = table[i];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        RandomNumbers obiekt1 = new RandomNumbers();
        int max = 5000;

        int[] table1 = obiekt1.createRandomNumbers(max);

        for (int i = 0; i < table1.length; i++) {
            System.out.println(table1[i]);
        }

        int minValue = obiekt1.getMinimum(table1);
        System.out.println("Najmniejsza wartość z tablicy to: " + minValue);

        int maxValue = obiekt1.getMaximum(table1);
        System.out.println("Największa wartość z tablicy to: " + maxValue);
    }
}