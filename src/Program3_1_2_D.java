// Задача №336. Цифра в числе

import java.util.Scanner;

public class Program3_1_2_D{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int d = in.nextInt();
        int n = 0;
        while(x != 0){
            if (x % 10 == d)
                n++;
            x /= 10;
        }
        System.out.print(n);
        in.close();
    }
}
