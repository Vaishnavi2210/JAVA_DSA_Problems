public class Maximum_Exponent_of_2_in_Range {
    /*
    Given a and b, find the number in range[a, b] with the
    maximum power of 2 in its factorization.
    Input : a = 10, b = 15;     Output : 12
    ---------------------------------------------------------
 Dry Run:
| Number | Factorization | Power of 2 |
| ------ | ------------- | ---------- |
| 10     | 2 × 5         | 1          |
| 11     | prime         | 0          |
| 12     | 2 × 2 × 3     | **2**      |
| 13     | prime         | 0          |
| 14     | 2 × 7         | 1          |
| 15     | 3 × 5         | 0          |

*/
    public static void main(String[] args) {
        int a = 10, b = 15;

        int result = maxPowerOf2(a, b);
        System.out.println(result);

    }

    public static int maxPowerOf2(int a, int b){
        int maxPower = -1;
        int answer = a;

        for(int i = 1; i <= b; i++){
            int num = i;
            int count = 0;

            while(num % 2 == 0){
                count++;
                num /= 2;
            }
            if(count > maxPower){
                maxPower = count;
                answer = i;
            }
        }
        return answer;
    }
}
