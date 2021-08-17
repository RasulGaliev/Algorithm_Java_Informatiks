// Задача №120. 1/0!+1/1!+1/2!+...

import java.util.Scanner;

public class Program3_1_1_I{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 1;
        double q = 1;
        for(int i = 1; i <= n; i++) {
            q *= i;
            sum += 1 / q;
        }
        System.out.print(sum);
    }
}
