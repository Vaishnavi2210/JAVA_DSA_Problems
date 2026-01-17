import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int num = sc.nextInt();

        System.out.println("Original number : " + num);
        int temp = num;
        int rev = 0;
        while(temp!=0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Reversed number : " + rev);
        if(rev == num){
            System.out.println("Palindrome number");
        } else{
            System.out.println("Not Palindrome number");
        }

    }
}
