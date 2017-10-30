public class Pell15{
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         int a = 1;
         int b = 0;
         int c;
         
           for(int i = 0; i <= N; i++) {
           c = a + (2*b);
           a = b;
           b = c;
           if(N <= c) {
           System.out.print("Pell tala númer " + (i + 1));
           System.out.println(", sem er " + c + ".");
           }
         }
     }
}
