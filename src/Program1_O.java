//Задача №2951. Стоимость покупки
//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.

import java.util.Scanner;

public class Program1_O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        int n =  in.nextInt();
        b = n * a * 100 + n * b;
        System.out.print(b / 100 + " " + b % 100);
        in.close();
    }
}