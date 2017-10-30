public class buggy {
    public static double BuggySum(double[] a, int k) {
      if (k == 0) return a[k];
      else return a[k] + BuggySum(a, k-1);
    } 
    public static void main(String [] args) {
        double b[] = {5.1,5.5,3.3,1.0,3.3};
        int n = b.length-1;
        
        StdOut.println(BuggySum(b,n));
    }
}