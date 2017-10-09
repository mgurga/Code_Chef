import java.util.Scanner;

public class NITIKA
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String rawInput;
    String output;
    char capitalize;
    int letter;
    int numOfWords;
    String word;
    String[] words = new String[100];
    for (int i = 0; i < testcases; i++)
    {
      //clear variables & ask for input
      words = new String[words.length];
      rawInput = scan.next();
      //split words at spaces
      for (int g = 0; g < rawInput.length(); g++)
      {
        if (rawInput.charAt(g) == ' ')
        {
          words[numOfWords] = word;
          numOfWords++;
        }
      }
      //capitalize each word
      //delete unnecessary parts(anything after capital)
      //put back together again and print it
    }
  }
}
