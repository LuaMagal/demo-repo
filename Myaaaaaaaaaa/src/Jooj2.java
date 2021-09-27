
public class Jooj2 {

	void print(String print) {
		System.out.println(print);
	}

	static String substring(String substring, int first, int later) {

		
		return substring.substring(first, later);

	}

	public static void main(String[] args) {
		Jooj2 a = new Jooj2();
		String abc = "ABCDEFGHIjklmnopqrsTUVXWYZ";
		a.print(substring(abc, 3, 12));
	}

}
