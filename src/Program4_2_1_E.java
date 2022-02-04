import java.util.Scanner;

public class Program4_2_1_E
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        byte count = 1;
        for(int i = 0; i != str.length() - 1; i++)
            if(str.charAt(i) == ' ')
                count++;
        System.out.print(count);
    }
}
