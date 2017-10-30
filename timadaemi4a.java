public class timadaemi4a{
     public static void main(String[] args){ 
         
         double d = Math.random();
         int count = 1;
         while (d < 0.9) {
             d = Math.random();
             count++;
          System.out.println(d);
         }
         //aukadæmi
         System.out.println(count);
         
     }
}