
public class SelectionSort {
    static int[] selectionSortAlgorithm(int[] arr) {

        int index, tmp;
        for (int i = 0; i < arr.length - 1; i++) {

            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }

            }
            tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 65, 27, 13, 23, 10 };
        arr = selectionSortAlgorithm(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

}