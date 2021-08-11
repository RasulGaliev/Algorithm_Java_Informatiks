//Задача №2938. Дележ яблок - 1
//N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?

import java.util.Scanner;

public class Program1_C{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int N = in.nextInt();
                int K = in.nextInt();
                System.out.print(K / N);
                in.close();
        }
}
