
public class NumberRiddle {
public static void main(String[] args) {
	int negInt = -6;
	int posInt = 6;
	int zero = 0;
	int one = 1;
	
	double negDouble = -3.0;
	double posDouble = 3.0;
	
	int startingNumberYouChoose = 66;
	
	System.out.println("num is " + startingNumberYouChoose);
	
	int anyNumberDoubled = startingNumberYouChoose *2;
	
	System.out.println("num doubled is " + startingNumberYouChoose);
	
	int doubleAddSix = anyNumberDoubled *2;
	
	System.out.println("num added by 6 is " + startingNumberYouChoose);
	
	double divideByTwo = (double) doubleAddSix/2.0;
	
	System.out.println("num divided by 2 is " + startingNumberYouChoose);
	
	double finalNum = (double) divideByTwo - startingNumberYouChoose;
	
	System.out.println("final num is " + finalNum);
	
	
}
}
