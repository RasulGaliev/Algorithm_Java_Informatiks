// Задача №117. Двоичная запись

import java.util.Scanner;

public class Program3_2_3_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        do{
            System.out.print(N % 2);
            N /= 2;
        }
        while(N != 0);
        in.close();
    }
}