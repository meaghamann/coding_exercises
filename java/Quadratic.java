import static java.lang.System.out;

public class Quadratic {

	public static void main( String[] args) {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	
	double discriminate = a * a - 4.0 * b;
	double sqroot = Math.sqrt(discriminate);

	double root1 = ( -a + sqroot ) / 2.0;
	double root2 = ( -a - sqroot ) / 2.0;

	out.println(root1);
	out.println(root2);

	}
}
