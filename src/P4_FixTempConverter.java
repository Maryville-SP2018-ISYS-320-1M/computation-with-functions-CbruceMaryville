/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

/*
 What were the errors you found?
 The call in the main class for printing tempc was using the 0.0 method.
 You need to output the tempc inside the Temp converter
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
		//System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static void ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      System.out.println(tempc);
    }
}
