// Задача №347. Ноль или не ноль

import java.util.Scanner;

public class Program3_1_2_O{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        boolean b = false;
        int k = 0, m = 0, n = 0;
        for(int i = 0; i < N; i++) {
            x = in.nextInt();
            if(x == 0) {
                b = true;
                break;
            }
        }
        if(b)
            System.out.print("YES");
        else
            System.out.print("NO");
        in.close();
    }
}