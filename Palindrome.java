import java.util.Scanner;

// Strings [Post Class] - Palindrome 
/*
Given a string S find minimum number of changes required to make the string palindrome. In a change you can change any index of the string to any character.
A palindrome is a string that remains the same if reversed.
Input
First and only line of input contains a string S.

Constraints
1 <= |S| <= 100000
S contains only lowercase letters
Output
Output a single integer which is the minimum number of changes required to make string palindrome.

sample input 1
abc

sample output 1
1

sample input 2
abcdef

sample output 2
3
*/

class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String str = sc.next();
            int n = str.length();

            minimumNumber(str, n);
        }
    }
    public static void minimumNumber(String str, int n) {
        int count = 0;
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}