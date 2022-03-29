import java.util.Arrays;
import java.util.Scanner;

public class MachineProblem1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of items: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int array[] = new int[x];

        System.out.print("Enter the value of all items (separated by space): ");

        for(int i = 0; i < x; i++){
            array[i] = input.nextInt();
        }

        System.out.print("The values are: " + Arrays.toString(array));
    }
}
