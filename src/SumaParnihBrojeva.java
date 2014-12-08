
public class SumaParnihBrojeva {
public static void main(String[] args) {
	System.out.println("Unesi brojeve intervala: ");
	int a=TextIO.getInt();
	int b=TextIO.getInt();
	
	int sumParnihBrojeva = 0;
	int sumNeparnihBrojeva = 0;
	
	for (int i = a; i<b; i++){
	
		sumParnihBrojeva = sumParnihBrojeva + isEven(i);
	
	    sumNeparnihBrojeva = sumNeparnihBrojeva + isOdd(i);
	    
	}
	System.out.println("Suma parnih brojeva je: " + sumParnihBrojeva);
	System.out.println("Suma neparnih brojeva je: " + sumNeparnihBrojeva);
	
}

    private static int isOdd(int i) {
    	boolean isOdd = true;
    	if (i%2!=0){
    		isOdd=true;
    	}
	return i;
}

	private static int isEven(int i) {
    	boolean isEven = true;
	if (i%2==0){
		isEven=true;
	}
	
	return i;
}
}
