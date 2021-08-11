//Задача №2940. МКАД
//Длина Московской кольцевой автомобильной дороги —109 километров. На какой отметке байкер остановится через t часов?

import java.util.Scanner;

public class Program1_E{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int t = in.nextInt();
        int s = 109;
        int k;
        if (v >= 0)
            k = (v * t) % s;
        else
            k = s - (-v * t) % s;
        if(k == 109)
            k = 0;
        System.out.print(k);
        in.close();
    }
}
