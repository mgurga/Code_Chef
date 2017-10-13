import java.util.Scanner;


public class NITIKA
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
    
    for(int i = 0; i < testcases; i++) {
    	//reset all variables
    	rawInput = scan.nextLine();
    	
    	//Split the words
    	words = rawInput.split(" ");
    	numOfWords = rawInput.split(" ").length;
    	//System.out.println(rawInput.split(" ").length);
    	
    	//ready words for more processing
    	for(int g = 0; g < numOfWords; g++) {
    		changes = words[g];
    		changes = changes.substring(0, 1).toUpperCase() + changes.substring(1);
    		
    		words[g] = changes;
    		System.out.println(changes);
    	}
    	//process them
    }    
  }
}
