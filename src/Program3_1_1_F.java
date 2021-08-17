// Задача №320. Сумма - 1

import java.util.Scanner;

public class Program3_1_1_F{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1.0 / i / i;
        }
        System.out.print(sum);
        in.close();
    }
}