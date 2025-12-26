import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 1, 3, 5, 9, 6, 8};

        quickSort(arr, 0, arr.length-1);

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low-1;

        // low value than pivot shift left side
        for (int j = low; j < high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // pivot set
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
