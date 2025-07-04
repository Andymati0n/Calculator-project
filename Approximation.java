public class Approximation{
    public static void main (String[] args){
        // approximation for the first part.... we are using double because it is crucial for ensuring the precision of floating point arithmrtic
        //floating point precision is necessary to achieve accurate results.....
        double Approx = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) -(1.0 / 11) );
        
       double Approx2 = 4 * (1.0 - (1.0 / 3)+ (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0/11) + (1.0 / 13));
       System.out.println(Approx + Approx2);
       System.out.println("Approx 1:"  + Approx);
       System.out.println("Approx 2:"  + Approx2);
    }
    
}
