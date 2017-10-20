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
    System.out.println(testcases);
    String input = "";
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
    }
  }
}
