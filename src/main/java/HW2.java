import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
    	runProgramOne();
        runProgramTwo();
    }
    public static void runProgramOne() {
    	segment1("");
        segment2("");
        segment2("");
        segment1("");
        segment3("");
    }
    public static void runProgramTwo() {
    	// take user's inputs
    	Scanner scan = new Scanner(System.in);
    	System.out.println("What does Mario Look like?");
    	String mario = scan.nextLine();
    	System.out.println("What does a Coin look like?");
    	String coin = scan.nextLine();
    	
    	// draw Mario Board 2
    	segment1("");
    	segment2("");
    	segment2(coin);
    	segment1(coin);
    	segment3(mario);
    }
    
    public static void segment1(String word) {
    	System.out.println("||");
    	System.out.println("||");
    	System.out.println("||" + word);
    	System.out.println("||" + word);
    	System.out.println("||" + word);
    	System.out.println("||");
    	System.out.println();
    }
    
    public static void segment2(String word) {
    	System.out.println("||");
    	System.out.println("||    |?|" + word);
    	System.out.println("||");
    	System.out.println("||");
    	System.out.println("||    |?|" + word);
    	System.out.println("||");
    	System.out.println();
    }
    
    public static void segment3(String word) {
    	System.out.println("||");
    	System.out.println("||||");
    	System.out.println("||||||");
    	System.out.println("||||||||");
    	System.out.println("||||||||||");
    	System.out.println("||||||||||||" + word);
    	System.out.println("||");
    	System.out.println("||              ^");
    	System.out.println("|----------------");
    }
}





