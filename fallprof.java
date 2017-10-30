public class fallprof {
 public static void main(String[] args) { 
double x = Double.parseDouble(args[0]);
 double y;

 if (x < 1)
 y = 2.0*x + 1.0;
 else if (x < 2)
 y = x*x + 2.0;
 else if (x < 3)
 y = x*x*x - 2.0;
 else
 y = (x+2.0)*(x+2.0);

 System.out.println("f(" + x + ") = " + y); 
 System.out.println("53" + (5 + 3));
 }
}