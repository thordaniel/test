public class Stjornur {
public static String stjornur(int n) {
    if(n == 0) return "";
    return stjornur(n-1) + "*";
}
public static void main(String[] args) {
int N = Integer.parseInt(args[0]);
StdOut.println(stjornur(N));
}
}