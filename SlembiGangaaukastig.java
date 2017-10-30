public class SlembiGangaaukastig{
     public static void main(String[] args){

         for (int N = 2; N <= 15; N++) {
         
         int Skref = 0, i;
         
         for (i = 1; i <= 100000; i++) {
             
             int a = 0;
             int b = 0;
         
             while(Math.abs(a) < N && Math.abs(b) < N) {
             
             int att = (int)(Math.random()*4.0) + 1;
             if (att == 1) {
                 a += 1;
             }
             else if (att == 2) {
                 a -=1;
             }
             else if (att == 3) {
                 b += 1;
             }
             else { 
                 b -= 1; 
             }
             Skref++;
         }
         }
         double c = Skref/100000.0;
         System.out.println("Meðalskrefafjöldi sem Siggi tekur fyrir " + 2*N + "*" + 2*N + " völl eru: " + c + " skref.");
         }
     }
}