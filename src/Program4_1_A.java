// Задача №1433. Кролики
// Пусть есть n клеток и m зайцев. Найти максимальное количество зайцев, которое гарантированно окажется в одной клетке.

import java.util.Scanner;

public class Program4_1_A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double m = in.nextInt();
        int k;
        k = (int)Math.ceil(m / n);
        System.out.print(k);
        in.close();
    }
}