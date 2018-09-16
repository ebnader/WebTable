package webTableTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		 WebElement table = driver.findElement(By.tagName("tbody"));
		 //getting number of rows
		   List<WebElement> row = table.findElements(By.tagName("tr"));
		   System.out.println(row.size());
		   //getting number of columns
		   List<WebElement> col = driver.findElements(By.tagName("th"));
		   System.out.println(col.size());
		   String values = null;
		   //printing the value of cells
		for(int i=0;i<row.size();i++)
			   values=row.get(i).getText();
			   System.out.println(values);
			   //making validation of cells
		   if(values.contains("Kode"))
			   System.out.println("cell value exist");
		 
		   //Thread.sleep(3000);
		   driver.quit();
	}

}
