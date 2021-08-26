// Задача №3077. Максимальное число идущих подряд равных элементов

import java.util.Scanner;

public class Program3_2_2_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b = 0;
        int n = 0;
        int max = 0;
        do {
            a = in.nextInt();
            if(a  !=  b){
                b = a;
                if(n > max)
                    max = n;
                n = 1;
            }
            else
                n++;
        }
        while (a != 0);
        System.out.print(max);
        in.close();
    }
}
