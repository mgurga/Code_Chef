import java.util.Scanner;

/* DOES NOT ACTUALLY WORK
 * HITS THE TIME LIMIT
 * TRY AND FIND A BETTER SORTING ALGORITHIM
 */
class TSORT
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int testcases = scan.nextInt();
    int[] toSort = new int[testcases];
    int numOfNumbers = 0;
    int storage = 0;
    //getting the values
    for (int i = 0; i < testcases; i++)
    {
      toSort[i] = scan.nextInt();
      numOfNumbers++;
    }
    //sorting
    for (int j = 0; j < numOfNumbers - 1; j++)
    {
      for (int i = 0; i < numOfNumbers - 1; i++)
      {
        if (toSort[i] > toSort[i + 1])
        {
          storage = toSort[i];
          toSort[i] = toSort[i + 1];
          toSort[i + 1] = storage;
        }
      }
    }
    //output the sorted list toSort[]
    for (int i = 0; i < numOfNumbers; i++)
    {
      System.out.println(toSort[i]);
    }
  }
}
