//Задача №2944. Сумма цифр
//Дано трехзначное число. Найдите сумму его цифр.

import java.util.Scanner;
public class Program1_I{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int s = 0;
        while(n != 0) {
            s += n % 10;
            n /= 10;
        }
        System.out.print(s);
        in.close();
    }
}
