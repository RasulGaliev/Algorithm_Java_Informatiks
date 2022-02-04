// Два момента времени

import java.util.Scanner;

public class Program4_1_F
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        byte h1 = in.nextByte();
        byte m1 = in.nextByte();
        byte s1 = in.nextByte();
        byte h2 = in.nextByte();
        byte m2 = in.nextByte();
        byte s2 = in.nextByte();
        System.out.print(h2 * 3600 + m2 * 60 + s2 - h1 * 3600 - m1 * 60 - s1);
    }
}
