/**
 * Created by user on 06.05.2019.
 */
public class ReverseOrder {
    private final static int DIVISION_COEFFICIENT=10;
    public static void main(String[] args){
        int number=1234567;
        System.out.print(finderReverseOrder(number));
    }
    public static int finderReverseOrder(int number){
        int reversenumber;
        reversenumber=0;
        reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
        number=number/DIVISION_COEFFICIENT;
            reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
            number=number/DIVISION_COEFFICIENT;
                reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
                number=number/DIVISION_COEFFICIENT;
                    reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
                    number=number/DIVISION_COEFFICIENT;
                        reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
                        number=number/DIVISION_COEFFICIENT;
                            reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
                            number=number/DIVISION_COEFFICIENT;
                                reversenumber=reversenumber*DIVISION_COEFFICIENT + number%DIVISION_COEFFICIENT;
                                number=number/DIVISION_COEFFICIENT;

        return reversenumber;
    }
}
