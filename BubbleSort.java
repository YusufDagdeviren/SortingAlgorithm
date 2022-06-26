public class BubbleSort {
    static int[] bubleSortAlgorithm(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 12, 15, 2, 4 };
        arr = bubleSortAlgorithm(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
