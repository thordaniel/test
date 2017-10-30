public class Efrihluti{
     public static void main(String[] args){
         int N = args.length;
         int[] fylki = new int[N];
         int summa = 0;
         double medaltal = 0;
         int fjoldi = 0;
         
         for (int i = 0; i < N; i++) {
             fylki[i] = Integer.parseInt(args[i]);
         }
         
         for (int i = 0; i < N; i++) {
            summa = summa + fylki[i];
         }
         
         medaltal = summa / N;
             
         for (int i = 0; i < N; i++) {
             if(fylki[i] > medaltal) {
                 fjoldi++;
         }
         }
                               
         System.out.println("Lengd fylkisins: " + N);
         System.out.println("Meðaltalið: " + summa/N);
         System.out.println("Fjöldi talna yfir meðaltali: " + fjoldi);
     }
}
         
         