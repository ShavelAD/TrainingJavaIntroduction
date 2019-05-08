/**
 * Created by user on 08.05.2019.
 */
import java.util.Scanner;
public class Vowelletter {
    public static void main(String[] args){
        /*char letter='B';
        Scanner sc= new Scanner(System.in);
        System.out.print("Input letter: ");
        letter=sc.nextLine().toLowerCase().toCharArray()[0];

        switch (letter){
            case 'a':{}
            case 'e':{}
            case 'i':{}
            case 'o':{}
            case 'u':{
                System.out.println("letter is  vowel");
            }
            break;
            default:{
                System.out.println("letter is not  vowel");
            }
        }*/

        //SECOND WAY
       /* if(letter=='A'){
            System.out.println("Letter is vowel");
        } else if(letter=='a'){
            System.out.println("Letter is vowel");
        } else if(letter=='E'){
            System.out.println("Letter is vowel");
        } else if(letter=='e'){
            System.out.println("Letter is vowel");
        } else if(letter=='I'){
            System.out.println("Letter is vowel");
        } else if(letter=='i'){
            System.out.println("Letter is vowel");
        } else if(letter=='O'){
            System.out.println("Letter is vowel");
        } else if(letter=='o'){
            System.out.println("Letter is vowel");
        } else if(letter=='U'){
            System.out.println("Letter is vowel");
        } else if(letter=='u'){
            System.out.println("Letter is vowel");
        }
        */

        //THIRD WAY
        /*char[] vowels={'a', 'e', 'i', 'o', 'u'};
        boolean isVowel=false;
        char inputLetter;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input letter: ");
        inputLetter=scan.nextLine().toLowerCase().toCharArray()[0];
        for(char c:vowels){
            if(inputLetter==c){
                isVowel=true;
            }
        }
        if(isVowel){
            System.out.println("Letter "+inputLetter+" is " + " vowel");
        }
        else
            System.out.println("Letter "+inputLetter+" is not " + " vowel");
        */
        //FOURTH WAY
        /*String inputLetter;
        String vowelLetter = "aeuio";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Letter:");
            inputLetter = scanner.nextLine().toLowerCase();
            if (inputLetter.length() == 1)
                if (vowelLetter.contains(inputLetter))
                    System.out.println("Entered char is vowel");
        } while (inputLetter.length() != 0);
        */
    }

}

