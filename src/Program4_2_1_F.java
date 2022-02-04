import java.util.Scanner;

public class Program4_2_1_F
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        int maxCount = 0;
        StringBuffer word = new StringBuffer();
        StringBuffer maxWord = new StringBuffer();
        for(int i = 0; i <= str.length(); i++)
        {
            if(i == str.length() || str.charAt(i) == ' ')
            {
                if(count > maxCount)
                {
                    maxCount = count;
                    maxWord.delete(0, maxWord.length());
                    maxWord.append(word);
                }
                word.delete(0, word.length());
                count = 0;
            }
            else
            {
                count++;
                word.insert(word.length(), str.charAt(i));
            }
        }
        System.out.println(maxWord);
        System.out.println(maxCount);
    }
}