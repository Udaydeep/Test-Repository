import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement textbox=driver.findElement(By.cssSelector("#email"));
		textbox.sendKeys("My Login Name");
		driver.close();
		 
		

	}

}
