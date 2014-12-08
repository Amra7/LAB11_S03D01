
public class SabiranjeProstihBrojeva {

	public static void main(String[] args) {
	
	System.out.println("Unesi brojeve intervala: ");
	int a =TextIO.getInt();
	int b = TextIO.getInt();
	
	int sum =0;
	
	for (int i = a; i<b; i++){
		if ( isPrime(i)==true){
			sum=sum+i;
		}
	
	}	
	System.out.println("Suma je " + sum);

}

	private static boolean isPrime(int i) {
	boolean isPrime=true;
	
	for (int k = 2; k<i; k++) {
		if(i % k==0){
			return false;
		}
		
	}	
		return isPrime;
	}
}
