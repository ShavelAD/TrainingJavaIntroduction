/**
 * Created by user on 14.05.2019.
 */
import java.util.Scanner;
import java.util.Random;
public class Coin {
    public static void main(String[] args) {

        int countHeads = 0;
        int countTails = 0;
        System.out.print("Enter number of flip: ");
        flipACoin(countHeads,countTails);


    }


   public static void flipACoin(int countHeads, int countTails){
       Scanner scr = new Scanner(System.in);
       int countOfFlip = scr.nextInt();
        Random rnd=new Random();
        while(countOfFlip!=0){
        int i=rnd.nextInt(2);
        countOfFlip--;
        if(i==1){
        countHeads++;
        }else{
        countTails++;
        }
            }
        System.out.println("number of heads:" +countHeads);
        System.out.println("number of tail:"  + countTails);
                }
}
