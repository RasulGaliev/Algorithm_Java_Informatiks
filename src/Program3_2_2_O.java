// Задача №3081. Стандартное отклонение

import java.util.Scanner;

public class Program3_2_2_O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        double s;
        int summa = 0;
        int square = 0;
        int x;
        do{
            x = in.nextInt();
            summa += x;
            square += x * x;
            n++;
        }
        while(x != 0);
        s = (double)summa / n;
        System.out.print(Math.sqrt((square - 2 * summa * s + s * s * n) / (n - 1)));
        in.close();
    }
}