import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class Palindrome {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter: ");
        String num=scr.next();
        String reverse = new StringBuffer(num).reverse().toString();
        System.out.println(reverse + "is reverse number");
        System.out.println(reverse.compareTo(num)+" This mean that number is palindrom");
    }
}
