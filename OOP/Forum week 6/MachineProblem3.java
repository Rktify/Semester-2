import java.text.DecimalFormat;
import java.util.Scanner;

public class MachineProblem3 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int array[] = new int[x];

        double sum = 0;
        int minimum = 100;
        int maximum = 0;

        for (int i = 0; i < x; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            array[i] = input.nextInt();
            sum += array[i];

            if (array[i] < minimum) {
                minimum = array[i];
            }
            else{
                maximum = array[i];
            }
        }

        double avg = (sum / x);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("The average is: " + df.format(avg));
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }}
