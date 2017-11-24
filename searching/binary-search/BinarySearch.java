class BinarySearch {
  public static void main(String[] args) {
    System.out.println(search(new int[] {-1, 0, 4, 7, 9, 17, 23, 47, 57, 107}, 17));
  }

  static int search(int[] a, int x) {
    int beg = 0;
    int end = a.length;
    
    while(beg < end) {
      int mid = (beg + end) / 2;

      if(x < a[mid]) end = mid;
      else if (x > a[mid]) beg = mid + 1;
      else return mid;
    }

    return -1;
  }
}