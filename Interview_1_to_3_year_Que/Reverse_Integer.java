import java.util.Scanner;

public class Reverse_Integer {
    /*
        Reverse the digit of an integer.
        Input : n = 320;  output: 23
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int num = sc.nextInt();
                               // int n = 320;
        int temp = num;
        int rev = 0;

        while( temp!= 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed number : " + rev);
    }
}
