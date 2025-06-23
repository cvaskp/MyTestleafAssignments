package week1day2;

public class IsPalindrome {

	public static void main(String[] args) {
		int input=45654, a,b, output=0;
		b=input;
		
		while (input>0)
		{
			a=input%10;
			output=(output*10)+a;
			
			input=input/10;
		}
		if(b == output)
		{
			System.out.println("The number " +b+ " is Palindrome");
		}
		else
		{
			System.out.println("The number " +b+ " is not Palindrome");
		}
	}

}
