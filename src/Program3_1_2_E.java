// Задача №337. Сумма цифр

import java.util.Scanner;

public class Program3_1_2_E{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int s = 0;
        while(x != 0){
            s += x % 10;
            x /= 10;
        }
        System.out.print(s);
        in.close();
    }
}