// Перевести символ в верхний регистр

import java.util.Scanner;

public class Program4_2_1_B
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(c >= 'a' && c <= 'z')
            c -= 32;
        System.out.print(c);
        c = 0;

    }
}
