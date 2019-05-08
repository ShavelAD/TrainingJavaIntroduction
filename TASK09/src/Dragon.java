/**
 * Created by user on 08.05.2019.
 */
public class Dragon {
    private static final int LOWER_AGE = 200;
    private static final int UPPER_AGE = 300;
    private static final int FIRST_HEADS_MULTIPLIER = 3;
    private static final int SECOND_HEADS_MULTIPLIER = 2;
    private static final int DRAGON_EYES = 2;

    public static void main(String[] args) {
        int age = 256;
        System.out.println("Number of heads: " + getNumOfHeads(age) + "\nNumber of eyes: "
                + getNumOfEyes(getNumOfHeads(age)));

    }
    static int getNumOfHeads(int age){
        int heads;

        if(age<LOWER_AGE){
            heads=age*FIRST_HEADS_MULTIPLIER;
        } else if(age<UPPER_AGE){

            heads=age*SECOND_HEADS_MULTIPLIER-LOWER_AGE*SECOND_HEADS_MULTIPLIER
                    + LOWER_AGE*FIRST_HEADS_MULTIPLIER;

        } else {

            heads = LOWER_AGE * FIRST_HEADS_MULTIPLIER + (UPPER_AGE - LOWER_AGE)
                    * SECOND_HEADS_MULTIPLIER - UPPER_AGE + age;

        }

        return heads;

    }

    static int getNumOfEyes(int heads) {

        return heads * DRAGON_EYES;
    }

}

