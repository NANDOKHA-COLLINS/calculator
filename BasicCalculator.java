/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

/**
 *
 * @author HP
 */
import java.util.Scanner ;
public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new  Scanner (System.in) ;
        // TODO code application logic here
    System.out.println("Enter the first Number:");
    int number1=input.nextInt();
    System.out.println("Enter the Second Number :");
    int number2=input.nextInt();
    int sum, sub, div,mod,mult;
    sum= number1 + number2 ;
    sub= number1-number2 ;
    div= number1/number2;
    mult= number1 * number2 ;
    mod = number1 % number2 ;
    System.out.println("The sum is =" + sum);
    System.out.println("The subtraction is = "+ sub);
    System.out.println("The Division = "+ div);
    System.out.println("The Multipplication is = "+ mult);
    System.out.println("The Modulus is = "+ mod);
    }
    
}
