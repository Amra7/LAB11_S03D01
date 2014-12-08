public class FunkcijaSumaBorjeva {

	public static  pozdrav(String ime){
		System.out.println("Cao " + ime);
	}
	
	public static double sum(double br1, double br2) {
		System.out.println("Sabiranje double-a");
		double sum = br1 + br2;
		return sum;
	}
		
	public static int sum(int br1, int br2) {
		System.out.println("Sabiranje integera");
		int sum = br1 + br2;
		return sum;

	}
	/**
	 * argumenti i varijable ne moraju imati ista imena
	 * @param args
	 */

	public static void main(String[] args) {
	//	pozdrav( Amra);
		
		
		int num1 = 1;
		int num2 = 2;
		
		int sum = sum(num1,num2);
		System.out.println("Sum: "+sum);
		double doubleSum = sum (0.3,0.5);
		System.out.println("DoubleSum: "+ doubleSum);
	}
}
