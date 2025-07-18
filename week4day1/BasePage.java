package week4day1;

public class BasePage {

	public void findElement()
	{
		System.out.println("Statement from Find Element method under the BasePage class");
	
	}
	
	public void performCommontask()
	{
		System.out.println("Statement from Perform Common Task method under the BasePage class");
	}
	public static void main(String[] args) {
		BasePage bp = new BasePage();
		bp.findElement();
		bp.performCommontask();

	}

}
