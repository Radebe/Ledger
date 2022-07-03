import java.util.*;
import java.io.*;

public class OctalConversion
{
	public static int convertToDecimal(String octal)
	{
		int conversion = 1;
		int result = 0;
		int cOctal;
		
		for(int i = 1;i <= octal.length();i++)
		{
			cOctal = octal.charAt(octal.length()-i)-48;
			
			if(cOctal != 0)
			{
				result += cOctal*conversion;
			}
			
			conversion *= 8;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an number in octal: ");
		String octal = input.nextLine();
		
		int decimal = convertToDecimal(octal);
        System.out.println("Equivalent decimal number: " + decimal);		
	}
	
}
