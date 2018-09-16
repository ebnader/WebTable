package webTableTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		WebElement table = driver.findElement(By.id("allpage_links"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		List<WebElement> col = driver.findElements(By.tagName("td"));
		System.out.println(col.size());
		
		
		driver.quit();

	}

}
