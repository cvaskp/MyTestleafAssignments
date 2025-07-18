package week4day1;

public class LoginPage extends BasePage{
	
	public void performCommontask()
	{
		System.out.println("Statement from Perform Common Task method under LoginPage class");
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommontask();
		lp.findElement();
	}

}
