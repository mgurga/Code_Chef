import java.util.Scanner;

class LUCKFOUR
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    int fours = 0;
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      fours = 0;
      for (int h = 0; h < input.length(); h++)
      {
        if (input.charAt(h) == '4')
        {
          fours++;
        }
      }
    }
  }
}
