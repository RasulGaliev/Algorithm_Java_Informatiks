// Задача №340. Делители числа

import java.util.Scanner;

public class Program3_1_2_H{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int i;
        for(i = 1; i <= x; i++)
            if(x % i == 0)
                System.out.print(i + " ");
        in.close();
    }
}