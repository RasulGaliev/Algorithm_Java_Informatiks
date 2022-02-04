import java.util.Scanner;

public class Program5_1_K
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int number = size;
        int[] array = new int[size ];
        for(int i = 0; i < size ; i++)
            array[i] = in.nextInt();
        for(int i = 1; i < size ; i++)
            if(array[i] == array[i - 1])
                number--;
        System.out.println(number);
    }
}