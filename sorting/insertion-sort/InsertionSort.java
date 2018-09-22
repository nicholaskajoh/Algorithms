import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {5, 4, 0, 3, 1, 2};
        int[] sorted = sort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j > -1 && a[j + 1] < a[j]) {
                a[j + 1] = a[j];
                a[j] = key;
                j--;
            }
        }
        return a;
    }
}