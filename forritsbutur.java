public class forritsbutur{
public static void draw(int n, double x, double y, double size) {
         if (n == 0) return;
        
        // 2.2 ratio looks good
        double ratio = 2.2;
        // recursively draw 4 smaller trees of order n-1
        draw(n-1, x - size/2, y - size/2, size/ratio);    // lower left 
        draw(n-1, x + size/2, y + size/2, size/ratio);    // upper right
        draw(n-1, x + size/2, y - size/2, size/ratio);    // lower right 
        drawSquare(y, x, size);
        draw(n-1, x - size/2, y + size/2, size/ratio);    // upper left
        
    }
public static void draw(int n, double x, double y, double size) {
         if (n == 0) return;
        
        // 2.2 ratio looks good
        double ratio = 2.2;
        // recursively draw 4 smaller trees of order n-1
        draw(n-1, x - size/2, y - size/2, size/ratio);    // lower left 
        draw(n-1, x + size/2, y + size/2, size/ratio);    // upper right
        draw(n-1, x + size/2, y - size/2, size/ratio);    // lower right 
        draw(n-1, x - size/2, y + size/2, size/ratio);    // upper left
        drawSquare(y, x, size);
        
    }