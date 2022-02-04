import java.util.Scanner;

public class Program6_1_A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int minNumber = min(a, b, c, d);
        System.out.print(minNumber);
    }
    public static int min(int a, int b, int c, int d){
        if(a <= b && a <= c && a <= d)
            return a;
        else if(b <= a && b <= c && b <= d)
            return b;
        else if (c <= a && c <= b && c <= d)
            return c;
        else
            return d;
    }
}