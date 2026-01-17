public class Count_0s_and_1s {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 1};

        int z = 0 , o = 0;

        for(int i : arr)
            if(i == 0)
                z++;
            else if(i == 1)
                o++;
            else{
                System.out.println("element is not  0 or 1");
            }
            System.out.println("Zeors : " +z);
            System.out.println("Ones : " + o);






    }
}
