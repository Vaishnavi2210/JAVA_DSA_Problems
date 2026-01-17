public class Check_Arrays_contain_only_0s_and_1s {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 5, 1, 1, 0, 0};
        boolean contains = true;
        for(int i : arr)
            if(i != 0   &&  i != 1){
                contains = false;
                break;
            }
        if(contains)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
