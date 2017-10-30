public class Vakna {
     public static void main(String[] args){
        int vikudagur = Integer.parseInt(args[0]);
        boolean fridagur = Boolean.parseBoolean(args[1]);
        
        if (vikudagur < 7) {
            System.out.print("Þú átt að vakna kl. ");
        } else {
            System.out.print("");
        }
        
        if (fridagur = false) {
            switch (vikudagur) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("7:00."); break;
            case 6: case 7:
                System.out.println("10:00."); break;
            default:
            System.out.println("Vikudagur ekki til."); break;
            }
        } else {
            switch (vikudagur) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("10:00."); break;
            case 6: case 7:
                System.out.println("12:00, mátt vakna fyrr."); break;
            default:
                System.out.println("Vikudagur ekki til."); break;
                
            }
        }
     }
}