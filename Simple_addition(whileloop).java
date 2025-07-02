/* this code is to help generate random numbers and count the correct answer inputed by a user and ask users to answer more questions until the user gets up to 
5 correct answers. it then tells the amount of time spent during the session
*/

import java.util.Scanner;
public class TryingLoop_again1 {
    public static void main (String [] args){
       final int Questions = 5;
       int count = 0;
       int Count_Correct_Answers = 0;
       int start_time = (int) System.currentTimeMillis();
       String output = " ";
       
       
       //Create a Scanner
       Scanner input = new Scanner (System.in);
       
        
        //now start the loop
        while (count < Questions){
            //create random numbers
             int number1 = (int)(Math.random() * 10);
             int number2 = (int)(Math.random() * 20);
                  //Assign the larger number to number1
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
            //ask the question
        System.out.println(" What is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        
            if ((number1 + number2) != answer){
                  System.out.println(" wrong");
                count++;
            }
            if ((number1 + number2) == answer){
                System.out.println(" correct ");
                Count_Correct_Answers++; 
            } else if (count > Questions ){
                System.out.println(" it's okay" + "try again next time");
            }
            
                
        }
            
            // calculate the time
            int endtime = (int) System.currentTimeMillis();
            int Total_time = endtime - start_time;
            
            output = " you scored " + Count_Correct_Answers + " in " + Total_time/1000 + " sec ";
            
            System.out.println( output);
            
        
        
      
          
    }
}