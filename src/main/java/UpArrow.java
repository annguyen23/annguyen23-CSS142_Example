/**
 * Write a description of class UpArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UpArrow
{

    private static void printStar(int s)
    {
        for (int i = 0; i < s; i++)
        {
            System.out.print("*");
        }
    }

    private static void printDot(int s)
    {
        for (int i = 0; i < s; i++)
        {
            System.out.print(".");
        }
    }

    private static void arrowHead(int size)
    {
        int stars = 1;
        int spaces = (size - 1) / 2;
        while (stars <= size)
        {
            printDot(spaces);
            printStar(stars);
            printDot(spaces);      
            System.out.println();
            stars = stars + 2;
            spaces = spaces - 1;
        }
    }

    private static void arrowTrunk(int size)
    {
        int stars = (size - 1) / 4;
        int spaces = (size - stars) / 2;
        for (int i = 0; i < size; i++)
        {
            printDot(spaces);
            printStar(stars);
            printDot(spaces);      
            System.out.println();
        }
    }

    public static void arrow(int size)
    {
        // we can only do odd size arrows
        assert(size % 2 == 1);
        arrowHead(size);
        arrowTrunk(size);
    }

    public static void main(String[] args)
    {
        arrow(9);
        arrow(15);
        arrow(31);
    }

}

