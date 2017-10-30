public class Thorskaslembino2 {
    public static int thrirThorskar(int N) {
        int kast = 0;
        int thorskur = 0;

        while(thorskur < 3){
            for(int i = 0; i < N; i++){
                i = (int)(Math.random());
                   if (i < 0.5) {
                   thorskur++;
                   kast++;
                   } else {
                   kast++;
                   thorskur = 0;
                   }
         return kast;
            }
        }
    }

    public static void main(String[] args) {
        int i = 100000;
        double j = ((i * thrirThorskar(3)) / i);
            StdOut.println("Meðalfjöldi kasta þegar gert er 100.000 sinnum: " + j);
    } 
} 