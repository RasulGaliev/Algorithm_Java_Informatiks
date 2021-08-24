// Задача №3076. Исполнитель Раздвоитель

import java.util.Scanner;

public class Program3_2_1_J{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        while(k != n){
            if (n % 2 == 0 && 2 * k <= n){
                n /= 2;
                System.out.print(":2" + "\n");
            }
            else{
                n--;
                System.out.print("-1" + "\n");
            }
        }
        in.close();
    }
}