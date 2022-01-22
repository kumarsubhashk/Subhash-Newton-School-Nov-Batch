import java.util.Scanner;

// Strings [Post Class] - String Sum
/*
Given a number String S, Your task is to find the sum of the numbers.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Sum() that takes the String S as a parameter.

Constraints:-
1 <= |S| <= 1000

Note:- String will contain only numbers from 0-9.
Output
Return the sum of the string.

Sample Input:-
123

Sample Output:-
6

Sample Input:-
123456789

Sample Output:-
45

*/

public class SumString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            String str = sc.next();

            sumOfString(str);
        }
    }
    public static void sumOfString(String str) {

        int sum = 0;
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            
            if(Character.isDigit(ch[i])) {
                
                int a = Integer.parseInt(String.valueOf(ch[i]));
                sum += a;

            }
        }
        System.out.println(sum);
    }
}
