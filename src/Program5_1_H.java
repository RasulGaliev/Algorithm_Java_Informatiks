import java.util.Scanner;

public class Program5_1_H
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for(int i = 0; i < n / 2 * 2; i+= 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        for(int i = 0; i < n; i++)
            System.out.println(array[i]);
    }
}