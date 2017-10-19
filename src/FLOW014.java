import java.util.Scanner;

public class FLOW014
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    scan.nextLine();
    String input = "";
    String[] specs = new String[3];
    boolean hardnessMet = false;
    boolean carbonMet = false;
    boolean tensileMet = false;
    int grade = 0;
    //specs[0] = hardness
    //specs[1] = carbon content
    //specs[2] = tensile strength
    for (int i = 0; i < testcases; i++)
    {
      hardnessMet = false;
      carbonMet = false;
      tensileMet = false;
      grade = 0;
      for (int r = 0; r < specs.length; r++)
      {
        specs[r] = "";
      }
      input = scan.nextLine();
      specs = input.split(" ");
      System.out.println(input);
      if (Integer.parseInt(specs[0]) > 50)
      {
        hardnessMet = true;
      }
      if (Float.parseFloat(specs[1]) < 0.7)
      {
        carbonMet = true;
      }
      if (Integer.parseInt(specs[2]) > 5600)
      {
        tensileMet = true;
      }
      System.out.println(hardnessMet);
      System.out.println(carbonMet);
      System.out.println(tensileMet);
      if (hardnessMet == true && carbonMet == true && tensileMet == true)
      {
        grade = 10;
      }
      else if (hardnessMet == true && carbonMet == true)
      {
        grade = 9;
      }
      else if (carbonMet == true && tensileMet == true)
      {
        grade = 8;
      }
      else if (hardnessMet == true && tensileMet == true)
      {
        grade = 7;
      }
      else if (hardnessMet == false && carbonMet == false && tensileMet == false)
      {
        grade = 5;
      }
      else
      {
        grade = 6;
      }
      System.out.println(grade);
    }
  }
}
