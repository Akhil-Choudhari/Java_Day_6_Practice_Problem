package Day6Program;

import java.util.Scanner;

public class TemperaturConversion {

	public static void main(String[] args) {
		float celsius,fahrenheit;
		 Scanner sc = new Scanner(System.in);
		   
		 System.out.println("Enter temperature in Fahrenheit :");
		     fahrenheit=sc.nextInt();
	
		     celsius=(fahrenheit - 32)*5/9;
		     // Print the result
		     System.out.println("Celsius = "+celsius);
		     
		     System.out.println("Enter temperature in celsius :");
		     fahrenheit=sc.nextInt();
	
		     fahrenheit=(celsius * 9/5) + 32;
		     // Print the result
		     System.out.println("fahrenheit = "+fahrenheit);
	}

}
