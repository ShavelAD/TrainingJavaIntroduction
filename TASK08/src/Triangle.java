/**
 * Created by user on 08.05.2019.
 */
public class Triangle {
    public static void main(String[] args){
        int x1=0;
        int y1=1;
        int x2=0;
        int y2=3;
        int x3=0;
        int y3=5;

        System.out.println("Is Triangle?"+ " "+"Answer: "+isTriangle(x1,y1,x2,y2,x3,y3));
        System.out.println("Is Right Triangle?"+ " "+"Answer: "+isRightTriangle(x1,y1,x2,y2,x3,y3));

    }
     static boolean isTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        double sideA;
        double sideB;
        double sideC;

        sideA=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        sideB=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        sideC=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));

        return sideA<sideB+sideC && sideB<sideA+sideC && sideC<sideA+sideB;
    }
    static boolean isRightTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        if (!isTriangle(x1, y1, x2, y2, x3, y3)) {
            return false;
        }

        double sideA;
        double sideB;
        double sideC;

        sideA = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        sideB = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        sideC = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));

        return sideA == Math.sqrt(Math.pow(sideB,2)+Math.pow(sideC,2)) ||
                sideB == Math.sqrt(Math.pow(sideA,2)+Math.pow(sideC,2)) ||
                sideC == Math.sqrt(Math.pow(sideB,2)+Math.pow(sideA,2));
    }
}
