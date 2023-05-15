import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // retrieve number of elements in the first line
        int elements = scanner.nextInt();

        // create array
        int[] array = new int[elements];

        // create variables to perform operations
        final int divBySix = 6;
        int sum = 0;

        // add numbers that are divisible by 6
        for (int i = 0; i < array.length; i++) {
            int input = scanner.nextInt();
            if (input % divBySix == 0) {
                sum += input;
            }
        }

        System.out.println(sum);

    }
}