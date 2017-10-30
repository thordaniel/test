public class kommutolur {
     public static void main(String[] args){
         
         double x = Double.parseDouble(args[0]);
         double b;
         double epsilon = 1e-7;
         
         b = ((Math.sqrt(x) * Math.sqrt(x)) - x);
         
         if (b < epsilon){
             System.out.print("Næstum því sama talan, eða það munar " + b);
         }
         else {
             System.out.print("Ekki sama talan, eða það munar " + b);
         }
     }
}