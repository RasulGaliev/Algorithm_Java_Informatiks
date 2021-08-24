// Задача №3059. Список степеней двойки

import java.util.Scanner;

public class Program3_2_1_C{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        while(true){
            if(s > n)
                break;
            System.out.print(s + " ");
            s *= 2;
        }
        in.close();
    }
}