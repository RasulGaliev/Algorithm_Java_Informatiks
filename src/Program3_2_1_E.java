// Задача №3061. Двоичный логарифм

import java.util.Scanner;

public class Program3_2_1_E{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        int k = 0;
        while(true){
            if(s >= n){
                System.out.print(k);
                break;
            }
            s *= 2;
            k++;
        }
        in.close();
    }
}