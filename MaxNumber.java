import java.util.Scanner;

/*Given an array A of size N (at least three), you need to find its first, second and third maximum elements.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.

Example -> Input => 1,4,2,4,5 => Output => 5,4,4 
*/

public class MaxNumber {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int T = sc.nextInt();
                while(T-->0) {
                    int N = sc.nextInt();
                    int arr[] = new int[N];
                    for(int i=0; i<N; i++) {
                        arr[i] = sc.nextInt();
                    }
                    int first, second, third;
                    third=first=second=Integer.MIN_VALUE;
                    for(int i=0; i<N; i++) {

                        if(arr[i] > first) {
                            third = second;
                            second = first;
                            first = arr[i];
                        }
                        else if(arr[i] > second) {
                            third = second;
                            second = arr[i];
                        }
                        else if(arr[i] > third) {
                            third = arr[i];
                        }
                    }
                    System.out.println(first+" "+second+" "+third);
                }
            }
        }
    }
