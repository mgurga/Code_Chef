import java.util.Scanner;

class NITIKA
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = 0;
    int numOfWords = 0;
    char holder = ' ';
    testcases = scan.nextInt();
    scan.nextLine();
    String rawInput = "";
    String[] words = new String[100];
    String changes = "";
    String output = "";
    String preout = "";
    for (int i = 0; i < testcases; i++)
    {
      //reset all variables
      rawInput = scan.nextLine();
      output = "";
      preout = "";
      changes = "";
      for (int r = 0; r < words.length; r++)
      {
        words[r] = "";
      }
      //Split the words
      words = rawInput.split(" ");
      numOfWords = rawInput.split(" ").length;
      //ready words for more processing
      for (int g = 0; g < numOfWords - 1; g++)
      {
        //Change to upper case
        changes = words[g];
        changes = changes.substring(0, 1).toUpperCase() + changes.substring(1);
        //shortens to first character plus .
        changes = changes.charAt(0) + ".";
        words[g] = changes;
      }
      changes = words[numOfWords - 1];
      changes = changes.substring(0, changes.length()).toLowerCase();
      changes = changes.substring(0, 1).toUpperCase() + changes.substring(1);
      words[numOfWords - 1] = changes;
      // put the letters in words[] to one string
      for (int o = 0; o < numOfWords; o++)
      {
        preout = preout + " " + words[o];
      }
      for (int o = 0; o < preout.length() - 1; o++)
      {
        output = output + preout.charAt(o + 1) + "";
      }
      System.out.println(output);
    }
  }
}
