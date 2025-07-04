/** this code is to make users interact with my code and calculate the average of five numbers **/
import java.util.Scanner; /** this helps us call the Scanner Utility**/
public class Average{
    public static void main (String [] args){
    Scanner input= new Scanner (System.in);  /** this helps us create a Scanner Object**/
      System.out.print("Enter the numbers here:"); /** this prompts users to enter the numbers**/
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();
      double number4 = input.nextDouble();
      double number5 = input.nextDouble();
      
      double Average = (number1 + number2 + number3 + number4 + number5 ) / 5; /** this helps in calculating the average by adding all the input numbers and dividing it by 5**/ 
      
      System.out.println ("The total average of" + number1 + "" + number2 + "" + number3 + "" + number4 + "" + number5 + "" + "is" + "" + Average);
            
}
}
