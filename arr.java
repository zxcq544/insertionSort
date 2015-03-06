import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i;
            for (; j > 0 && arr[j - 1] > key; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = key;
        }
    }
}
