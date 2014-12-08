
public class FunkcijeStringIntegerDouble {

	public static void main(String[] args) {
		
			
		double myDouble = myDouble (double broj);
		System.out.println("Unesi Double : "+ myDouble);
		
			
		int myInteger = myInteger(int broj);
		System.out.println("Unesi Integer : "+ myInteger);
		
		String myString = myString("Unesi String: ");
		System.out.println("Unesi String : "+ myString);
		
	}
	
	private static int myInteger(int broj) {
		int num = TextIO.getInt();
		return num;
	}
	
	private static Double myDouble(double broj) {
		double num = TextIO.getDouble();
		return num;
	}
	

	private static String myString(String str) {
		String myStr= "Unesi jedno ime: ";
		String ime = TextIO.getInputFileName();
		return ime;
	}
}
