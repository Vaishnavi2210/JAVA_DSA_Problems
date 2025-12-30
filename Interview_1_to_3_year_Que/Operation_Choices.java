public class Operation_Choices {
    public static void main(String[] args) {
        /*
        Give integers a, b and c.
        Return :
        1 -> a+b   2-> a-b   3-> a*b   4-> a/b
        Input: a=10; b=5, (c =3 -case)    Output: 50
         */

        int a = 10, b = 5, c = 3;



    }

    static int calculate(int a, int b, int c){
        switch(c){
            case 1: return a+b;
            case 2: return a-b;
            case 3: return a*b;
            case 4:
                if(b != 0) return a/b;
                else  throw new ArithmeticException("Divisible by 0");
            default:
                throw new IllegalArgumentException("Invalid operation "+ c);



        }
    }
}
