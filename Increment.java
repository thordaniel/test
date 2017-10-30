public class Increment{
     public static void main(String[] args){
         int N = args.length;
             
         int[] a = new int[N];
         for(int i = 0; i < N; i++) {
             a[i] = Integer.parseInt(args[i]);
             a[i] = a[i] + 1;
         
         System.out.print(a[i] + " ");
         }
     }
}