import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.className("css-1dbjc4n")).click();
			Thread.sleep(2000L);
		
//		int i=1;
//		while(i<5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
