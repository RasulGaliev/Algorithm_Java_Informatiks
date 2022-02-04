import java.util.Scanner;

public class Program5_1_A
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for(int i = 0; i < n; i += 2)
            System.out.println(array[i]);
    }
}

