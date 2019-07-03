public class SomeMath {
    public static void main(String[] args) {
        int total = total5(1, 2, 3, 4, 5);
        double total2 = average5(1, 3, 5, 7, 9);
        double total3 = largest5(42.0, 35.1, 2.3, 40.2, 15.6);

        System.out.println("1 + 2 + 3 + 4 + 5 = " + total);
        System.out.println("The average: " + total2);
        System.out.println("Largest number: " + total3);

    }

    public static int total5(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;

    }

    public static double average5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }

    public static double largest5(double a, double b, double c, double d, double e) {
        if (a > b && a > c && a > d && a > e) {
            return a;
        } else if (b > a && b > c && b > d && b > e) {
            return b;
        } else if (c > b && c > a && c > d && c > e){
            return c;
        } else if (d > b && d > a && d > c && d > e) {
            return d;
        } else {
            return e;
        }

    }

}

