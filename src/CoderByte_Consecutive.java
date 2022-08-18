import java.util.Arrays;

class CoderByte_Consecutive {

    public static int CoderByte_Consecutive(int[] arr) {
        Arrays.sort(arr);
        int counter = 0;
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
            if (x == 0) continue;
            if (arr[x] == arr[x - 1]) counter++;
        }
      System.out.println(counter);

        int n = arr[arr.length - 1] - arr[0] - (arr.length - 2) - 1 + counter;
        return n;
    }

    public static void main(String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        int arr[] = {5, 10, 15};
        System.out.print(CoderByte_Consecutive(new int[]{5, 10, 15,10}));
    }
}

//Have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number of integers needed to make the contents of arr consecutive from the lowest number to the highest number. For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8. Negative numbers may be entered as parameters and no array will have less than 2 elements.