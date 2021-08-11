//Задача №2945. Следующее четное
//Дано целое число n. Выведите следующее за ним четное число.

import java.util.Scanner;
public class Program1_J{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        System.out.print(n + (2 - n % 2));
        in.close();
    }
}
