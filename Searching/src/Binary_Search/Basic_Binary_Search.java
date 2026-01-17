package Binary_Search;

public class Basic_Binary_Search {
    // Binary Search is a searching technique used
    // to find an element in a sorted array by repeatedly dividing the search space into half.
   //  Binary search works on sorted arrays and reduces the search space by half in each step, which gives it a time complexity of O(log n)
    // -- Binary Search works only on SORTED arrays
    /*
     If the array is not sorted:  Binary Search ❌    Use Linear Search ✅

    Why it is called "Binary" ? --> “Binary” means two - In every step, the array is divided into two halves

    How Binary Search Works ?  --> low → start index,  high → end index

    --> 1. Take the middle element       ---      mid = (low + high) / 2
        2. Compare it with the target    ---      check arr[mid] == target ✅      found
        3. If equal → element found      ---      return found
        4. If target is smaller → search left half -  arr[mid] > target ✅  -->  Search left  and   high = mid - 1;
        5. If target is larger → search right half -  arr[mid] < target ✅  -->  Search right and   low = mid + 1;
        6. Repeat until found or array becomes empty

/Time-Complexity :
Case	      Explanation	                             Complexity
Best Case	   Target is at mid in first step	          O(1)
Worst Case	   Target is at one end or not present	      O(log n)
Average Case   Target somewhere in the middle	          O(log n)

/Space-Complexity :
Iterative version (like above) → O(1) (no extra memory used)
Recursive version → O(log n) because of recursive stack

/Instant shortcut table
    Algorithm / Pattern	Shortcut Complexity Reasoning

    Binary Search Input halves each step            → O(log n)     ex: 16 -> 8 -> 4 -> 2 -> 1
    While loop:n = n/2 Input halves each step       → O(log n)
    Single for loop	Visits all n elements           → O(n)
    Nested loops	Every element paired            → O(n²)

*/

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target) {
                 low = mid + 1;
            }
            else {
            high = mid - 1;
            }
        }

      return -1;
    }

   public static void main(String[] args) {
       int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
       int target = 20;

     int index =  binarySearch(arr, target);

     if(index != -1){
         System.out.println("Target found at index " + index);
     }else{
         System.out.println("Target not found");
     }

   }

}
