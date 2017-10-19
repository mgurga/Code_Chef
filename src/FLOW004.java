import java.util.Scanner;

class FLOW004
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    int first = 0;
    int last = 0;
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      first = Character.getNumericValue(input.charAt(0));
      last = Character.getNumericValue(input.charAt(input.length() - 1));
      System.out.println(first + last);
    }
  }
}
