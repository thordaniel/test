public class test3 {
     public static void main(String[] args){
         int fact = 1;
         int N = 20;
         int margfeldi = 0;
         
         for (int i = 1; i <= N; i++); {
             fact = fact*i;
         }
         System.out.print("Factorial of " + N + "is " + fact);
             
     }
}