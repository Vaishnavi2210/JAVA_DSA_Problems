public class Palindrome_String {
    /*
        Check if string is a palindrome.
        Input : str = "level";
        output : Yes
     */

  public static boolean isPalindrome() {
      String str = "level";
      String rev = "";

          if (str.length() == 0) {
              System.out.println("Empty String");

          }

          for(int i = 0; i < str.length(); i++) {
              rev = str.charAt(i)+rev;
          }
          return rev.equals(str);
  }
      public static void main(String[] args){
          if(isPalindrome()){
              System.out.println("String is Palindrome");
          } else{
              System.out.println("String is Not palindrome");
          }
      }
}
