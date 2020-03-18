import static java.lang.System.out;

public class RandomInt {

	public static void main(String[] args) {
	int ran = Integer.parseInt(args[0]);
	double r = Math.random();
	int n = (int) (r * ran);

	out.println(n);
	}
}
