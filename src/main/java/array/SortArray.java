package array;

/*
 * Пример сортировки массива методом пузырька
 */
public class SortArray {
    public static void main(String[] args) {
        int[] sampleSort = {12,56,7,34,89,43,23,9};
        // выставляем признак "обмена" переменных в true, чтобы начать цикл
        boolean changed = true;
        // цикл длится до тех пор, пока при проверке массива ни одного обмена не произошло
        while (changed){
            // Надеемся, что обмена данных не будет
            changed=false;
            // Проходим по всему массиву
            for (int i = 0; i < sampleSort.length-1; i++) {
                // Если впереди стоящее число больше, чем следующее - меняем
                // их местами и выставляем признак, что был обмен
                if (sampleSort[i] > sampleSort[i+1]){
                    // Производим обмен с использованием дополнительной переменной
                    int tmp = sampleSort[i];
                    sampleSort[i]=sampleSort[i+1];
                    sampleSort[i+1] = tmp;
                    // Выставляем признак обмена в true
                    changed = true;
                }
            }

        }
        // Выводим отсортрованный массив
        for (int chislo: sampleSort) {
            System.out.println(chislo);
        }
    }
}
