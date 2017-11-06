import java.util.Scanner;

public class RAINBOWA
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      System.out.println(input);
      String[] inputs = new String[Integer.parseInt(input)];
      inputs = input.split(" ");
      int biggestPlace = 0;
      for (int j = 1; j < inputs.length - 1; j++)
      {
        if (Integer.parseInt(inputs[j]) > Integer.parseInt(inputs[j - 1]))
        {
          biggestPlace = Integer.parseInt(inputs[j]);
        }
      }
      //System.out.println(biggestPlace);
      for (int f = 0; f < inputs.length; f++)
      {
        System.out.println(inputs[f]);
      }
    }
  }
}
