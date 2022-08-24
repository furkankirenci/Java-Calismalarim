import java.util.*; 
import java.io.*;

//Have the function PentagonalNumber(num) read num which will be a positive integer and determine how many dots exist in a pentagonal shape around a center dot on the Nth iteration. For example, in the image below you can see that on the first iteration there is only a single dot, on the second iteration there are 6 dots, on the third there are 16 dots, and on the fourth there are 31 dots.

class Main {

  public static int PentagonalNumber(int num) {
    if(num == 1) return 1;
    return 5*(num-1) + PentagonalNumber(num-1);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PentagonalNumber(s.nextLine())); 
  }

}