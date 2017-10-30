public class Leit {    
    public static int finna(int[] a, int x) {     
        
        int N = a.length;
        
        for (int i = 0; i < N; i++) {
            if( a[i] == x){
                return i;
                
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args) {      
        int[] a = new int[10];         
        
        for (int i=0; i<10; i++)        
            
            a[i] = (int) (Math.random()*10);      
        
        StdOut.println("2 er i saeti " + finna(a, 2));      
        
        StdOut.println(finna(a, 15));     
        
    } 
}