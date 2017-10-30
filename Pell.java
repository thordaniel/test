public class Pell{
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         int a = 1;
         int b = 0;
         int c, count = 1;
         
           while(a < N) {
           c = a; 
           a = b + (2*a);
           b = c;
           count++;
           }
           System.out.print("Pell tala númer " + count);
           System.out.println(", sem er " + a + ".");
     }
}