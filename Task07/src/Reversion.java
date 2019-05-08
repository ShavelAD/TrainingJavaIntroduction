/**
 * Created by user on 06.05.2019.
 */
public class Reversion {
    private  static int firstnumber;
    private static int secondnumber;
    public static void main(String[] args) {
        firstnumber=1234567;
        secondnumber=7654321;
        finderReversion();
        System.out.println("Result:"+ "(firstnumber)"+firstnumber + " "+
                "(secondnumber)" + secondnumber);
    }
    public static void finderReversion(){
        firstnumber=firstnumber+secondnumber;
        secondnumber=firstnumber-secondnumber;
        firstnumber=firstnumber-secondnumber;

    }
}
