public class Div7 {
     public static void main(String[] args){
         
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         boolean isDiv7;
         
         isDiv7 = (a % 7 == 0) && (b % 7 == 0);
         System.out.print(isDiv7);
        
     }
}