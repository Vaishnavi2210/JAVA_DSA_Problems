import java.util.Arrays;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 8, 5, 7, 6, 9, 4};
        boolean sorted = true;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                sorted = false;
                break;
            }
        }

         if(sorted){
             System.out.println(" Sorted array : " + Arrays.toString(arr));
         }else{
             System.out.println(" Not sorted array : " + Arrays.toString(arr));
         }



    }
}
