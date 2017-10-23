import java.util.Scanner;

class INTEST
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String[] firstsplit = new String[2];
    String firstin = scan.nextLine();
    firstsplit = firstin.split(" ");
    int testcases = Integer.parseInt(firstsplit[0]);
    int divisibleBy = Integer.parseInt(firstsplit[1]);
    String input = "";
    int numDivisible = 0;
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      if (Integer.parseInt(input) % divisibleBy == 0)
      {
        numDivisible++;
      }
    }
    System.out.println(numDivisible);
  }
}
