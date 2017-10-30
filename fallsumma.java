public class fallsumma {
    public static int thversumma(int n) {
        int sum = 0;
        int a = n;
        
        while(a > 0) {
            sum += a % 10;
            a = (a - (a % 10)) / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = thversumma(2652542);
        
        System.out.print(i);
    } 
} 