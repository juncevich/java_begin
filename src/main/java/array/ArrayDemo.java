package array;


public class ArrayDemo {
    public static void main(String[] args) {
        int[] demo = new int[10];
        // Переменная доступна и там значение 0
        for (int i = 0; i < demo.length; i++) {
            System.out.println(demo[i]);
            // Присваиваем ей другое значение
            demo[i] = 10 * (i+1);
        }

        for (int i = 0; i < demo.length; i++) {
            System.out.println(demo[i]);
        }
    }
}
