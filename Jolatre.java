public class Jolatre{
     public static void main(String[] args){ 

         int N = Integer.parseInt(args[0]);
 
    for(int i = 1; i <= N; i++) { 
        for(int j = i; j < N; j++) {
            System.out.print(" ");
        }
        for(int j = 1; j <= (2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
     }
}


