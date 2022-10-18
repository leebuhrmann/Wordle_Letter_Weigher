import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class App
{
    public static void main(String[] args)
    {
        int[] p1 = new int[26];
        int[] p2 = new int[26];
        int[] p3 = new int[26];
        int[] p4 = new int[26];
        int[] p5 = new int[26];

        int num = -1;
        String word = null;
        
        try
        {

            Scanner in = new Scanner(new File("src/Wordle Answers.txt"));
            in.nextLine(); //skips first line

            while(in.hasNextLine() && num < 2314)
            {
                String record = in.nextLine();
                Scanner lineParser = new Scanner(record);

                lineParser.next(); //skips date
                num = lineParser.nextInt();
                word = lineParser.next();
                word = word.toUpperCase();

                char[] wordParser = word.toCharArray();
                
                p1[wordParser[0] - 65]++;
                p2[wordParser[1] - 65]++;
                p3[wordParser[2] - 65]++;
                p4[wordParser[3] - 65]++;
                p5[wordParser[4] - 65]++;

                lineParser.close();
            }

            in.close();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found!");
        }


        System.out.print("\nPOS|  1  |  2  |  3  |  4  |  5  |\n");
        for(int i = 0; i < 26; i++)
        {
            System.out.printf(" %c | %3d | %3d | %3d | %3d | %3d |\n"
                                , (i + 65), p1[i], p2[i], p3[i], p4[i], p5[i]);
        }

        System.out.printf("\nThe final word scanned was %s and was number %d\n\n", word, num);
    }
}
