public class harmonic {
    public static double hmean(double[] a) {
        int N = a.length;
        double sum = 0.0;
       
            for(int i = 0; i < N; i++)
               sum += 1/a[i];
            
            return N / sum;
    }
    public static void main(String[] args) {
        double[] a = new double[10];
        
        for(int i = 0; i < 10; i++)
            a[i] = Math.random()*10;
        
        double mean = StdStats.mean(a);
        
        System.out.println("Meðaltal: " + mean);
        System.out.print("Þýtt meðaltal : " + hmean(a)); 
    } 
} 