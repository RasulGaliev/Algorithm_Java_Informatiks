// Задача №334. Остаток

import java.util.Scanner;

public class Program3_1_2_B{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        for(int i = a; i <= b; i++)
            if(i % d == c)
                System.out.print(i + " ");
        in.close();
    }
}   
