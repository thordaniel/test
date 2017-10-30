public class VixlaPorum{
     public static void main(String[] args){
         int N = args.length;
         String geyma;
        
         String[] fylki = new String[N]; {
         for (int i = 0; i < N; i++)
             fylki[i] = String.valueOf(args[i]);
        
         }
         for (int i = 0; i < N - 1; i++)
                if(i % 2 == 0) {
                geyma = fylki[i];
                fylki[i] = fylki[i+1];
                fylki[i + 1] = geyma;
             }
         for(int i = 0; i<N;i++)
         System.out.print(fylki[i] + " ");
     }       
}