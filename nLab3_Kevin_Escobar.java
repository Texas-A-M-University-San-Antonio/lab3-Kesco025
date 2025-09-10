/** 
* Name: Kevin Escobar
* Date: 09/09/2025
* Purpose of Lab3 -
* Putting my skills to use and create my own coding workplace as well 
* using formulas and Math.pow to enhance my coding further more 
*/
import java.util.Scanner ;

public class nLab3_Kevin_Escobar
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    double initialValue ;
    int years;
    double interestRate;
    double finalValue;
    System.out.print(" Please enter the Initial Value of the home:");
    initialValue = input.nextDouble();
    System.out.print(" Please enter the amount of elapsed years:");
    years = input.nextInt();
    System.out.print(" Please enter the Interest Rate:");
    interestRate = input.nextDouble();
    interestRate = interestRate / 100;
    finalValue = initialValue * Math.pow(1 + interestRate, years);
    System.out.printf(" The Final Value of the home is: $%.2f%n", finalValue );






    }

    











} 
















