import java.util.Scanner;

// 1-D Array - Replace element

/* 
Given an array of N elements, your task is to update every element with multiplication of previous and next elements with following exceptions:-
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.

See example for more clarity
Input
First line of input contains the size of array N, next line contains N space separated integers denoting values of array.

Constraints:-
2 < = N < = 100000
1 < = arr[i] < = 100000
Output
Print the modified array

*/

class Element{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            int previous = arr[0],current;
            arr[0] = arr[0]*arr[1];
            for(int i=1; i<N-1; i++) {
                current = previous;
                previous = arr[i];
                arr[i] = current * arr[i+1];
            }
            arr[N-1] = previous * arr[N-1];

            for(int i=0; i<N; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}