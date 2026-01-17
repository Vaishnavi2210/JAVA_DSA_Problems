public class Find_Missing_Elements{
    public static void main(String[] args){

        int[] arr = {1,2,4,5};
        int n = arr.length + 1;   // n = 5  can you use direct also
        int sum  = n*(n+1)/2 ;

        for(int x : arr)
           sum = sum - x;
        System.out.println("Missing number is : "+ sum);

    }
}
