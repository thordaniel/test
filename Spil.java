public class Spil {
     public static void main(String[] args){
         
         char litur = args[0].charAt(0); 
         char gildi = args[1].charAt(1);
           
         {
             if (litur == H) {
             System.out.print("Hjarta");
           } else if (litur == S) {
             System.out.print("Spaða");
           } else if (litur == T) {
             System.out.print("Tígul");
           } else if (litur == L) { 
             System.out.print("Laufa");
           } else { System.out.print("Sort ekki til.");
           }
         }
         
         switch (gildi) {
             case 2:
             System.out.print("tvistur"); break;
             case 3:
             System.out.print("þristur"); break;
             case 4:
             System.out.print("fjarki"); break;
             case 5:
             System.out.print("fimma"); break;
             case 6:
             System.out.print("sexa"); break;
             case 7:
             System.out.print("sjöa"); break;
             case 8:
             System.out.print("átta"); break;
             case 9:
             System.out.print("níu"); break;
             case 10:
             System.out.print("tía"); break;
         }
         {
               if (gildi == G) {
               System.out.print("gosi");
             } else if (gildi == D) {
               System.out.print("drottning");
             } else if (gildi == K) {    
               System.out.print("kóngur");
             } else if (gildi == Á) {
               System.out.print("ás");
               
             }
         }
     }
}
