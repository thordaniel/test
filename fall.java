public class fall {
  public static void main(String[] args) {
      double x = Double.parseDouble(args[0]);
      double sum;
      
      if(x < 1) {
          sum = (2*x + 1);
          System.out.print(sum);
      }
      else if(1 <= x && x < 2) {
          sum = (Math.pow(x,2) + 2);
          System.out.print(sum);
      }
      else if(2 <= x && x < 3) {
          sum = (Math.pow(x,3) - 2);
          System.out.print(sum);
      }
      else {
          sum = (Math.pow(x + 2, 2));
          System.out.print(sum);
      }
  }
}