// Задача №322. Наиболее удаленная точка
// Выведите  координаты точки, наиболее удаленной от начала координат.

import java.util.Scanner;

public class Program4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x, y;
        int maxX = 0, maxY = 0;
        double l, maxLength = 0;
        for(int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            l = Math.sqrt(x * x + y * y);
            if(l > maxLength) {
                maxX = x;
                maxY = y;
                maxLength = l;
            }
        }
        System.out.print(maxX + " " + maxY);
    }
}
