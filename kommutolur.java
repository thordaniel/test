public class kommutolur {
     public static void main(String[] args){
         
         double x = Double.parseDouble(args[0]);
         double b;
         double epsilon = 1e-7;
         
         b = ((Math.sqrt(x) * Math.sqrt(x)) - x);
         
         if (b < epsilon){
             System.out.print("N�stum �v� sama talan, e�a �a� munar " + b);
         }
         else {
             System.out.print("Ekki sama talan, e�a �a� munar " + b);
         }
     }
}