package array;


public class SumArray {
    public static void main(String[] args) {
        int[] sample = {12, 56, 7,34, 89,43, 23, 9};

        int summa = 0;

        for (int aSample : sample) {
            summa += aSample;
        }

        System.out.println("TOTAL: " + summa);
    }
}
