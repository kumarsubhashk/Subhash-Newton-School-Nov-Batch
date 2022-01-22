import java.util.Scanner;
// 1-D Array - Increasing array
/*
Abhijit has an Array Arr which may or may not be in strictly increasing order. He wants to make this array increasing but does not wish to change the position of any element so he came with an idea that he will replace an element with any of its divisors i.e he changes an element X to M if X%M=0.

Your task is to tell whether the given array can be transformed to strictly increasing by performing the operation given above.
Input
First line of input contains the size of the array N. Next line of input contains N space- separated integers depicting the values of the array Arr.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print "YES" if the array can be transformed in the strictly increasing order else print "NO".
*/
public class IncreasingArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            IncreaseArray(arr, N);
        }
    }
    public static void IncreaseArray(int arr[], int N) {
        int temp = 2;
        for(int i=1; i<N; i++) {
            while(temp <= arr[i] && arr[i]%temp != 0) {
                temp++;
            }
            if(arr[i] < temp) {
                System.out.print("NO");
                return;
            }
            temp++;
        }
        System.out.print("YES");
    }
    
}
