import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class MaxDigit {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        int max=0;
        System.out.println(isMax(max)+ " is max number");

    }
    public static int isMax(int max){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        if(num<10){
            System.out.println(num+" number has one digit!!!");
            System.out.println("Try again!!!");
            num=scr.nextInt();
        }
        while(num>0){
            int tmp = num % 10;
            if (tmp > max) {
                max = tmp;
            }
            num=num / 10;
    }
    return max;
    }
}
