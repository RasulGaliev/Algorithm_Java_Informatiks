// Задача №3082. Исполнитель Водолей

import java.util.Scanner;

public class Program3_2_1_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();

        if(A == N)
            System.out.print(">A" + "\n");
        else if(B == N)
            System.out.print(">B" + "\n");
        else if(A < N && N < B && N % A == 0 && (N <= B / 2 || B % A != 0)){
            int S = 0;
            while(S != N){
                System.out.print(">A" + "\n");
                System.out.print("A>B" + "\n");
                S += A;
            }
        }
        else if(A < N && N < B && (B % A == 0 || (B - N) % A == 0)) {
            int S = B;
            System.out.print(">B" + "\n");
            while(S - A != N){
                System.out.print("B>A" + "\n");
                //System.out.print("A>" + "\n");
                S -= A;
            }
            System.out.print("B>A");
        }

        else if(B < N && N < A && N % B == 0 && (N <= A / 2 || A % B != 0)) {
            int S = 0;
            while(S != N){
                System.out.print(">B" + "\n");
                System.out.print("B>A" + "\n");
                S += B;
            }
        }
        else if(B < N && N < A && (A % B == 0 || (A - N) % B == 0)){
            int S = A;
            System.out.print(">A" + "\n");
            while(S - B != N){
                System.out.print("A>B" + "\n");
                //System.out.print("B>" + "\n");
                S -= B;
            }
            System.out.print("A>B");
        }
        else if(N < A && A < B && A - B % A == N){
            int S = 0;
            while(S < B) {
                System.out.print(">A" + "\n");
                System.out.print("A>B" + "\n");
                S += A;
            }
        }
        else if(N < B && A > B && B - A % B == N){
            int S = B;
            while(S < A){
                System.out.print(">B" + "\n");
                System.out.print("B>A" + "\n");
                S += B;
            }
        }
        else if(N < A && A < B && B % A == N){
            int S = A;
            System.out.print(">B" + "\n");
            while(S + A < B){
                System.out.print("B>A" + "\n");
                //System.out.print("A>" + "\n");
                S += A;
            }
            System.out.print("B>A");
        }
        else if(A > B && B > N && A % B == N){
            int S = B;
            System.out.print(">A" + "\n");
            while(S + B < A) {
                System.out.print("A>B" + "\n");
                //System.out.print("B>" + "\n");
                S += B;
            }
            System.out.print("A>B");
        }
        else
            System.out.print("Impossible");
        in.close();
    }
}