public class Fibonacci_Recursive {
    /*
        Return the nth Fibonacci number.
        Input n = 6    Output = 8
     */
    public static void printFibonacci(int n){
        int a =  0;
        int b = 1;

        System.out.println(a + " " + b + " ");

        for(int i = 2; i < n; i++){
           int c = a+b;
           System.out.print(c + " ");
           a=b;
           b=c;
        }
    }

    public static void main(String[] args) {


    }
}
