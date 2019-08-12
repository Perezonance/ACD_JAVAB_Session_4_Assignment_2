package assignment_2;

public class ImplicitTypeConversion {
	public static void main(String[] args) {
		byte i = 10;
		long j = 1 + 8;
		double k = j + 2.5 / i;
		System.out.println("K = " +  k);
	}
}
