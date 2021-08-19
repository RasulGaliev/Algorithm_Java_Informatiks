// Задача №1430. ГНЧЭ-1

import java.util.Scanner;

public class Program3_1_2_S{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 0;
        int j = 1;
        while(j <= N){
            for(int i = 0; j <= N && i < n; i++, j++)
                System.out.print(n + " ");
            n++;
        }
        in.close();
    }
}