public class gambler {
    public static double gambler(int a, int b) {
       int stake  = a;    
       int goal   = b;        

       int bets = 0;        
       int wins = 0;        

           for (int t = 0; t < trials; t++) {

           int cash = stake;
           while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++; 
    }
    public static void main(String[] args) {
        int[] a = new int[1000000];
        
        
        StdDraw.setYscale(0, 100);
        StdDraw.setPenColor(StdDraw.BLUE);
        
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(100);
        }
        StdStats.plotBars(a);
    } 
} 

