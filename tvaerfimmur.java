public class tvaerfimmur {

    public static boolean fimmur(int[] a) {
        int N = a.length;
        boolean fimma = true;
        
        for(int i = 0; i < N - 1; i++){
            if(a[i+1] == 5 && a[i] != 5)
               fimma = false;
        }
        if(a[N-1] == 5 && a[N-2] != 5){
           fimma = false;
        }
        return fimma;
     }

    public static void main(String[] args) {
        int N = args.length;
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++)
            a[i] = Integer.parseInt(args[i]);
        
        if (fimmur(a) == false)
            System.out.print("Stök fimma");
        else 
            System.out.print("Engin stök fimma");
    } 
} 