import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            printPattern(N);
        }
    }
    public static void printPattern(int N) {
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
