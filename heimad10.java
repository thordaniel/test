public class heimad10 {
    public static void main(String [] args) {
        for(double n = 2.0; n < Math.pow(2,14); n*=2.0) {
           System.out.println(Math.pow(1+(1.0/n),n));
        }
    }
}