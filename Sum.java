import java.util.Scanner;

// 1-D Array - Alternate Sum product
/*
Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places.

Note:- Consider the first element to start from 1.
Input
The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 50
1 <= Arr[i] <= 5
Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.

Sample Input:-
5
1 2 3 4 5

Sample Output:-
6 15

Explanation:-
Sum = 2 + 4
Product = 1*3*5
*/

public class Sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            alternateSumArray(arr, N);
        }
    }
    public static void alternateSumArray(int arr[], int N) {
        int sum = 0;
        int product = 1;
        for(int i=0; i<N; i++) {
            if(i%2 != 0) {
                sum += arr[i];
            }
            else if(i%2 == 0) {
                product *= arr[i];
            }
        }
        System.out.print(sum+" "+product);
    }
    
}
