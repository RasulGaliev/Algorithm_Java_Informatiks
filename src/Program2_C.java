// Задача №2960. Тестирующая система

import java.util.Scanner;

public class Program2_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a != 1 &&  b != 1 || a == 1 &&  b == 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
