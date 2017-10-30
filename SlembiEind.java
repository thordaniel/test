public class SlembiEind {
    public static void main(String[] args) {
        boolean[][] fylki = new boolean[10][10];
        int a = 4;
        int b = 4;
        int Skref = 0, endir = 0;
        
        while (endir < 100) {
            int att = (int)(Math.random()*4.0) + 1;
            
            if (att == 1) {
                if (a < 9) {
                    a += 1;
                }
            }
            else if (att == 2) {
                if (a > 0) {
                    a -= 1;
                }
            }
            else if (att == 3) {
                if (b < 9) {
                    b += 1;
                }
            }
            else {
                if(b > 0) {
                    b -= 1;
                }
            }
            if (fylki[b][a] == false) {
                fylki[b][a] = true;
                endir++;
            }
            Skref++;
        }
       System.out.println("Fjöldi skrefa: " + Skref);
    }
}
        