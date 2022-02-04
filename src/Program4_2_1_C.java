// Изменить регистр символа

import java.util.Scanner;

public class Program4_2_1_C
{
    static char change(char c, boolean flag)
    {
        if(flag)
           c -= 32;
        else
            c += 32;
        return c;
    }

    static boolean IsAlpha(char c) {
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        boolean flag = (c >= 'a' && c <= 'z');
        if(IsAlpha(c))
            c = change(c, flag);
        System.out.print(c);
    }
}
