public class Summaendurkvaemi 
{
    public static int stafaSumma(int n) 
    {   
        if (n == 0) return 0;           
        else return n%10 + stafaSumma(n/10);
    }
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        
        System.out.print("Summa tölunnar "+ n + " er: " + stafaSumma(n));
    } 
}