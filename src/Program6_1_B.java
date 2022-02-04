import java.util.Scanner;

public class Program6_1_B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double result = power(a, n);
        System.out.print(result);
    }
    public static double power(double a, int n){
        double result = 1;
        for(int i = 0; i < n; i++)
            result *= a;
        return result;
    }
}
