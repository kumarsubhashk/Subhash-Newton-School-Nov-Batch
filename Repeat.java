// 1-D Array - Is this repeated?
/*
Given an array A of N integers, find whether there exists three consecutive same integers in the array.
Input
The first line of the input contains an integer N.
The second line contains N space separated integers of the array A.

Constraints
3 <= N <= 1000
1 <= A[i] <= 100
Output
Output "Yes" if there exists three consecutive equal integers in the array, else output "No" (without quotes).

Sample Input
5
1 2 2 2 4

Sample Output
Yes

Explanation: The segment [2, 2, 2] follows the criterion.
*/

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            threeConsecutiveArray(arr, N);
        }
    }
    public static void threeConsecutiveArray(int arr[], int N) {
        for(int i=0; i<N; i++) {
            
            if(arr[i]==arr[i+1] && arr[i+1]==arr[i+1]) {
                System.out.print("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    
}
