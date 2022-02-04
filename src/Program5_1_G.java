import java.util.Scanner;

public class Program5_1_G
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for(int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        for(int i = 0; i < n; i++)
            System.out.println(array[i]);
    }
}