public class endurkvaemniX {
    public static double recPow(double x, int n) {
        if(n == 0) return 1;
        else if(n%2 == 0)
            return recPow(x,n/2) * recPow(x,n/2);
        else
            return recPow(x,(n-1)/2) * recPow(x,(n-1)/2) * x;
    }
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        
        System.out.print("X^n er: " + recPow(x,n));
    }
}