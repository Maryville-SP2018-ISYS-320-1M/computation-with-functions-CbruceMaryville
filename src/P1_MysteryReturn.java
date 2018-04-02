/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  first line 2 0
  second line is 1 2 4
  third line two 3's
  fourth line 5 2 4
  fith line 7 1
  Sixth line 5 9 4
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
  I was correct the numbers are just confusing due to the mystery function!
 
 */
public class P1_MysteryReturn {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		z = mystery(x, z, y);
		System.out.println(x + " " + y + " " + z);
		x = mystery(z, z, x);
		System.out.println(x + " " + y + " " + z);
		y = mystery(y, y, z);
		System.out.println(x + " " + y + " " + z);

	}

	public static int mystery(int z, int x, int y) {
		z--;
		x = 2 * y + z;
		y = x - 2;
		System.out.println(y + " " + z);
		return x;
	}

}
