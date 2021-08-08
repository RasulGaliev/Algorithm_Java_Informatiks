// Задача №3064. Длина последовательности
// Последовательность завершается числом 0. Вывести количество членов последовательности (не считая завершающего числа 0).

import java.util.Scanner;

public class Program3_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n = -1;
        do {
            a = in.nextInt();
            n++;
        }
        while (a != 0);
        System.out.print(n);
        in.close();
    }
}