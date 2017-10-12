import java.util.Scanner;

public class NITIKA
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String rawInput = "";
    String output = "";
    char capitalize = ' ';
    String letter = "";
    int numOfWords = 0;
    String word = "";
    String[] words = new String[100];
    for (int i = 0; i < testcases; i++)
    {
      //clear variables & ask for input
      words = new String[words.length];
      rawInput = scan.nextLine() + " ";
      numOfWords = 0;
      word = "";
      //split words at spaces      
      for (int g = 0; g < rawInput.length(); g++)
      {
        if (rawInput.charAt(g) == ' ' || g == rawInput.length() + 1)
        {
          words[numOfWords] = word;
          word = "";
          numOfWords++;
        }
        else
        {
          word = word + rawInput.charAt(g);
        }
      }
      numOfWords--;
      System.out.println("words[0] is " + words[0]);
      System.out.println("words[1] is " + words[1]);
      System.out.println("words[2] is " + words[2]);
      System.out.println("numOfWord is " + numOfWords);
      //capitalize each word
      //delete unnecessary parts(anything after capital)
      //put back together again and print it
      //close and reset some variables
    }
  }
}
