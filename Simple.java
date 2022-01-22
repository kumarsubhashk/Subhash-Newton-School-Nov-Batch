import java.util.Scanner;

// 1-D Array - Simple Arrangement
/*
Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].

Make sure you don't use extra memory than array itself.
Input
The first line of the input contains a number n, the number of integers in the array.
The second line of the input contains n numbers, the elements of A.

Constraints
1 <= n <= 100000
0 <= A[i] <= n-1
Output
Output the required array of n integers.

Sample Input
5
4 2 3 0 1 

Sample Output
1 3 0 4 2
*/

public class Simple {
    private static final String STRING = " ";
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            SimpleArrangement(arr,N);
        }
    }
    public static void SimpleArrangement(int arr[], int N) {
        
        for(int i=0; i<N; i++) {
            System.out.print(arr[arr[i]]+STRING);
        }
    }
}
