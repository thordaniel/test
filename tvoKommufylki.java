public class tvoKommufylki 
{
    public static double[] maxSoFar(double[] a) 
    {
        int A = a.length;
        double [] b = new double[A];
        double max = a[0];
            
            for(int i = 0; i <= A-1; i++){
                if(a[i] > max)
                  max = a[i];
                b[i] = max;
            }
        return b;
    } 
    public static void main(String [] args) 
    {
        int N = Integer.parseInt(args[0]);
        double a [] = new double[N];
            
        for(int i = 0; i < N; i++)   
            a[i] = Math.random();

        System.out.println("a fylkið: " + "\t\t\t" + "b fylkið:");
        
        for(int i = 0; i < N; i++){
            double [] d = maxSoFar(a);
            System.out.println(a[i] + "\t\t" + d[i]);
        }
    }
}