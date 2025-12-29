public class ReverseArray {
    /*
 Problem:
 Given an integer array, reverse the array in-place.

 Example:
 Input  : [1, 2, 3, 4, 5]
 Output : [5, 4, 3, 2, 1]

 Approach:
 - Use two pointers: start and end
 - Swap elements while start < end

 Time Complexity: O(n)
 Space Complexity: O(1)
*/
    public static void main(String[] args ) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);
        for (int n : arr) {
            System.out.print(n + " ");

        }
    }
    public static void  reverse(int[] arr){
        int start = 0;                                   // for(int start =0, end = arr.length-1; start < end; start++, end--){}
        int  end = arr.length-1;
       while(start < end){
           int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

           start++;
           end--;
        }

    }

    }


   /*
 Test Cases:
 Input: [1,2,3,4,5] → Output: [5,4,3,2,1]
 Input: [10] → Output: [10]
 Input: [] → Output: []
*/








    // -----------------------------------------------------------------------------------------------

    // Testcases

    /*
    // ---------- Test Case 1: Normal case ----------
        int[] arr1 = {1, 2, 3, 4, 5};
        reverse(arr1);
        System.out.print("Test 1 (Normal): ");
        for (int n : arr1) System.out.print(n + " ");
        System.out.println();   // Expected: 5 4 3 2 1

        // ---------- Test Case 2: Single element ----------
        int[] arr2 = {10};
        reverse(arr2);
        System.out.print("Test 2 (Single): ");
        for (int n : arr2) System.out.print(n + " ");
        System.out.println();   // Expected: 10

        // ---------- Test Case 3: Empty array ----------
        int[] arr3 = {};
        reverse(arr3);
        System.out.print("Test 3 (Empty): ");
        for (int n : arr3) System.out.print(n + " ");
        System.out.println();   // Expected: (no output)

        // ---------- Test Case 4: Already reversed ----------
        int[] arr4 = {9, 8, 7};
        reverse(arr4);
        System.out.print("Test 4 (Already Reversed): ");
        for (int n : arr4) System.out.print(n + " ");
        System.out.println();   // Expected: 7 8 9

        // ---------- Test Case 5: Duplicate elements ----------
        int[] arr5 = {1, 2, 2, 3};
        reverse(arr5);
        System.out.print("Test 5 (Duplicates): ");
        for (int n : arr5) System.out.print(n + " ");
        System.out.println();   // Expected: 3 2 2 1
    }
}
     */



//
