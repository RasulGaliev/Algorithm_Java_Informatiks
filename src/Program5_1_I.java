import java.util.Scanner;

public class Program5_1_I
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        temp = array[n - 1];
        for(int i = 1; i < n; i++)
            array[n - i] = array[n - i - 1];
        array[0] = temp;
        for(int i = 0; i < n; i++)
            System.out.println(array[i]);
    }
}