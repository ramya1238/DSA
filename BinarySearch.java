class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 45, 50, 60, 70, 80, 90 };
        int n = arr.length;
        int low = 0, high = n - 1, mid, value=70;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == value) {
                System.out.println(mid);
            }
            if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("executed");
    }
}