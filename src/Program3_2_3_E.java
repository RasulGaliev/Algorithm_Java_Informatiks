// Задача №118. Обращение числа

import java.util.Scanner;

public class Program3_2_3_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        do{
            System.out.print(N % 10);
            N /= 10;
        }
        while(N != 0);
        in.close();
    }
}