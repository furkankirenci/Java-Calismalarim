import java.util.Scanner;

public class SifreCozucu {
    public static void main(String[] args) {
        //Şifre tahmin etmeye çalışıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("tahmin edilecek sayi max kac basamakli olsun : ");
        int n = input.nextInt();
        int number = (int) Math.floor(Math.random() * Math.pow(10, n));
//        int number = 777;
//        System.out.println(number);
        boolean isCorrect = false;
        int counter = 0;
        while (isCorrect == false) {
            int guess = guess();
            counter++;
            System.out.println(counter + " defa denedin.");
            isCorrect = basamaklaraAyirma(number, guess, isCorrect, n);
        }
    }


    static int guess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi tahmin ediniz : ");
        int guess = input.nextInt();
        return guess;
    }


    static boolean basamaklaraAyirma(int number, int guess, boolean isCorrect, int n) {

        int[] guesses = new int[n];
        int[] numbers = new int[n];
        int add1 = 0;
        int add2 = 0;
        int correctPlaceCounter = 0;
        int wrongPlaceCounter = 0;

        for (int i = 1; i <= n; i++) {
            int a = (int) (guess / Math.pow(10, (n - i))) % 10;
            guesses[add1++] = a;
        }
        for (int i = 1; i <= n; i++) {
            int a = (int) (number / Math.pow(10, (n - i))) % 10;
            numbers[add2++] = a;
        }

        for (int j = 0; j < guesses.length; j++) {
            if (guesses[j] == numbers[j]) {
                numbers[j] = 10;
                guesses[j] = 10;
                correctPlaceCounter++;
            }
        }

        for (int j = 0; j < guesses.length; j++) {
//            System.out.println(guesses[j]);
            for (int k = 0; k < numbers.length; k++) {
//                System.out.println(numbers[k]+" k bu");
                if ((j != k) && (guesses[j] == numbers[k]) && (10 != guesses[j])) {
                    wrongPlaceCounter++;
//                    System.out.println(j+" "+k+" "+guesses[j]);
                    numbers[k] = 10;
                    break;
                }
            }
            System.out.println();
        }
        

        if (number == guess) {
            System.out.println("Win");
            isCorrect = true;
        } else {
            System.out.println(correctPlaceCounter + " dogru yer " + wrongPlaceCounter + " yanlis yer");
        }
        return isCorrect;
    }
}
