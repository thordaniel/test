public class timadaemi7 {
    public static String stjornur(int n) {
        String a = "";
        
        for(int i = 1; i <= n; i++) {
        a += ("*");
        }
        return a;
    }
    public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            
            StdOut.println(stjornur(n));
        
    }
}
            