public class samleifaradferd {
    public static int slembi43271(int r) {
        int a = (29*(r)+1) % 43271;
        
        return a;
    }

    public static void main(String[] args) {
        StdDraw.setXscale(0.0,1.0);
        StdDraw.setYscale(0.0,1.0);
        
        int x = 0, y = 0;
        
        for(int i = 0; i < 10000; i++) {
          for(int j = 0; j < 2; j++) {
            x = slembi43271(y);
            y = slembi43271(x);
            StdDraw.point(x/43271.0, y/43271.0);
          }
        }
    }
}