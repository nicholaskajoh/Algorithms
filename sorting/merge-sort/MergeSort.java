import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = {5, 4, 0, 3, 1, 2, 9};
        int[] sorted = sort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] sort(int[] a) {
        int n = a.length;

        if(n == 1) return a;

        int mid = Math.round((float) n / 2);
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, n);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    static int[] merge(int[] a, int[] b) {
        int nA = a.length, nB = b.length;
        int[] m = new int[nA + nB];

        int i = 0, j = 0, k = 0;

        while (i < nA && j < nB) {
            if (a[i] < b[j]) {
                m[k] = a[i];
                i++;
            } else {
                m[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < nA) {
            m[k] = a[i];
            i++;
            k++;
        }

        while (j < nB) {
            m[k] = b[j];
            j++;
            k++;
        }

        return m;
    }
}