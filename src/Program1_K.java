// Задача №2947. Электронные часы - 1
//Дано число n. С начала суток прошло n минут. Определите, сколько часов и минут будут показывать электронные часы в этот момент.

import java.util.Scanner;
public class Program1_K{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        n %= 1440;
        System.out.print(n / 60 + " " + n % 60);
        in.close();
    }
}
