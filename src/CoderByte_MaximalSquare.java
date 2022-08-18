import java.util.Scanner;

public class CoderByte_MaximalSquare {

    public static String MaximalSquare(String[] strArr) {
        // code goes here
        return strArr[0];
    }

    public static void main(String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        System.out.print(MaximalSquare(new String[] {"10100", "10111", "11111", "10010"}));
    }

}
/*
1. For input new String[] {"10100", "10111", "11111", "10010"} the output was incorrect. The correct output is 4

2. For input new String[] {"0111", "1111", "1111", "1111"} the output was incorrect. The correct output is 9

3. For input new String[] {"0111", "1101", "0111"} the output was incorrect. The correct output is 1

4. For input new String[] {"1111", "1111"} the output was incorrect. The correct output is 4

5. For input new String[] {"1111", "1111", "1111"} the output was incorrect. The correct output is 9

6. For input new String[] {"1111", "1101", "1111", "0111"} the output was incorrect. The correct output is 4

7. For input new String[] {"01001", "11111", "01011", "11011"} the output was incorrect. The correct output is 4

8. For input new String[] {"01001", "11111", "01011", "11111", "01111", "11111"} the output was incorrect. The correct output is 9

9. For input new String[] {"101101", "111111", "010111", "111111"} the output was incorrect. The correct output is 9

10. For input new String[] {"101101", "111111", "011111", "111111", "001111", "011111"} the output was incorrect. The correct output is 16
*/
