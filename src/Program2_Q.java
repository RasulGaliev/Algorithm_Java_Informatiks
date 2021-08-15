// Задача №264. Мороженое

import java.util.Scanner;

public class Program2_Q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k != 1 && k != 2 && k != 4 && k != 7)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

