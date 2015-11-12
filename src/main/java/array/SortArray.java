package array;


public class SortArray {
    public static void main(String[] args) {
        int[] sampleSort = {12,56,7,34,89,43,23,9};

        boolean changed = true;

        while (changed){
            changed=false;
            for (int i = 0; i < sampleSort.length-1; i++) {
                if (sampleSort[i] > sampleSort[i+1]){
                    int tmp = sampleSort[i];
                    sampleSort[i]=sampleSort[i+1];
                    sampleSort[i+1] = tmp;
                    changed = true;
                }
            }

        }
        for (int chislo: sampleSort) {
            System.out.println(chislo);
        }
    }
}
