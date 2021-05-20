package cz.educanet;

public class Operations {

    public int getPlus(int a, int b) {
        return a + b;
    }

    public int getMinus(int a, int b) {
        return a - b;
    }

    public int getMultiply(int a, int b) {return a * b;}

    public double getDivide(double a, double b) {return a / b;}

    public double getPow(double a, double b){return Math.pow(a, b);}

    public int getFactorial(int a) {
        int b = 1;
        for (int i = 2; i <= a; i++) {
            b = b * i;
        }
        return b;
    }
}
