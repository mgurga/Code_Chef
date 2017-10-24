import java.util.Scanner;

public class C00K0FF
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    String input2 = "";
    int points = 0;
    boolean[] hasBlank = new boolean[7];
    //hasBlank[0] = cakewalk
    //hasBlank[1] = simple
    //hasBlank[2] = easy
    //hasBlank[3] = easy-medium
    //hasBlank[4] = medium
    //hasBlank[5] = medium-hard
    //hasBlank[6] = hard
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      String[] chalLevel = new String[Integer.parseInt(input)];
      for (int g = 0; g < hasBlank.length; g++)
      {
        hasBlank[g] = false;
      }
      for (int j = 0; j < Integer.parseInt(input); j++)
      {
        chalLevel[j] = scan.next();
        if (chalLevel[j].equals("cakewalk"))
        {
          hasBlank[0] = true;
        }
        if (chalLevel[j].equals("simple"))
        {
          hasBlank[1] = true;
        }
        if (chalLevel[j].equals("easy"))
        {
          hasBlank[2] = true;
        }
        if (chalLevel[j].equals("easy-medium"))
        {
          hasBlank[3] = true;
        }
        if (chalLevel[j].equals("medium"))
        {
          hasBlank[4] = true;
        }
        if (chalLevel[j].equals("medium-hard"))
        {
          hasBlank[5] = true;
        }
        if (chalLevel[j].equals("hard"))
        {
          hasBlank[6] = true;
        }
      }
      if (hasBlank[0] = true)
      {
        points++;
      }
      if (hasBlank[1] = true)
      {
        points++;
      }
      if (hasBlank[2] = true)
      {
        points++;
      }
      if (hasBlank[3] == true || hasBlank[4] == true)
      {
        points++;
      }
      if (hasBlank[5] == true || hasBlank[6] == true)
      {
        points++;
      }
      if (points >= 5)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      //      for (int g = 0; g < chalLevel.length; g++)
      //      {
      //        System.out.println(chalLevel[g]);
      //      }
    }
    scan.close();
  }
}
