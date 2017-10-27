import java.util.Scanner;

public class LONGSEQ
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      int[] numbers = new int[input.length()];
      for (int g = 0; g < input.length(); g++)
      {
        numbers[g] = input.charAt(g);
      }
    }
  }
}
