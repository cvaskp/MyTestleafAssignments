package week4day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driverobj = new EdgeDriver();
		driverobj.get("https://www.myntra.com/");
		driverobj.manage().window().maximize();
		driverobj.findElement(By.className("desktop-searchBar")).sendKeys("Bags"+Keys.ENTER);
		driverobj.findElement(By.xpath("//label[@class='common-customRadio gender-label']")).click();
		Thread.sleep(1000);
		driverobj.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[3]")).click();
		Thread.sleep(1000);
		List<WebElement> brands =  driverobj.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> brandnames = new ArrayList<String>();
		for (WebElement each : brands)
		{
			String names=each.getText();
			brandnames.add(names);
		}
		System.out.println("List of brands available on the Results page are "+ brandnames);
		List<WebElement> total = driverobj.findElements(By.className("product-sliderContainer"));
		int totalCount =total.size();
		System.out.println("Total number of products displayed on the Results page are " + totalCount);
		Set<String> uniquebrands = new HashSet<>(brandnames);
		System.out.println("Brand names after removing the duplicates "+ uniquebrands);
	}
	

}