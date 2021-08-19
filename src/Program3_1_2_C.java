// Задача №335. Квадраты

import java.util.Scanner;

public class Program3_1_2_C{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = a; i <= b; i++)
            if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i)
                System.out.print(i + " ");
        in.close();
    }
}
