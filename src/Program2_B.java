//Задача №253. Високосный год
// Требуется определить, является ли данный год високосным. (Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)

import java.util.Scanner;

public class Program2_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 400 != 0 && n % 100 == 0 || n % 4 != 0)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
}
