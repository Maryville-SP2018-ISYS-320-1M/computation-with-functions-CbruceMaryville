/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

public class P6_Scientific {

	public static void main(String[] args) {
		
		computeScientificValue(6.5,3);
	}

	
	
	public static double computeScientificValue(double base, double exp) {
	     
		double power; 
		power = Math.pow(10, exp);
		double answer;
		answer = (base*power);
		return answer; 
		
		
		
  }
	
	
}
