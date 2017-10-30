public class KrakkarLeika {
    public static void main(String[] args) {
      double hitastig = Double.parseDouble(args[0]);
      boolean sumar = Boolean.parseBoolean(args[1]);
          
      if (sumar == false) {
        if ((hitastig > -10) && (hitastig < 25)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
      }
      
      else 
      
      {
        if ((hitastig > 0) && (hitastig < 25) && (sumar == true)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }         
      }
      
     }
    }