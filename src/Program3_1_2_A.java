// Задача №333. Четные числа
// Выведите (через пробел) все четные числа от a до b (включительно).

import java.util.Scanner;

public class Program3_1_2_A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = a; i <= b; i++)
            if(i % 2 == 0)
                System.out.print(i + " ");
        in.close();
    }
}