package webTableTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://money.rediff.com/gainers/bsc/daily/groupa");
		//.//*[@id='leftcontainer']/table
		 List<WebElement> table = driver.findElements(By.tagName("table"));
		System.out.println(table.size());
		for(int i=0; i<table.size();i++)
			System.out.println(table.get(i).getText());
		
		driver.quit();
	}

}
