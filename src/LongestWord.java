import java.util.Scanner;

public class LongestWord {
    public static String LongestWord(String sen) {
        // Coderbyte LongestWord soru cevabıdır.
        // code goes here
        // System.out.println(sen);

        int len = sen.length();
        String max = "", temp = "";
        for (int i = 0; i < len; ++i) {
            char c = sen.charAt(i);
            int n = (int) c;
            if ((n >= 97 && n <= 122) || (n >= 65 && n <= 90) || (n >= 48 & n <= 57)) {
                temp = temp + sen.charAt(i);
                if (i == len - 1) {
                    if (max.length() < temp.length()) {
                        max = temp;
                        temp = "";
                    }
                }
            } else {
                if (max.length() < temp.length()) {
                    max = temp;
                }
                temp = "";
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner a = new Scanner(System.in);
        String s = "ıakd lawkjd alwdj oawdk paowdk powd kapowawegrkd apoşwdk ";
        System.out.print(LongestWord(s));
    }
}