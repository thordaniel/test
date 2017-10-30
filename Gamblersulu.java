public class Gamblersulu {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        
        int[] a = new int[1000000];
        int cash = stake;
        int gildi = 0;
        
        while (cash > 0 && cash < goal) {
            a[gildi] = cash;
            gildi++;
            
            if (Math.random() < 0.5) cash++;
            else cash--;
        }
        a[gildi] = cash;
        double[] b = new double[gildi + 1];
        
        for(int i = 0; i <= gildi; i++)
            b[i] = a[i]/(1.0*goal);
        
        StdStats.plotBars(b);
    }
}