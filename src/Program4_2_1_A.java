//Задача №102. Проверить, является ли символ цифрой
// Напишите функцию boolean IsDigit(char c) (Java), определяющую, является ли данный символ цифрой или нет

import java.util.Scanner;

public class Program4_2_1_A{
    static boolean IsDijit(char c) {
        if(c >= '0' && c <= '9')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(IsDijit(c))
            System.out.print("yes");
        else
            System.out.print("no");
        in.close();
    }
}