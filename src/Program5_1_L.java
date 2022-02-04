import java.util.Scanner;

public class Program5_1_L
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size ];
        int i;
        for(i = 0; i < size ; i++)
            array[i] = in.nextInt();
        int height = in.nextInt();
        for(i = 0; i < size && array[i] >= height; i++);
        System.out.println(i + 1);
    }
}