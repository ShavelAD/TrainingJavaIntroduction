import java.util.Scanner;

/**
 * Created by user on 14.05.2019.
 */
public class NokAndNod {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter first number: ");
    int first_number=scr.nextInt();
        System.out.print("Enter second number: ");
    int second_number=scr.nextInt();
    System.out.print("NOD: ");
       if ( first_number>second_number) findNOD( first_number,second_number);
               else findNOD(second_number, first_number);
     System.out.print("NOK: ");
        if ( first_number>second_number) System.out.println(findNOK( first_number,second_number));
        else System.out.println(findNOK(second_number, first_number));


}
    public static void findNOD (int max, int min){
        int result =0;
        for(int i=1;i<=min;i++)
            if(max%i==0 && min%i==0){
                result = i;
            }
        System.out.println(result);

    }
    public static int findNOK(int max, int min){
        int k=max;
        while (true){
            for(int i=1;i<=min;i++)
                if(k%max==0 && k%min==0){
                    return k;
                }
            k++;
        }

    }
}
