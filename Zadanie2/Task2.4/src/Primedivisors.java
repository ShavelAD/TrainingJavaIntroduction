import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class Primedivisors {
    public static void main(String[] args) {
        int multiplier = 2;
        isPrimeDivisiors(multiplier);
    }

    public static void isPrimeDivisiors(int mult) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scr.nextInt();
        int currentValue = x;
        System.out.print("Prime divisiors: ");
        while (currentValue > 1) {
            if (currentValue % mult == 0) {
                System.out.print(mult + " ");
                currentValue /= mult;
            } else if (mult == 2) {
                mult++;
            }
        }
        if (currentValue != 1) {
            System.out.print(currentValue);
        }
    }
}