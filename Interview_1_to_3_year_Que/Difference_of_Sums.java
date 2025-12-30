public class Difference_of_Sums {
    /*
       Given two numbers n and m, calculate the sum of all multiples of n or
       m below some limit or sum of numbers in some pattern, so that for n=4, m=10 the output is 22.
       Return sum1 - sum2.
       n = 4, m = 10 → output = 22
     */
    public static void main(String[] args) {
       int n = 4;
       int m = 10;
       //int sum = 0;
        int sum1 = 0, sum2 =0;

        for(int i =1; i<= m; i++){
          /*  if(i % n ==0 || i % m == 0){
               sum += i;
              }
          */
           if(i % n == 0){
               sum1 = sum1 + i;
           }
           sum2 = sum2 + i;if(i % m == 0){
               sum2 = sum2+ i;
            }
       }
       // System.out.println(" Output "+ sum);
        System.out.println(sum1 + sum2); // 22  correct output
        System.out.println(sum1 - sum2);  // 2  wrong output
    }
}
