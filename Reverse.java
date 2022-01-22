import java.util.Scanner;
/*
Given a number, you task is to reverse its digits. If the reversed number contains 0s in the beginning, you must remove them as well.
Input
First line consists of a single integer denoting n.

Constraint:-
1<=size of n<=100
Output
Output is a single line containing reversed number n.

Sample Input
123445

Sample Output
544321

*/

public class Reverse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();

            reverse(num);
        }
    }
    public static void reverse(int num) {

        StringBuffer str = new StringBuffer(String.valueOf(num));
        str.reverse();
        num = Integer.parseInt(String.valueOf(str));
        System.out.println(num);
    }
}
