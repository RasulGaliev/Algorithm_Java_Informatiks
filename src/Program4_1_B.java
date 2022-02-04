//Задача №1466. Сумма от 1 до N

import java.util.Scanner;

public class Program4_1_B
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long sum;
        if(N > 0 && N % 2 == 0)
            sum = (1 + N) * (N / 2);
        else if(N > 0)
            sum = (1 + N) / 2 * N;
        else if(N % 2 == 0)
            sum = (1 - N) * (N / 2) + 1;
        else
            sum = (1 - N) / 2 * N + 1;
        System.out.print(sum);
        in.close();
    }

}
