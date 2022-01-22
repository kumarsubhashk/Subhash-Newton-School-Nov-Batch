import java.util.*; // contains Collections framework

class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            while(N > 9) {
                int p = N;
                int sum = 0;
                while(p > 0){
                    sum += p%10;
                    p /= 10;
                }
                N = sum;   
            }  
            System.out.print(N);
        }     
    }
}