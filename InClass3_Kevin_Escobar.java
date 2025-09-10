/**
 * Name: Kevin Escobar
 * Date: 09/09/25
* Purpose: InClass 3 - 
* Use coding such as Math.pow to make our codes more organized and readable. 
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Kevin_Escobar 
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        Scanner input = new Scanner(System.in);
        double side, volume, surfaceArea;
        System.out.print("Enter the lenght of the cube's side");
        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);   // Math.pow allows me to cube the side lenght
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6 * Math.pow(side, 2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the object is" + volume);
        System.out.println("The surface of area is " + surfaceArea);
        }
}