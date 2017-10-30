public class SlembiGanga{
     public static void main(String[] args){
         int N = Integer.parseInt(args[0]);
         int a = 0;
         int b = 0;
         int Skref = 0;
         
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
         System.out.print("Skrefafjöldi: " + Skref);
     }
}