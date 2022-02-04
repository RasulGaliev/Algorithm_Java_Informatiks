import java.util.Scanner;

public class Program5_1_E
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = false;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for(int i = 1; !flag && i < n; i++)
            flag = array[i] * array[i - 1] > 0;
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}