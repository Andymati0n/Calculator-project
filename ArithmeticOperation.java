/*This code helps in calculating arithmetic operation*/
import java.util.Scanner;
public class ArithmeticOperation1 {
    public static void main (String[] arg){
        Scanner input= new Scanner (System.in);
       int Score = input.nextInt ();
       
       if (Score >= 90)
           System.out.println ( " A ");
       else if (Score >= 80 )
       System.out.println ( " B ");
        else if (Score >= 70 )
       System.out.println ( " c ");
        else if (Score >= 60 )
       System.out.println ( " D ");
       else
            System.out.println (" F");
    }
       
    
}
