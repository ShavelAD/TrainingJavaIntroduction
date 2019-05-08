/**
 * Created by user on 06.05.2019.
 */
public class DinosaurWeight {
    private final static int INTO_MILLIGRAM = 1000000;
    private final static int INTO_GRAM = 1000;         // задания констант
    private final static int INTO_TON = 1000;
    public static void main(String[] args) {
        double weight=50;
        System.out.println("transfer KG to MilliGram:"+ weightMilligram(weight));
        System.out.println("transfer KG to Gram:"+ weightGramm(weight));            // выозв методов
        System.out.println("transfer KG to Ton:"+ weightTon(weight));

    }
    public static double weightMilligram(double weight){
        return weight*INTO_MILLIGRAM;
    }
    public static double weightGramm(double weight){
        return weight*INTO_GRAM;
    }
    public static double weightTon(double weight){
        return weight/INTO_TON;
    }
}