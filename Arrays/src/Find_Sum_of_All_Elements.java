public class Find_Sum_of_All_Elements {
    public static void main(String[] args) {

        int[] arr = {2,4,6,3,5,9,1};
        int sum = 0;
        for(int i : arr){
          sum += i;
        }
        System.out.println("Sum of all elements are :"+sum);
    }
}
