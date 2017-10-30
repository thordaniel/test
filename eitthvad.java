public class eitthvad {
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         
         double sum = 4;
         for (int i = 1; i <= N; i++) {
             sum += 1.0 / Math.pow(4,i);
         }
         
         System.out.println(sum);
     }
}