public class Minustiu{
     public static void main(String[] args){
       
  int max = 10;
  int min = -10;
  int range = max - min + 1;  

  int rand = (int) (Math.random()* range) + min;
  System.out.println(rand);

     }
}