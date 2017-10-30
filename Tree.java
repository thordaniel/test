public class Tree {
    public static void tree(int n, double x, double y, double a, double branchRadius) {
        double bendAngle   = Math.toRadians(15);
        double branchAngle = Math.toRadians(37);
        double branchRatio = Math.random()*0.65;
        double cx = x + Math.cos(a) * branchRadius;
        double cy = y + Math.sin(a) * branchRadius;
        StdDraw.setPenRadius(((Math.random()*0.0015)+0.0002) * Math.pow(n, 1.2));
        StdDraw.line(x, y, cx, cy);
        if (n == 0) return;
        tree(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio);
        tree(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio);
        tree(n-1, cx, cy, a + bendAngle, branchRadius * (1 - branchRatio));
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 100;i++){
        double d = Math.random();
        double f = Math.random()*0.3+0.18;
        double y = Math.random()*0.3; 
        int n = (int)(Math.random()*7 + 2);
        
StdDraw.setPenColor(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
        StdDraw.enableDoubleBuffering();
        tree(n, d, y, Math.PI/2, f);
        StdDraw.show();
        }
    }
}