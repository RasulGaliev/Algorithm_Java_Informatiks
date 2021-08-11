//Задача №3116. Делаем срезы
//Сначала выведите третий символ этой строки.
//Во второй строке выведите предпоследний символ этой строки.
//В третьей строке выведите первые пять символов этой строки.
//В четвертой строке выведите всю строку, кроме последних двух символов.
//В пятой строке выведите все символы с четными индексами (считая, что индексация начинается с 0, поэтому символы выводятся начиная с первого).
//В шестой строке выведите все символы с нечетными индексами, то есть начиная со второго символа строки.
//В седьмой строке выведите все символы в обратном порядке.
//В восьмой строке выведите все символы строки через один в обратном порядке, начиная с последнего.
//В девятой строке выведите длину данной строки.

import java.util.Scanner;

public class Program4_2_2{
    static void Print1(String str){
        System.out.print(str.charAt(2) + "\n");
    }

    static void Print2(String str){
        System.out.print(str.charAt(str.length() - 2) + "\n");
    }

    static void Print3(String str){
        for(int i = 0; i < 5;i++)
            System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print4(String str) {
        for(int i = 0; i < str.length() - 2;i++)
            System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print5(String str) {
        for(int i = 0; i < str.length();i++)
            if(i % 2 == 0)
                System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print6(String str) {
        for(int i = 0; i < str.length();i++)
            if(i % 2 == 1)
                System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print7(String str) {
        for(int i = str.length() - 1; i >= 0;i--)
            System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print8(String str) {
        for(int i = str.length() - 1; i >= 0;i -= 2)
            System.out.print(str.charAt(i));
        System.out.print("\n");
    }

    static void Print9(String str) {
        System.out.print(str.length());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Print1(str);
        Print2(str);
        Print3(str);
        Print4(str);
        Print5(str);
        Print6(str);
        Print7(str);
        Print8(str);
        Print9(str);
        in.close();
    }
}