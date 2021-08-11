//Задача №2942. Число десятков двузначного числа
// Дано двузначное число. Найдите число десятков в нем.
import java.util.Scanner;
public class Program1_F{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        System.out.print(n % 10);
        in.close();
    }
}
