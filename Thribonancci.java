public class Thribonancci 
{
    private static long [] f = new long[999999];
    public static long triboRec(int n) 
    {
        if (n <= 1) return 0;
        if (n == 2) return 0;
        if (n == 3) return 1;
        if (f[n] > 0) return f[n]; 
        return f[n] = triboRec(n-1) + triboRec(n-2) + triboRec(n-3);
    }
public static long tribo(int n) {
        long[] f = new long[n+1];
        f[0] = 0; 
        f[1] = 0; 
        f[2] = 0;
        f[3] = 1;
        for (int i=4; i<=n; i++) {      
            f[i] = f[i-1] + f[i-2] +f[i-3];  
        }   
        return f[n]; 
    }
        
    public static void main(String[] args) 
    {
        int N = Integer.parseInt(args[0]);
        
        System.out.println("Með endurkvæmni: " + triboRec(N));
        System.out.println("Án endurkvæmni: " + tribo(N));
    } 
} 