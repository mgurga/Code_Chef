import java.util.Scanner;

public class LONGSEQ
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
      int[] numbers = new int[input.length()];
      int[] numbersToChange = new int[input.length()];
      for (int f = 0; f < input.length(); f++)
      {
        numbers[f] = input.charAt(f) - '0';
      }
      numbersToChange = numbers;
      for (int j = 0; j < input.length() - 1; j++)
      {
        if (numbersToChange[j] == 1)
        {
          numbersToChange[j] = 0;
        }
        else if (numbersToChange[j] == 0)
        {
          numbersToChange[j] = 1;
        }
        int count = 0;
        for (int g = 0; g < numbers.length; g++)
        {
          if (numbersToChange[g] == 1)
          {
            count++;
          }
        }
        if (count == input.length() || count == 0)
        {
          yeaOrNay = true;
        }
        numbersToChange = numbers;
      }
      if (yeaOrNay == true)
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
