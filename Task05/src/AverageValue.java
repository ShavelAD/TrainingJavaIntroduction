/**
 * Created by user on 06.05.2019.
 */
public class AverageValue {
    private final static int DIVISION_COEFFICIENT=10;
    private final static int COUNT_DIGITS_OF_NUMBER=6;
    public static void main(String[] args) {
        int number=563781;
        System.out.println("Average Arithmetic Mean: "+ finderAverageArithmeticMean(number));
        System.out.println("Average Product Of Number: "+ finderAverageProductOfNumber(number));
    }
    public static double finderAverageArithmeticMean(int number){
        double sum=0;
            sum+=number%DIVISION_COEFFICIENT;
            number=number/DIVISION_COEFFICIENT;
                sum+=number%DIVISION_COEFFICIENT;
                number=number/DIVISION_COEFFICIENT;
                    sum+=number%DIVISION_COEFFICIENT;
                    number=number/DIVISION_COEFFICIENT;
                        sum+=number%DIVISION_COEFFICIENT;
                        number=number/DIVISION_COEFFICIENT;
                            sum+=number%DIVISION_COEFFICIENT;
                            number=number/DIVISION_COEFFICIENT;
                                sum+=number%DIVISION_COEFFICIENT;
                                number=number/DIVISION_COEFFICIENT;

        return sum/COUNT_DIGITS_OF_NUMBER;
    }
    public static double finderAverageProductOfNumber(int number){
        double product=1;
            product*=number%DIVISION_COEFFICIENT;
            number=number/DIVISION_COEFFICIENT;
                product*=number%DIVISION_COEFFICIENT;
                number=number/DIVISION_COEFFICIENT;
                    product*=number%DIVISION_COEFFICIENT;
                    number=number/DIVISION_COEFFICIENT;
                        product*=number%DIVISION_COEFFICIENT;
                        number=number/DIVISION_COEFFICIENT;
                            product*=number%DIVISION_COEFFICIENT;
                            number=number/DIVISION_COEFFICIENT;
                                product*=number%DIVISION_COEFFICIENT;
                                number=number/DIVISION_COEFFICIENT;

        return Math.pow(product,(double)1/COUNT_DIGITS_OF_NUMBER);

    }
}

