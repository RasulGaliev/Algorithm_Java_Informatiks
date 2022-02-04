import java.util.Scanner;

public class Program4_2_1_G
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag = true;
        for(int i = 0; flag && i <= str.length() / 2; i++)
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                flag = false;
        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}