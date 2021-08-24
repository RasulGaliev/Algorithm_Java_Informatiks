// Задача №3074. Числа Фибоначчи

import java.util.Scanner;

public class Program3_2_1_H{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n_1 = 0;
        int n_2 = 1;
        int tmp;
        for(int i = 1; i < n; i++){
            tmp = n_2;
            n_2 += n_1;
            n_1 = tmp;
        }
        System.out.print(n_2);
        in.close();
    }
}