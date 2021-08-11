//Задача №2943. Число десятков
//Дано неотрицательное целое число. Найдите число десятков в его десятичной записи
import java.util.Scanner;
public class Program1_H{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        System.out.print(n % 100 / 10);
        in.close();
    }
}
