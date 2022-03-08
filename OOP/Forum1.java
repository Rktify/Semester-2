import java.util.Scanner;
public class Forum1 {
    public static void main(String[] args){
        // 7a. 8
        // 7b. 2
        // 7c. -13
        // 7d. 3
        // 7e. 2
        // 7f. jjjjjjxxx

        // 8
        System.out.println("*********      ***        *        *");
        System.out.println("*       *    *     *     ***      * *");
        System.out.println("*       *   *       *   *****    *   *");
        System.out.println("*       *   *       *     *     *     *");
        System.out.println("*       *   *       *     *    *       *");
        System.out.println("*       *   *       *     *     *     *");
        System.out.println("*       *   *       *     *      *   *");
        System.out.println("*       *    *     *      *       * *");
        System.out.println("*********      ***        *        *");

        // 9
        Scanner Celcius = new Scanner(System.in);
        System.out.println("Enter temperature (in Celcius): ");
        double C = Celcius.nextDouble();
        double F = ((C * 9/5) - 32);
        System.out.println(C + " Celcius degrees is the same as " + F + " Fahrenheit degrees");

        // 10
        Scanner x = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        double x1 = x.nextDouble();
        double x2 = x.nextDouble();
        double x3 = x.nextDouble();
        double mean = ((x1 + x2 + x3) / 3);
        double variance = ((Math.pow((x1 - mean),2) + Math.pow((x2 - mean),2) + Math.pow((x3 - mean),2)) / 3);
        double deviation = Math.sqrt(variance);
        System.out.println(mean + "is the mean for the numbers " + x1 + " " + x2 + " and " + x3);
        System.out.println("The variance is "+ variance);
        System.out.println("And the standard deviation is" + deviation);

        // 11
        int a,b,c;
        a = 10;
        b = 5;
        System.out.println("The 1st number is " + a + " and the 2nd number is "+ b);
        c = a;
        a = b;
        b = c;
        System.out.println("Now, The 1st number is " + a + " and the 2nd number is "+ b);

        // 12
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.println("  " + i + "\t" + Math.round(Math.pow(i, 2)) + "\t" + Math.round(Math.pow(i, 3)));
        }

        // 13
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        double num1 = num.nextDouble();
        double num2 = num.nextDouble();
        double num3 = num.nextDouble();
        if(num1 == 0){
            System.out.println("Invalid");
        }
        else{
            double positive = ((-num2) + Math.sqrt(Math.pow(num2, 2)-(4 * num1 * num3)))/(2 * (num1));
            double negative = ((-num2) - Math.sqrt(Math.pow(num2, 2)-(4 * num1 * num3)))/(2 * (num1));
            System.out.println(negative);
            System.out.println(positive);
        }

        // 14
        Scanner seconds = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        var s = seconds.nextInt();
        int hour = s / 3600;
        int minute = (s % 3600) / 60;
        int sec = s % 3600 % 60;
        System.out.println(s + " seconds are " + hour + " hours, " + minute + " minutes and " + sec + " seconds.");
    }
}
