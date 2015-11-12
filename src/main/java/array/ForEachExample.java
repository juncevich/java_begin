package array;


public class ForEachExample {
    public static void main(String[] args) {
        int[] sampleForEach = new int[5];

        System.out.println("До foreach");
        for (int t: sampleForEach
             ) {
            System.out.println(t);
        }

        // Думаем, что происходит инициализация
        System.out.println();
        for (int t : sampleForEach) {
            t = 99;
        }

        // Для инициализации элементов foreach не подходит
        for (int i = 0; i < sampleForEach.length; i++) {
            sampleForEach[i] = 88;
        }
        System.out.println("После foreach");
        for (int t: sampleForEach
             ) {
            System.out.println(t);
        }
    }
}
