public class TvoMinnstu{
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         double[] fylki = new double[N];
         
         
         for (int i = 0; i < N; i++) {
             fylki[i] = ((Math.random()*40)-20);
         }
         double minnsta = fylki[0];
         double naestminnsta = fylki[0];
             
         for(int i = 0; i < N; i++) 
         {
             if(fylki[i] < minnsta) 
             {
                double geymsla = minnsta;
                minnsta = fylki[i];
                naestminnsta = geymsla;
         }
             else if (fylki[i] < naestminnsta) 
             {
                 naestminnsta = fylki[i];
             }
         }
         System.out.println("Minnsta talan er: " + minnsta);
         System.out.println("Næstminnsta talan er: " + naestminnsta);
     }
}