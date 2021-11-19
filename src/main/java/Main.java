import java.util.*;
import java.io.*;

public class Main{
  
  public static void main(String[] args) {
    printPiramid(5);
    
    int[][] array = creatPascalTriangle(5);
    for (int[] line : array) {
      System.out.println(Arrays.toString(line));
    }
    
    System.out.println(getDay(19, 11, 2021));
  }
  
  // print stars
  public static void printPiramid(int level) {
    for (int i = 1; i <= level; i++) {
      printMany(i, "*");
      System.out.println();
    }
  }
  
  private static void printMany(int count, String x) {
    for (int i = 0; i < count; i++) {
      System.out.print(x);
    }
  }
  
  // read file and sort array
  public static int[] readFile(String name) {
    int[] result = new int[countLine(name)];
    int index = 0;
    try {
      Scanner file = new Scanner (new File(name));
      while (file.hasNextInt()) {
        result[index++] = file.nextInt();
      }
    } catch(Exception e) {
      System.out.println("Can't open file " + name);
    }
    return result;
  }
  
  private static int countLine(String name) {
    int number = 0;
    
    try {
      Scanner file = new Scanner (new File(name));
      while (file.hasNextInt()) {
        number++;
        file.nextInt();
      }
    } catch(Exception e) {
      System.out.println("Can't open file " + name);
    }
    
    return number;
  }
  
  public static void sort(int[] array) {
    Arrays.sort(array);
  }
  
  //  jagged array 
  public static int[][] creatPascalTriangle(int line) {
    int[][] res = new int [line][];
    res[0] = new int[]{1};
    
    for (int i = 1; i < line; i++) {
      res[i] = new int[i + 1];
      res[i][0] = 1;
      res[i][res[i].length-1] = 1;
      for (int j = 1; j < res[i].length-1; j++) {
        res[i][j] = res[i-1][j] + res[i-1][j-1];
      }
    }
    return res;
  }
  
  
  // while loop
  public static int maxInput() {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int max = num;
    while (num != -1) {
      num = scan.nextInt();
      max = Math.max(num, max);
    }
    
    return max;
  }
  
  // day problem: What Day Is It
  // loop and switch/if-else
  public static String getDay(int day, int month, int year) {
    int total = day;
    for (int i = 1; i <= month; i++) {
      total += getDayOfMonth(i, year);
    }
    total += year * 365 + year / 365;
    total %= 7;
    
    switch(total) {
      case 0: return "Saturday";
      case 1: return "Sunday";
      case 2: return "Monday";
      case 3: return "Tuesday";
      case 4: return "Wednesday";
      case 5: return "Thursday";
      case 6: return "Friday";
      default: return "Invalid";
    }
  }
  
  public static int getDayOfMonth (int month, int year) {
    switch(month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31;
      case 2:
        return year % 4 == 0 ? 29 : 28;
      case 4: case 6: case 9: case 11:
        return 30;
      default:
        return 0;
    }
  }
}
