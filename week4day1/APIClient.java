package week4day1;

public class APIClient {
	
	public void sendRequest(String method1)
	{
		System.out.println("This is the statement from Method1 "+method1);
	}
	
	public void sendRequest(String method2, boolean requeststatus)
	{
		System.out.println("This is the statement from Method2 "+method2+"\t"+requeststatus);
	}

	public static void main(String[] args) {
		APIClient apic = new APIClient();
		apic.sendRequest("Overload 1");
		apic.sendRequest("Overload 2", false);

	}

}
