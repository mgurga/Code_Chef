import java.util.Scanner;

public class CHEFROUT
{
  public static void main(String[] args)
  {
    boolean badRout = false;
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      for (int j = 0; j < input.length() - 1; j++)
      {
        if (input.charAt(j) == 'S')
        {
          System.out.println("no");
          badRout = true;
        }
        if (input.charAt(j) == 'C')
        {
        }
      }
    }
  }
}
