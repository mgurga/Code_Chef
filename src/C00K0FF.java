import java.util.Scanner;

public class C00K0FF
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    String input = "";
    String input2 = "";
    boolean hasSimple = false;
    boolean hasCake = false;
    boolean hasEasy = false;
    boolean hasEasMed = false;
    boolean hasMed = false;
    boolean hasMedHrd = false;
    boolean hasHard = false;
    for (int i = 0; i < testcases; i++)
    {
      input = scan.next();
      String[] chalLevel = new String[Integer.parseInt(input)];
      for (int j = 0; j < Integer.parseInt(input); j++)
      {
        chalLevel[j] = scan.next();
      }
    }
  }
}
