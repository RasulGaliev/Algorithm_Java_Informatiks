//Задача №2950. Конец уроков
//Занятия начинаются в 9:00. Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут. Определите, когда заканчивается указанный урок.

import java.util.Scanner;

public class Program1_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        n = 9 * 60 + n * 45 + (n - (2 - n % 2)) / 2 * (5 + 15) + (n + 1) % 2 * 5;
        System.out.print(n / 60 + " " + n % 60);
        in.close();
    }
}