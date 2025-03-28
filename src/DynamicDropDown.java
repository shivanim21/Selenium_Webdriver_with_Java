import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		Thread.sleep(2000L);
		
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		//Indexed Xpath
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[contains(text(),'AGR')])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'AGR')]")).click();		
		// //div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'AGR')]  Parent child
		
		
	}
	
}
