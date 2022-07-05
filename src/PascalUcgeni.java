import java.util.Scanner;

public class PascalUcgeni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac satir olsun : ");
        int bas = input.nextInt();
        int[][] arr = new int[bas][bas];

        for (int a = 0; a < bas; a++) {
            for (int j = 1; j <= bas - a - 1; j++) {
                System.out.print("  ");
            }
            for (int b = 0; b <= a; b++) {
                if (b == 0 || a == b) {
                    arr[a][b] = 1;
                } else {
                    arr[a][b] = arr[a - 1][b - 1] + arr[a - 1][b];
                }
                System.out.print(arr[a][b] + "   ");
            }
            System.out.println();
        }
    }
}
