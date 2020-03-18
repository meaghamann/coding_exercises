import static java.lang.System.out;


public class LeapYear {

	public static void main(String[] args) {

	int year = Integer.parseInt(args[0]);
	boolean isLeapYear;	

	isLeapYear = ( year % 4 == 0 );
	isLeapYear = isLeapYear && ( year % 100 != 0 );
	isLeapYear = isLeapYear || ( year % 400 == 0 );
	
	out.println(isLeapYear);
	}
}
