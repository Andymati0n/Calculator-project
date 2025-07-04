/*The code is to help introduce BOOLEAN, and also help in creating addition quiz for first graders (re- code this later)
 */
import java.util.Scanner;
public class additionQuiz {
    public static void main (String[] args){
        //generate number 1 and 2
   int number1 = (int) (Math.random() * 10);
   int number2 = (int) (Math.random() * 10);
 int number3 = (int) (Math.random () * 10 );
   
   //Create a scanner
   Scanner input = new Scanner (System.in);
   
   //prompt users to enter an answer
   System.out.println(" What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
   int number = input.nextInt();
   
   int answer = number1 + number2 + number3 ;
    
   if (number == answer)
System.out.println ("you are correct the answer is " + answer ) ;
   
   else if ( number  != answer )
       System.out.println ("You are wrong, " + ""
               + "the answer to the addition of the number "   + number1 +  " + " + number2 + " + " + number3 + " = " + answer ) ;

    }
}