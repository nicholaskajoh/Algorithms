class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[] {5, 7, 6, -1, 2, 3}, 2));
    }

    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}