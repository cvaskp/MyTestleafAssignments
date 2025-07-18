package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAndAlert {

	public static void main(String[] args) {
		//Load the web page
		EdgeDriver driverobj2 = new EdgeDriver();
		driverobj2.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driverobj2.manage().window().maximize();
		
		//Switch to Frame
		driverobj2.switchTo().frame("iframeResult");
		driverobj2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverobj2.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//Switch to Alert
		Alert alert1 = driverobj2.switchTo().alert();
		alert1.accept();
		
		//Switching back to Alert to get the results message
		String result = driverobj2.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("The result is "+result);
	}

}
