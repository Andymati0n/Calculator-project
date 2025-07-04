/* for this particular code, im going to try to use the switch statement for addition, subtraction, multiplication and division,*/
import java.util.Scanner;
public class UsingSwitchforCalculator {
    public static void main (String [] args){
        
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        // prompt users to a pick a number for the operation they would like to perform
        System.out.println(" Choose a number for to perform the any of the following operation\n " + "Additon (1)\n" + " Subtraction (2)\n "
        + "Multipliication (3) \n " + "Division (4) \n");
         
        //checking for users input
        System.out.print(" which operation do you want to perform? : ");
        int UserInput = input.nextInt();
     
        //using the switch statement
        
        switch (UserInput){
            //Addition
            case 1: System.out.print(" You picked Additon, ");
                System.out.print(" You are allowed to add only two numbers ");
                System.out.println(" ");
                //allow users enter their numbers
                System.out.print(" Enter the first number: ");
                int number1 = input.nextInt();
                  System.out.print(" Enter the second number: ");
                int number2 = input.nextInt();
                // add the numbers and display the results
                int answer = (number1 + number2 );
                System.out.println(" the answer is " + answer);
                input.close();
                break;
                
                // Subtraction
            case 2: System.out.print(" you picked Subtraction,");
                System.out.print(" You are only allowed to subtract two numbers ");
                System.out.println("");
                //allow users to enter their numbers
                System.out.print("Enter the first number: ");
                int numb = input.nextInt();
                System.out.print(" Enter the second number ");
                int numb2 = input.nextInt();
                
                  //creating a temporary variable for storing data
                 int temp ;
                // checking to see just incase numb2 is bigger than number 1
             if (numb2 > numb){
                 // using temp to temporarily store the biggest data
                 temp = numb;
                 numb=numb2;
                 numb2 = temp;
             }
             
             // to subtract your answers
             int ans = (numb - numb2 );
                System.out.println(" your answer is " + ans);
                input.close();
                break;
                
           //multiplication
            case 3: System.out.print(" You picked Multiplication, ");
                System.out.print(" you are only allowed to multiply two numbers");
                System.out.println(" ");
                //allow users input their desired numbers
                System.out.print(" Enter the first number:");
                int no1 = input.nextInt();
                System.out.print(" Enter the second number");
                int no2= input.nextInt();
                
                int answ = no1 * no2;
                
                System.out.println(" Your answer is " + answ);
                input.close();
               break;
                       
           // Division
            case 4: System.out.println(" You picked Division, ");
                System.out.println(" you are only allowed to divide two numbers");
                System.out.println("");
                //allow users type in their numbers
                System.out.println(" Enter the first number: ");
               int N1 = input.nextInt();
               double D1 = N1;
                System.out.println(" Enter the second number: ");
                int N2 = input.nextInt();
                double D2 = N2;
                
               double TEMP;
                //swapping between large numbers
               if (D2 > D1){
                TEMP = D1;
                D1 = D2;
                D2 = TEMP;
               }
                
                // answer;
             double ANS = D1/D2;
                System.out.println(" The answer is " + ANS + " remainder " + ( D1%D2) );
                input.close();
                break;
                
            default:
                System.out.println(" Sorry, wrong input ");
                System.exit(1);
             
        }
        
        
         
    }
    
}
