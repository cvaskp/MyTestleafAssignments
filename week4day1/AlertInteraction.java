package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertInteraction {

	public static void main(String[] args) {
		EdgeDriver driverobj1 = new EdgeDriver();
		driverobj1.get("https://www.leafground.com/alert.xhtml");
		driverobj1.manage().window().maximize();
		driverobj1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverobj1.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert alert = driverobj1.switchTo().alert();
		System.out.println("The Alert message is "+ alert.getText());
		alert.sendKeys("Siva");
		alert.accept();
		String typedtext = driverobj1.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("The text message after handled the alert is "+typedtext);
		

	}

}
