//import stuff here
import java.util.Scanner;

/* 
 * 12 nickels = 1 klevin 
 * 20 klevins = 1 buck
 * 100 nickels = 1 buck
*/
//Your code here
public class Converter{
    public static void main(String[] args){
        
        //declare variables
        double sBucks = 0;
        double klevins = 0;
        double sNickels = 0;
        double decimalSbucks = 0;
        
        Scanner moneyScanner = new Scanner(System.in);
        
        //input
        System.out.println("Enter schrute-bucks");
        sBucks = moneyScanner.nextInt();
        
        System.out.println("Enter klevins");
        klevins = moneyScanner.nextInt();
        
        System.out.println("Enter stanleyNickels");
        sNickels = moneyScanner.nextInt();
        
        //calculate
        klevins = klevins + sNickels/12.0;
        sBucks = sBucks + klevins/20.0;
        sBucks = Math.round(100*sBucks)/100.0;
        
        //print
        System.out.println("Decimal schrute-bucks = " + sBucks);
    }
}
//Paste console output below:
/*

Enter schrute-bucks
7
Enter klevins
17
Enter stanleyNickels
9
Decimal schrute-bucks = 7.89

*/
