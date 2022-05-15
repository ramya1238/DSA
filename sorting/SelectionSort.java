package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 7, 8, 3, 1, 2 }, temp;


        //time complexity-O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
