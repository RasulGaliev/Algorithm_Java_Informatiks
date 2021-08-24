// Задача №3062. Утренняя пробежка

import java.util.Scanner;

public class Program3_2_1_F{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        int k = 1;
        while(true){
            if(x >= y){
                System.out.print(k);
                break;
            }
            x *= 1.1;
            k++;
        }
        in.close();
    }
}