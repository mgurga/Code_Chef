import java.util.Scanner;

class BUGCAL
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    String input2 = "";
    String[] numbers = new String[2];
    for (int i = 0; i < testcases; i++)
    {
      int hundreds = 0;
      int tens = 0;
      int ones = 0;
      input = scan.next();
      input2 = scan.next();
      for (int f = 0; f < 3; f++)
      {
        if (input.length() > input2.length())
        {
          input2 = "0" + input2;
        }
        else if (input.length() < input2.length())
        {
          input = "0" + input;
        }
      }
      while (input.length() < 3)
      {
        input = "0" + input;
        input2 = "0" + input2;
      }
      hundreds = input.charAt(0) - '0';
      hundreds = hundreds + input2.charAt(0) - '0';
      tens = input.charAt(1) - '0';
      tens = tens + input2.charAt(1) - '0';
      ones = input.charAt(2) - '0';
      ones = ones + input2.charAt(2) - '0';
      if (ones > 9)
      {
        ones = ones - 10;
      }
      if (tens > 9)
      {
        tens = tens - 10;
      }
      if (hundreds > 9)
      {
        hundreds = hundreds - 10;
      }
      if (hundreds == 0 && tens == 0)
      {
        System.out.println(ones);
      }
      else if (hundreds == 0)
      {
        System.out.println(tens + "" + ones);
      }
      else
      {
        System.out.println(hundreds + "" + tens + "" + ones);
      }
    }
    scan.close();
  }
}
