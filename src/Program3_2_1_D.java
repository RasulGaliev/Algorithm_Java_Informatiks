// Задача №3060. Точная степень двойки

import java.util.Scanner;

public class Program3_2_1_D{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        while(true){
            if(s == n){
                System.out.print("YES");
                break;
            }
            if(s > n){
                System.out.print("NO");
                break;
            }
            s *= 2;
        }
        in.close();
    }
}