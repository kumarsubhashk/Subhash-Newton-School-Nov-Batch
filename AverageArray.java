import java.util.Scanner;

// 1-D Array - Average me
/*
There are N trees in Terry's front yard. He is supposed to measures the height of each tree and find the average height of trees in his yard. What is the average height of a tree in Terry's front yard?

Note:- Print your answer as floor value (average height)
Input
The first line contains N: numbers of tree.
Then follows N lines represents the height of each tree.

Constraint:-
1 <= n <= 100000
1 <= a[i] <= 100000
Output
Print the average height of all the trees in the yard

Input
5
6
8 
34 
9 
3

Output
12

Explanation:-
Sum of heights =60
Average of heights =60/5

*/

public class AverageArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            averageHeight(arr, N);
        }
    }
    public static void averageHeight(int arr[], int N) {
        int average = 0;
        for(int i=0; i<N; i++) {
            average += arr[i];
        }
        System.out.print(Math.floorDiv(average, N));
    }
}
