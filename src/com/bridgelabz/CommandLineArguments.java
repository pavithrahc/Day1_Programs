/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 *
 */
public class CommandLineArguments {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "Welcome Bridgelabz";
			int sum = 0;
			sum= str.length();
			if(sum>0)
				System.out.println(" this is valid character count:" +sum);
			else
				System.out.println(" this is invalid");
	}
}
		