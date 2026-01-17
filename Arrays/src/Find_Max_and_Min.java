public class Find_Max_and_Min {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 8, 0, 9, 7};

        int max = arr[0];
        int min = arr[0];

        for (int i : arr){
            if (i > max)
                max = i;

            if( i < min)
                min = i;
       }
        System.out.println("Maximum no. of Array : " + max);
        System.out.println("Minimum no. of Array : " + min);
    }
}
