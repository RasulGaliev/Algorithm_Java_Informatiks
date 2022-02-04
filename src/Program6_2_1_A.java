import java.util.Scanner;

public class Program6_2_1_A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        short N = in.nextShort();
        if(recursion(N))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
    public static boolean recursion(short N){
        if(N % 5 == 1 || N % 3 == 1)
            return true;
        N -= 5;
        if(N < 1)
            return false;
        return recursion(N);
    }
}