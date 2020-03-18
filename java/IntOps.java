import static java.lang.System.out;

public class IntOps {

	public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum = a + b;
	int product = a * b;
	int quotient = a / b;
	int remaining = a % b;

	out.println( a + " + " + b + " = " + sum);	
	out.println( a + " * " + b + " = " + product );
	out.println( a + " / " + b + " = " + quotient );
	out.println( a + " % " + b + " = " + remaining );
	out.println( a + " = " + quotient + " * " + b + " + " + remaining );
	}
}
