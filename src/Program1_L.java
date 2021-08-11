//Задача №2948. Электронные часы - 2
//Количество минут и секунд при необходимости дополняются до двузначного числа нулями.

import java.util.Scanner;
public class Program1_L{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        n %= 86400;
        System.out.print(n / 3600 + ":" + n % 3600 / 600 + n % 3600 / 60 % 10  + ":" + n % 60 / 10 + n % 60 % 10);
        in.close();
    }
}

