public class ProfaBenford1 {
    public static int fremstiStafur(int n) {
        int count = 1;
        int a = n;
        
        while(a > 9){
            a /= 10;
            count *= 10;
        }
        return n/count;
    }    
    public static void main(String[] args) {
        int[] a = new int [10];
        int count = 0;
        
        while(!StdIn.isEmpty()){
            int i = fremstiStafur(StdIn.readInt());
            count++;
                
            switch(i){
                case 1: a[1]++; break;
                case 2: a[2]++; break;
                case 3: a[3]++; break;
                case 4: a[4]++; break;
                case 5: a[5]++; break;
                case 6: a[6]++; break;
                case 7: a[7]++; break;
                case 8: a[8]++; break;
                case 9: a[9]++; break;
            }
        }
                    
        System.out.println("\tStafur\tPrósenta    Benford");
        System.out.println("\t------------------------------");
        
        for(int i = 1; i < 10; i++) {
            double prosenta = 100*(a[i]/(1.0*count));
            double benford = 100*(Math.log(1 + 1.0/i)/Math.log(10));
            System.out.printf("\t  %1d       %5.2f%%      %5.2f%% \n", i, prosenta, benford);
        }
    }
}