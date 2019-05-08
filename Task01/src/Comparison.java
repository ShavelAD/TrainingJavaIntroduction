/**
 * Created by user on 06.05.2019.
 */
public class Comparison {

    public static void main(String[] args) {
        int a=4;
        int b=4;  // создание локальных переменных
        int c=4;
        System.out.print(compare(a,b,c)); // вызов метода compare
    }
    public static boolean compare (int a,int b,int c) {

        return a==b && b==c;
    }
}
