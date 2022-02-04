import java.util.Scanner;

public class Program4_2_1_D
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(str1.equals(str2))
            System.out.print("yes");
        else
            System.out.print("no");
    }
}