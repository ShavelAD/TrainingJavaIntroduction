import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class PrimeNumber {
    public static void main(String[] args){
        int countOfDigits=0;
        isprime(countOfDigits);
        }
        public static int isprime(int sum){
            Scanner scr = new Scanner(System.in);
            System.out.print("Enter number: ");
            double num = scr.nextDouble();
            System.out.println("all divisors: ");
                for(int i=1;i<=num;i++){
                    if(num!=0 && num%i==0){
                        sum++;
                        System.out.println(i);
                    }
             }
                System.out.println("Addition result: "+sum);
                    if(sum==2){
                System.out.println("Number is prime");
            }       else{
                System.out.println("Number is not prime");
    }
    return sum;
    }
}
