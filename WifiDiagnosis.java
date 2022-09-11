/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 09/12/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Kaan Sen________
*/

import java.util.Scanner; //Scanner is imported and able to ask users for inputed data. 

public class WifiDiagnosis {

	public static void main(String[] args) {
	
		String user; //String variable that holds a value that the user inputs. 
				
		Scanner input = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work. \n");
		System.out.println("Reboot the computer and try to connect ");
		System.out.println("Did that fix the problem? (Yes or No) ");
		user = input.nextLine(); //Whatever the user enters it is saved into the input. 
		
			if(user.equalsIgnoreCase("No")) //If expression is No the following statements will execute. Like addition two questions. 
				{
					System.out.println("\nReboot the router and try to connect ");
					System.out.println("Did that fix the problem? (Yes or No) ");
					user = input.nextLine(); //Whatever the user enters it is saved into the input. 
				}
			
			if(user.equalsIgnoreCase("No")) //If the users inputed value is "No" the following questions will be asked.
				{
					System.out.println("\nMake sure the cables connecting the router are firmly plugged in and power is getting "
						+ "to the router ");
					System.out.println("Did that fix the problem? (Yes or No) ");
					user = input.nextLine(); //Whatever the user enters it is saved into the input. 
				}
		
			if(user.equalsIgnoreCase("No")) //If the users inputed value is "No" the following questions will be asked.
				{	
					System.out.println("\nMove the computer closer to the router and try to connect "); 
					System.out.println("Did that fix the problem? (Yes or No) ");
					user = input.nextLine(); //Whatever the user enters it is saved into the input. 
				}			

			if(user.equalsIgnoreCase("No")) //If the users inputed value is "No" the final step will be displayed.
				{
					System.out.println("\nContact your Internet Service Provider (ISP) ");
				}
				
			if(!user.equalsIgnoreCase("No") && !user.equalsIgnoreCase("Yes")) //Any value other than a "No" & "Yes" it will display a invalid message. 
				{
					System.out.println("\nInvalid answer; try again ");
					System.out.println("\nDone \nProgrammer: Kaan Sen");
				}
			
			else 														//If any of the previous steps are false the code will finish. 
				{
					System.out.println("\nDone \nProgrammer: Kaan Sen");
				}
				
			input.close(); 	//Closes the Scanner. 

	}

}
