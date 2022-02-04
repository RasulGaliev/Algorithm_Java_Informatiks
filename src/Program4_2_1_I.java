import java.util.Scanner;

public class Program4_2_1_I
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        boolean flag1 = false;
        boolean flag2;
        int i, j;
        for(i = 0; !flag1 && i <= str2.length() - str1.length(); i++)
        {
            flag2 = true;
            for(j = 0; flag2 && j < str1.length(); j++)
                if(str1.charAt(j) != str2.charAt(j + i))
                    flag2 = false;
            if(flag2)
                flag1 = true;
        }

        if(flag1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}