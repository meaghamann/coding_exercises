import static java.lang.System.out;

public class Ruler {
	public static void main(String[] args){
		String s1 = " 1 ";
		String s2 = s1 + " 2 " + s1;
		String s3 = s2 + " 3 " + s2;
		String s4 = s3 + " 4 " + s3;
		String s5 = s4 + " 5 " + s4;

		out.println(s1);
		out.println(s2);
		out.println(s3);
		out.println(s4);
		out.println(s5);
	}
}
