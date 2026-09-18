public class Main {
    public static void main(String[] args) {
        double a = 3.56;
        double b = 1.02;
        double c = 3;
        double d = 2.43;

        double result4 = Math.pow((Math.tan(a)), 1.0 / c) / ( 1 + Math.sinh(b) / Math.log(Math.abs(d + c)));

        System.out.println("Result: " + result4);


        double a1 = 1.54;
        double b1 = 0.49;
        double c1 = 24.1;
        double d1 = 0.87;

        double result14 = 2 * (Math.sqrt(Math.sin(a1) / Math.abs(Math.tan(b1 - a1)) + Math.log(c1) / d1));

        System.out.println("Result: " + result14);


        double a2 = 0.345;
        double b2 = -2.25;
        double c2 = 2.65;
        double d2 = 3.99;

        double result24 = (Math.cos(b2) + Math.sin(Math.sqrt(a2))) / (2 * Math.log10(c2) + Math.pow(Math.E, d2));
        System.out.println("Result: " + result24);  
    }
}