public class skiptifall {
    public static int[] skipta(int[] a) {
        int[] b = new int[2*a.length];
        
        int i = 0, n = 0;
        for(i = 0, n = 0; i < a.length; i++, n += 2) {
          if(a[i] % 2 == 1) {
            b[n]= a[i]/2 + 1;
            b[n+1] = a[i]/2;
          } else {
            b[n] = a[i]/2;
            b[n+1] = a[i]/2;
          }
        }
        return b;
    }    
    public static void main(String[] args) {
        int N = 10;
        int[] a = new int[N];
            
        for(int i = 0; i < N; i++) 
           a[i] = (int)(Math.random()*20)+1;
           
        int[] b = skipta(a);
        
        for(int i = 0; i < b.length; i++)
           System.out.print(b[i] + " ");
        
        System.out.println();
    }
}