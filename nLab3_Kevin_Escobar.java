/** 
* Name: Kevin Escobar
* Date: 09/09/2025
* Purpose of Lab3 -
* Putting my skills to use and create my own coding workplace as well 
* using formulas and Math.pow to enhance my coding further more 
*/
import java.util.Scanner ; // Imports the Scanner that we will be using 

public class nLab3_Kevin_Escobar
{
    public static void main(String[] args) //sets uo the coding workplace
    {
    Scanner input = new Scanner(System.in);
    double initialValue ; // Delcaring variable
    int years; // Declaring variable int due to it being a whole number
    double interestRate; // Declaring variable
    double finalValue;   // Declaring variable which is our final product
    System.out.print(" Please enter the Initial Value of the home:"); // Ask user to imput intial value 
    initialValue = input.nextDouble(); // Gives acces to user to imput a numerical value
    System.out.print(" Please enter the amount of elapsed years:"); // Ask user to imput number of years
    years = input.nextInt(); // Gives the ability to imput a numerical value 
    System.out.print(" Please enter the Interest Rate:"); // Ask user to imput the interest rate
    interestRate = input.nextDouble(); // Gives user acces to imput a value 
    interestRate = interestRate / 100; // converts percentage to decial 
    finalValue = initialValue * Math.pow(1 + interestRate, years); // Formula for compound interest 
    System.out.printf(" The Final Value of the home is: $%.2f%n", finalValue ); // Sends out the final value with two decimal places 






    }

    











} 
















