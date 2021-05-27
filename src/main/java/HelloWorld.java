// Your First Program



class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World! "); //an extra space was added in the end to make test case failed
    }
    
    public static void printStarPiramid() {
        System.out.println("    * "); //an extra space was added in the end to make test case failed
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
    }
    
    public static void printFace() {
        System.out.println(" +\"\"\"\"\"+  "); //an extra space was added in the end to make test case failed
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    
    public static void printLongSentence() 
    {
        System.out.println("This is a very long sentence that contains over 100 characters, and it should cause a warming in checkstyle!");
    }
    
    public static void nothing(){
        if (true) if (false) 
            for (int i=0; i<10; i++) i++;
    }
}
