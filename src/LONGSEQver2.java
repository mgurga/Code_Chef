import java.util.Scanner;

class LONGSEQver2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    boolean yeaOrNay = false;
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      yeaOrNay = false;
      int count1 = 0;
      int count0 = 0;
      for (int j = 0; j < input.length(); j++)
      {
        if (input.charAt(j) - '0' == 1)
        {
          count1++;
        }
        if (input.charAt(j) - '0' == 0)
        {
          count0++;
        }
      }
      if (count1 == 1 || count0 == 1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
  }
}
