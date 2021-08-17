// Задача №353. Сумма степеней

import java.util.Scanner;

public class Program3_1_1_H{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        int p = 2;
        for(int i = 0; i < n; i++){
            sum += p;
            p *= 2;
        }
        System.out.print(sum);
        in.close();
    }
}