import java.util.Scanner;

class LifetTheUniverseAndEverything
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int input;
    boolean loop = true;
    while (loop == true)
    {
      System.out.println(" ");
      input = scan.nextInt();
      if (input == 42)
      {
        loop = false;
      }
      else
      {
        System.out.print(input);
      }
    }
    scan.close();
  }
}
