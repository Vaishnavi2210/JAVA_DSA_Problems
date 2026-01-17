import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print( arr[i] + " ");
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }
}
