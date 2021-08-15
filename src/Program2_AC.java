// Задача №1451. Четные и нечетные числа

import java.util.Scanner;

public class Program2_AC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if ((A % 2 == 1 || B % 2 == 1 || C % 2 == 1) && (A % 2 == 0 || B % 2 == 0 || C % 2 == 0))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}