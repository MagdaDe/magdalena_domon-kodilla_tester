public class SimpleArray {
    public static void main(String[] args) {
        String[] paralotnie = new String[5];
        paralotnie[0] = "Nova Mentor 4";
        paralotnie[1] = "Dudek Nemo 2";
        paralotnie[2] = "Ozone Delta 3";
        paralotnie[3] = "Niviuk Hook 5";
        paralotnie[4] = "Advance Sigma 10";

        String paralotnia = paralotnie[3];
        System.out.println(paralotnia);

        int numberOfElements = paralotnie.length;
        System.out.println("Lista paralotni zawiera " + numberOfElements + " modeli.");
    }
}