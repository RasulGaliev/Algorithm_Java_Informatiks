// Задача №319. Геометрическая прогрессия

import java.util.Scanner;

public class Program3_1_1_E{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double sum = 1;
        double p = a;
        for(int i = 0; i < n; i++){
            sum += p;
            p *= a;
        }
        System.out.print(sum);
        in.close();
    }
}