import java.util.Scanner;

public class Program4_2_1_H
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag = false;
        int i, j;
        for(i = 0; !flag && i < str.length(); i++)
            for(j = i + 1; j < str.length(); j++)
                if(str.charAt(i) == str.charAt(j))
                    flag = true;
        System.out.println(str.charAt(i - 1));
    }
}