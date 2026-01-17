import java.util.Arrays;

public class CopyArray_to_AnotherArray {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 1};

        int[] b = arr.clone();

        System.out.print("Copy of original Array : " + Arrays.toString(b));

    }
}
