//Задача №2952. Разность времен
//Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из моментов времени. Определите, сколько секунд прошло между двумя моментами времени.

import java.util.Scanner;

public class Program1_P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        int c =  in.nextInt();
        int s = a * 3600 + b * 60 + c;
        a =  in.nextInt();
        b =  in.nextInt();
        c =  in.nextInt();
        System.out.print(a * 3600 + b * 60 + c - s);
        in.close();
    }
}