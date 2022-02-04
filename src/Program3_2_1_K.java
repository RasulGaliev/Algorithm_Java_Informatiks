// Задача №3082. Исполнитель Водолей

import java.util.Scanner;

public class Program3_2_1_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        int min, max;
        int S;
        String min_str, max_str;
        if(A >= B){
            max = A;
            min = B;
            max_str = "A";
            min_str = "B";
        }
        else {
            max = B;
            min = A;
            max_str = "B";
            min_str = "A";
        }
        if(N > max)
            System.out.print("Impossible");
        else if(N == A)
            System.out.print(">A");
        else if(N == B)
            System.out.print(">B");
        else if(N == max % min){
            S = max;
            System.out.print(">" + max_str + "\n");
            while(S != N){
                System.out.print(max_str + ">" + min_str + "\n");
                System.out.print(min_str + ">" + "\n");
                S -= min;
            }
        }
        else if(N == min - max % min){
            S = 0;
            while(S < max){
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
        }
        else if(N % min == 0 && ((max - N) %  min != 0 || N <= max / 2)) {
            S = 0;
            while(S != N){
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
        }
        else if((max - N) %  min == 0) {
            S = max;
            System.out.print(">" + max_str + "\n");
            while(S != N){
                System.out.print(max_str + ">" + min_str + "\n");
                System.out.print(min_str + ">" + "\n");
                S -= min;
            }
        }
        else if((N - (min - max % min)) %  min == 0) {
            S = 0;
            while(S < max){
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
            System.out.print(max_str + ">" + "\n");
            System.out.print(min_str + ">" + max_str + "\n");
            S = min - max % min;
            while(S != N){
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }

        }
        /*else if((N - max % min) %  min == 0) {
            S = max;
            System.out.print(">" + max_str + "\n");
            while (S != N) {
                System.out.print(max_str + ">" + min_str + "\n");
                System.out.print(min_str + ">" + "\n");
                S -= min;
            }
            S = max % min;
            while (S != N) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
        }*/
        else if((max - (min - max % min)) %  min == N) {
            S = 0;
            while(S < max) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
            S = max - (min - max % min);
            System.out.print(max_str + ">" + "\n");
            System.out.print(min_str + ">" + max_str + "\n");
            while (S >= N) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S -= min;
            }
        }
        /// не додел
        else if((max - (min - max % min)) %  min == N % min) {
            S = 0;
            while(S < max) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S += min;
            }
            S = max - (min - max % min);
            System.out.print(max_str + ">" + "\n");
            System.out.print(min_str + ">" + max_str + "\n");
            while (S > 0) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S -= min;
            }
            S = max - (min - max % min);
            System.out.print(max_str + ">" + "\n");
            System.out.print(min_str + ">" + max_str + "\n");
            while (S > 0) {
                System.out.print(">" + min_str + "\n");
                System.out.print(min_str + ">" + max_str + "\n");
                S -= min;
            }
        }
        else
            System.out.print("Impossible");
    }
}