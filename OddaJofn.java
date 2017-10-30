public class OddaJofn{
     public static void main(String[] args){  
         int[] A = new int[25];
         int slett = 0;
         int odda = 0;

         for (int i = 0; i < 25; i++) {
            A[i] = (i+1) + (int)(Math.random()*20);
            if (A[i] % 2 == 0)
               slett++; 
            else 
               odda++;
         }
         for (int i = 0; i < 24; i++) {
             System.out.print(A[i] + ", ");
         }
         System.out.println(A[24]);    
         
           System.out.println();
           if (odda < slett) {
           System.out.println("Fleiri oddatölur");
           }
           else {
           System.out.println("Fleiri jafnar tölur");    
           }
     }
}