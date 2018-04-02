/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

/*
 5. Your predicted expression values:
 
 	1. = 1.6
 	2. 36
 	3.7
 	4.-5
 	5. 5
 	6.8.0
 	7.  ??   Ans = 17.0
 	8.   ??? Ans = 14.0
  
  		The last two were simple once I took a second look, between the absolute and power function
  		it was easy to understand. 
  		Same with the ceil function. I did not know what it did but on online forum helped me out!
  
 */
public class P5_TestMathFunctionCalls {

	public static void main(String[] args) {
		System.out.println(Math.abs( -1.6 ));
		System.out.println( Math.pow( 6, 2 ) );
		System.out.println(  Math.max ( 7, 3 ));
		System.out.println( Math.min( -2, -5 ) );
		System.out.println(  Math.min( 6, 3 + 2 ));
		System.out.println( Math.sqrt( 64 ) );
		System.out.println( 13 + Math.abs( -7 ) - Math.pow( 2, 3 ) + 5 );
		System.out.println(Math.max( 18 - 5, Math.ceil( 4.6 * 3 )) );
	}

}
