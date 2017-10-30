public class Power {
    public static double recPow(double x, int n) {
        
        if (n < 0) {
        }
        if (n == 0) {
            return 1;
        } else {
            return x*recPow(x, n - 1);
        }
    }
    
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(recPow(x,n));
    }
}