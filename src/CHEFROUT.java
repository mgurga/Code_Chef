import java.util.Scanner;

class CHEFROUT
{
  public static void main(String[] args)
  {
    boolean hasEaten = false;
    boolean hasSlept = false;
    boolean hasCooked = false;
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      if (input.charAt(0) == 'C')
      {
        System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
    }
  }
}
