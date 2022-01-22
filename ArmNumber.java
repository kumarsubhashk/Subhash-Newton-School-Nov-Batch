import java.util.Scanner;

public class ArmNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number:->"); 
            int N = sc.nextInt();

            System.out.print(isArmNumber(N));
        }
    }
    public static boolean isArmNumber(int N) {
        int originalNumber = N;
        int result = 0;
        while(originalNumber != 0) {
            int rem = originalNumber%10;
            result += rem*rem*rem;
            originalNumber /= 10;
        }
        if(N == result) {
            return true;
        }
        return false;
    }
}
