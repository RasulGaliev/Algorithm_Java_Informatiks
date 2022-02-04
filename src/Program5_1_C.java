import java.util.Scanner;

public class Program5_1_C
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for(int i = 0; i < n; i++)
            if(array[i] > 0)
                count++;
        System.out.println(count);

    }
}
