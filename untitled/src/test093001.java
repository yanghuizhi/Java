public class test093001 {
    public static void main(String[] args) {
        double result = pround(3.5232344, 4);
        System.out.println(result);
    }

    static double pround(double value, int index) {
        double pow10 = Math.pow(10, index);
        double result = value * pow10;
        result = Math.round(result);
        result = result * 1.0 / pow10;
        return result;
    }
}
