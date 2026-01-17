public class SecondMax_of_Array {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 4, 8, 7, 9, 3};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > max){
                secondMax = max;
                max = i;
            }

            if(i > secondMax && i < max){
                secondMax = i;
            }
        }
        System.out.println("SecondMax of Array : " + secondMax);


    }
}
