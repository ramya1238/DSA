package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = { 7, 8, 3, 1, 2 }, temp;

        // for (int i = 1; i < a.length; i++) {
        //     int current = a[i];
        //     int j = i - 1;
        //     while (j >= 0 && current < a[j]) {
        //         a[j + 1] = a[j];
        //         j--;
        //     }

        //     a[j + 1] = current;
        // }

        for (int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
