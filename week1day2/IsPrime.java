package week1day2;

public class IsPrime {

	public static void main(String[] args) {
		int num = 13;
		Boolean isPrime = true;
		
		
		for (int i=2; i<num-1; i++)
		{
			if(num % i == 0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.println("The given number is a Prime");
		}
		else
		{
			System.out.println("The given number is not a Prime");
		}
	}

}
