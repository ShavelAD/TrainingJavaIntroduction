/**
 * Created by user on 06.05.2019.
 */
public class CheckNumber {
    private final static int DIVISION_COEFFICIENT=10;
    public static void main(String[] args){
        int number=8531;
        System.out.print(comparedDigitsOfNumber(number));
    }
    public static boolean comparedDigitsOfNumber(int number){
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        firstNumber=number%DIVISION_COEFFICIENT;
        number=number/DIVISION_COEFFICIENT;
        secondNumber=number%DIVISION_COEFFICIENT;
        number=number/DIVISION_COEFFICIENT;
        thirdNumber=number%DIVISION_COEFFICIENT;
        number=number/DIVISION_COEFFICIENT;
        fourthNumber=number%DIVISION_COEFFICIENT;
        return firstNumber<secondNumber && secondNumber<thirdNumber &&
                thirdNumber<fourthNumber;
    }
}
