public class Hringur {
     public static void main(String[] args){
         
         double r = (Double.parseDouble(args[0]));
         double e = Math.PI;
         
        double ummal = 2 * e * r;
        double flatarmal = e * r * r;
        
        if(r <= 0)
            System.out.print("Ekki til");
        else {
          System.out.println("Ummál hringsins er: " + ummal);
          System.out.println("Flatarmál hringsins er: " + flatarmal);
        }
     }
}