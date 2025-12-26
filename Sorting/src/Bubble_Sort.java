public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 1, 3, 5, 9, 6, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}
