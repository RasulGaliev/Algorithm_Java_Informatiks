// Задача №3069. Количество элементов, которые больше предыдущего

import java.util.Scanner;

public class Program3_2_2_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a_1 = 0;
        int a_2;
        int n = -1;
        do {
            a_2 = in.nextInt();
            if(a_2 > a_1)
                n++;
            a_1 = a_2;
        }
        while (a_2 != 0);
        System.out.print(n);
        in.close();
    }
}