import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Second_Largest_by_position {
   /*
      Give an array:
        - find second largest element from even position.
        - find second smallest element from odd position.
        - return their sum.
        Input : arr = {3,9,5,2,8,1}     Output : 7
   */
    public static void main(String[] args) {
      int[] arr = {3, 9, 5, 2, 8, 1};

      ArrayList<Integer> even = new ArrayList<>();
      ArrayList<Integer> odd = new ArrayList<>();

      for(int i = 0; i < arr.length; i++){
          if(i % 2 == 0){
              even.add(arr[i]);
          }else{
              odd.add(arr[i]);
          }
      }

      Collections.sort(even);
      Collections.sort(odd);

      int secondLargestEven = even.get(even.size()-2);
      int secondsmallestOdd = odd.get(1);

      System.out.println(secondLargestEven +  secondsmallestOdd);


    }
}
