import java.util.Scanner;

// Find last word of length

class LastWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = str.length();

            LengthOfLastWord(str, n);
        }
    }
    public static void LengthOfLastWord(String str, int n){
        int last = 0;
        int first = 0;
        for(int i=n-1; i>0; i--) {
            if(str.charAt(i) == ' ' && last == 0) {
                continue;
            }
            else if (last != 0 && first == 0) {
                if(str.charAt(i) == ' ') {
                    first = i + 1;
                }
            }
            if (last == 0) {
                last = i;
            }
        }
        int result = last - first + 1;
        System.out.println(result);
    }
}