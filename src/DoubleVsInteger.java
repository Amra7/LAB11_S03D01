public class DoubleVsInteger {

	// za integer
	/**
	 * Sabira dva integera
	 * @param a int moye biti bilo koji broj
	 * @param b int moye biti bilo koji broj
	 * @return sumu dva parametra
	 */
	
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int razlika(int a, int b) {
		int razlika = a - b;
		return razlika;
	}

	public static int proizvod(int a, int b) {
		int proizvod = a * b;
		return proizvod;
	}

	public static int djeljenje(int a, int b) {
		int djeljenje = a / b;
		return djeljenje;
	}

	// za double
	

	public static double sum(double c, double d) {
		double sum = c + d;
		return sum;
	}

	public static double razlika(double c, double d) {
		double razlika = c - d;
		return razlika;
	}

	public static double proizvod(double c, double d) {
		double proizvod = c * d;
		return proizvod;
	}

	/**
	 * Dijeli dva double
	 * @param c moze biti bilo koji broj
	 * @param d moze biti bilo koji broj
	 * @return Dijeljenje dva parametra
	 */
	public static double djeljenje(double c, double d) {
		double djeljenje = c / d;
		return djeljenje;
	}

	public static void main(String[] args) {
		System.out.println("Unesi dva integera: ");
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		if (a<b){
			int temp = a;
			a=b;
			b=temp;
		}

		System.out.println("Unesi dva double-a: ");
		double c = TextIO.getDouble();
		double d = TextIO.getDouble();

		System.out.println("Za integer: ");
		int sum = sum(a, b);
		    System.out.println("Suma je: " + sum);
		int razlika = razlika(a, b);
		    System.out.println("Razlika je: " + razlika);
		int proizvod = proizvod(a, b);
		    System.out.println("Proizvod   je: " + proizvod);
		int djeljenje = djeljenje(a, b);
		    System.out.println("Dijeljenje je: " + djeljenje);

		    System.out.println();
		    
		System.out.println("Za double: ");
		double sumDouble = sum(c, d);
		    System.out.println("Suma je: " + sumDouble);
		double razlikaDouble  = razlika(c, d);
		    System.out.println("Razlika je: " + razlikaDouble );
		double proizvodDouble  = proizvod(c, d);
		    System.out.println("Proizvod je: " + proizvodDouble );
		double djeljenjeDouble  = djeljenje(c, d);
		    System.out.println("Dijeljenje je: " + djeljenjeDouble );
		    
		    

	}
}
