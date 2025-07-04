/*this code is to help with multiplication( loop)*/
import java.util.Scanner;
public class MultiplicationJava {
    public static void main (String [] args){
      final int Number_of_Trials = 6; //how many times the question should be attempted
      int CorrectAnswer = 0; // how many correct answers the person got
      int count = 0; // count the numbers of questions
      long startTime = System.currentTimeMillis();
      String output = " "; // output string is initially empty
      
         //create a Scanner
         Scanner input = new Scanner (System.in);
         
         while (count < Number_of_Trials){
      //create random numbers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int) ( Math.random () * 10 );
      
      //to help switch when there's a bigger number out of the two random numbers
      int temp = number1;
      number1 = number2;
      number2 = temp;
   
      //prompt the user to enter the answer to the questions
        System.out.println("What is " + number1 + " * " + number2 + " ? " );
        int answer = input.nextInt();
        
        if (number1 * number2 == answer ){
            System.out.println(" you are correct ");
            //increase the correct answer 
             CorrectAnswer++;
        }
        else {
                 System.out.println(" try again\n" + number1 + " * " + number2 + " should be "
               + (number1 * number2) + " \n what is " + number1 + " * " + number2 + " ? ");
        }
        //increase the numbers of questions                                                                         
        count++;
        
        
        output += "\n" + number1 + " * " + number2 + " = " + answer + ((number1 * number2 == answer) ? " correct " : " wrong");
        
    }
          long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
             System.out.println(" You got  "  + CorrectAnswer + " points "+ "\n Test time is "
             + testTime/1000 + " seconds \n " + output );
    }
}
