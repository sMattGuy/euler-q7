
public class Prime{
	public static void main(String[] args){
		int counter = 0;
		int currentPrime = 0;
		for(int i=2;;i++){
			if(isPrime(i)){
				currentPrime=i;
				counter++;
			}
			if(counter==10001){
				System.out.println("\nDone!");
				break;
			}
			System.out.print("Progress:"+counter+"/10001\r");
		}
		System.out.println("\nThe Answer Is:"+currentPrime);
	}
	
	public static boolean isPrime(int input){
		for(int i=2;i<input;i++){
			if(input%i==0)
				return false;
		}
		return true;
	}
}