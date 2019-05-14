import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scr.next();
        if (number.startsWith("0")) {
            System.out.print("Try again: ");
            number = scr.next();
        }
       System.out.print("Different Digits: "+isDifferentDigits(number));
    }
    public static int isDifferentDigits(String number){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (number.contains(Integer.toString(i))) sum++;
        }
        return  sum;
    }
}
