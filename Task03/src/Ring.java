/**
 * Created by user on 06.05.2019.
 */
public class Ring {
    private final static double PI= Math.PI;
    private final static String FIRST_SQUARE_TEXT="First Square: ";
    private final static String SECOND_SQUARE_TEXT="Second Square: ";
    private final static String RING_SQUARE_TEXT="Ring Square: ";

    public static void main(String[] args) {
        double firstRadius=10;
        double secondRadius=5;
        double firstSquare=squareFinderForFirstRadius(firstRadius);
        double secondSquare=squareFinderForSecondRadius(secondRadius);
        outputOnDisplay(FIRST_SQUARE_TEXT,squareFinderForFirstRadius(firstRadius));
        outputOnDisplay(SECOND_SQUARE_TEXT,squareFinderForSecondRadius(secondRadius));
        outputOnDisplay(RING_SQUARE_TEXT,squareFinderRing(firstSquare,secondSquare));
    }
    public static double squareFinderForFirstRadius(double firstRadius){
        return PI*firstRadius*firstRadius;
    }
    public static double squareFinderForSecondRadius(double secondRadius) {
        return PI * secondRadius * secondRadius;
    }
    public static double squareFinderRing(double firstSquare,double secondSquare) {
        return firstSquare - secondSquare;
    }
    public static void outputOnDisplay(String text,double value){
        System.out.println(text + value);
    }
}
