public class Pellauka{
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         int a = 1;
         int b = 0;
         int c;
         int i = 1;
         
           do {
           c = a + (2*b);
           a = b;
           b = c;
           System.out.print("Pell tala númer " + (i));
           System.out.println(", sem er " + c + ".");
           i++;
           } while (N <= c);
           
     }
}