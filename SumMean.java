import java.util.Scanner;

// 1-D Array - Sum and Mean

/*
Given an array A[] of size N, containing positive integers. You need to print the sum and mean (floor value) of given numbers.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function:- SumAndMean() that takes the Array and the integer N as parameter.

Constraints:-
1 <= N <= 100
1 <= A[i] <= 100
Output
Print the Sum and the Mean of the array separated by a space.

Sample Input:
5
1 2 19 28 5

Sample Output:
55 11

*/

public class SumMean {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            SumArrayMean(arr, N);
        }
    }
    public static void SumArrayMean(int arr[], int N) {
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += arr[i];
        }
        int mean = Math.floorDiv(sum, N);

        System.out.print(sum+" "+mean);
    }
}
