import static java.lang.System.out;
import java.math.BigInteger;

/*
Only works if 0 <= n < 31 since 2^31 overflows an int.
*/

public class PowersOfTwo {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		BigInteger powerOfTwo = BigInteger.ONE;
		for(int i = 0; i <= n; i ++){
			out.println( i + " " + powerOfTwo);
			powerOfTwo = powerOfTwo.multiply(BigInteger.valueOf(2));
		}
	}
}
