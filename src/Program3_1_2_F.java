// Задача №338. Переверни число

import java.util.Scanner;

public class Program3_1_2_F{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = 0;
        while(x != 0){
            n = n * 10 + x % 10;
            x /= 10;
        }
        System.out.print(n);
        in.close();
    }
}
