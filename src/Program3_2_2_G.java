// Задача №3070. Второй максимум

import java.util.Scanner;

public class Program3_2_2_G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int max_1 = 0;
        int max_2 = 0;
        int tmp;
        do {
            a = in.nextInt();
            if(a > max_2)
                max_2 = a;
            if(max_2 > max_1) {
                tmp = max_1;
                max_1 = max_2;
                max_2 = tmp;
            }

        }
        while (a != 0);
        System.out.print(max_2);
        in.close();
    }
}