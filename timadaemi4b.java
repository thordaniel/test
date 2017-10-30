public class timadaemi4b{
     public static void main(String[] args){ 
         
         int N = Integer.parseInt(args[0]);
         
         for(int i = N; i > 0; i--) {
         for(int j = i; j < N + 1; j++) {
             System.out.print("*");
         }
             System.out.println();
         }
        
     }
}