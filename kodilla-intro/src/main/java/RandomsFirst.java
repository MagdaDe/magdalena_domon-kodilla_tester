import java.util.Random;

public class RandomsFirst {
    //przykład z treści kursu, poza zadaniem
    public int getCountOfRandomNumber(int max) {
      Random random = new Random();
      int result = 0;
      int sum = 0;
      while (sum < max) {
          int temp = random.nextInt(10);
          System.out.println("Liczba losowa " + temp);
          sum = sum + temp;
          result++;
      }
      return result;
    }

    public static void main(String[] args) {
        RandomsFirst obiekt1 = new RandomsFirst();
        int max = 30;
        int liczbaLosowan = obiekt1.getCountOfRandomNumber(max);
        System.out.println("Liczba losowań, po których zostanie przekroczony max: " + liczbaLosowan);
    }
}
