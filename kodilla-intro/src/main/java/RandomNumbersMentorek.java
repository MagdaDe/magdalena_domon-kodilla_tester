import java.util.Random;

public class RandomNumbersMentorek {
    public static int[] createRandomNumbers(int max) {
        Random random = new Random();
        int sum = 0;
        int i = 0;
        int[] table = new int[1];
        while (sum <= max) {
            int number = random.nextInt(31);
            int[] newTable = new int[i + 1];
            for (int j = 0; j < table.length; j++) {
                newTable[j] = table[j];
            }
            newTable[i] = number;
            table = newTable;
            sum += table[i];
            System.out.println("[i]" + i + " liczba losowa z tablicy: " + number);
            System.out.println("Suma losowych z tablicy: " + sum);
            i++;
        }
        return table;
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
        RandomNumbersMentorek obiekt1 = new RandomNumbersMentorek();
        int max = 30;

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
