import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

class ATM
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      DecimalFormat df = new DecimalFormat("0.00");
      String[] rawInputParts = new String[5];
      String rawInput;
      int withdraw;
      float balance;
      Scanner scan = new Scanner(System.in);
      System.out.println("");
      rawInput = scan.nextLine();
      scan.close();
      rawInputParts = rawInput.split(" ");
      withdraw = Integer.parseInt(rawInputParts[0]);
      balance = Float.parseFloat(rawInputParts[1]);
      if (withdraw % 5 == 0 && withdraw < balance - 0.5)
      {
        System.out.println(df.format(balance - withdraw - 0.50));
      }
      else
      {
        System.out.println(df.format(balance));
      }
      System.exit(0);
    }
    catch (Exception e)
    {
      return;
    }
  }
}