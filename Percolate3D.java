public class Percolate3D {

    // do specified number of trials and return fraction that percolate
    public static boolean[][] flow(boolean[][] isOpen) {
        int N = isOpen.length;
        boolean[][] isFull = new boolean[N][N];
        for (int j = 0; j < N; j++)
            if (isOpen[0][j]) flow(isOpen, isFull, 0, j);
        return isFull;
    }
    public static void flow(boolean[][] isOpen,
                            boolean[][] isFull, int i, int j) {
        int N = isFull.length;
        if (i < 0 || i >= N || j < 0 || j >= N) return;
        if (!isOpen[i][j]) return;
        if ( isFull[i][j]) return;
        
        isFull[i][j] = true;          // mark
        flow(isOpen, isFull, i+1, j); // down
        flow(isOpen, isFull, i, j+1); // right
        flow(isOpen, isFull, i, j-1); // left
        flow(isOpen, isFull, i-1, j); // up
        flow(isOpen, isFull, i+1, j+1); // fram
        flow(isOpen, isFull, i-1, j-1); // aftur
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);
        int [][][] a = new int [N][N][N];
        StdOut.println();
    }
}