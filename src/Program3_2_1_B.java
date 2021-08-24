// Задача №3058. Минимальный делитель

import java.util.Scanner;

public class Program3_2_1_B{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = 2;
        while(true){
            if(n % j == 0)
                break;
            j++;
        }
        System.out.print(j);
        in.close();
    }
}