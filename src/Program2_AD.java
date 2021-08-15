// Задача №1459. Римская система счисления

import java.util.Scanner;

public class Program2_AD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n / 100 == 1)
            System.out.print("C");
        else if(n % 100 / 10 == 9)
            System.out.print("XC");
        else if(n % 100 / 10 == 8)
            System.out.print("LXXX");
        else if(n % 100 / 10 == 7)
            System.out.print("LXX");
        else if(n % 100 / 10 == 6)
            System.out.print("LX");
        else if(n % 100 / 10 == 5)
            System.out.print("L");
        else if(n % 100 / 10 == 4)
            System.out.print("XL");
        else if(n % 100 / 10 == 3)
            System.out.print("XXX");
        else if(n % 100 / 10 == 2)
            System.out.print("XX");
        else if(n % 100 / 10 == 1)
            System.out.print("X");
        if(n % 10 == 9)
            System.out.print("IX");
        else if(n % 10 == 8)
            System.out.print("VIII");
        else if(n % 10 == 7)
            System.out.print("VII");
        else if(n % 10 == 6)
            System.out.print("VI");
        else if(n % 10 == 5)
            System.out.print("V");
        else if(n % 10 == 4)
            System.out.print("IV");
        else if(n % 10 == 3)
            System.out.print("III");
        else if(n % 10 == 2)
            System.out.print("II");
        else if(n % 10 == 1)
            System.out.print("I");

    }
}