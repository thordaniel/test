public class Jafngrei�sla {
    public static void main(String[] args) {
        
        double H = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double n = Double.parseDouble(args[2]);

               double a = (H * Math.pow((1 + r),n)*r) / (Math.pow((1+r),n) - 1);
        
        System.out.println("Hver grei�sla er " + a);
        System.out.println("Samtals grei�sla er " + a*n);
        
    }
}