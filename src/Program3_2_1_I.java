// Задача №3075. Номер числа Фибоначчи

import java.util.Scanner;

public class Program3_2_1_I{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n_1 = 0;
        int n_2 = 1;
        int tmp;
        for(int k = 2;true;k++){
            tmp = n_2;
            n_2 += n_1;
            n_1 = tmp;
            if(n_2 == n){
                System.out.print(k);
                break;
            }
            if(n_2 > n) {
                System.out.print(-1);
                break;
            }
        }
        in.close();
    }
}