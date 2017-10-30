public class Thorskaslembi {
    public static int thrirThorskar() {
        int kast = 0;
        int thorskur = 0;

            for(int i = 0; i < 3; i++) {
            i = (int)(Math.random()*2);
            if (i < 1) {
              thorskur++;
              kast++;
              if(thorskur == 3) {
                  break;
              }
            }
            else {
              kast++;
              thorskur = 0;
            }
            }
         return kast;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100000; i++) {
           sum += thrirThorskar();
        }
            System.out.println("Meðalfjöldi kasta þegar gert er 100.000 sinnum: " + sum/100000.0);
    }
}