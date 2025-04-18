package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String var = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(var);
		driver.findElement(By.id("name")).sendKeys(var);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String txt = driver.switchTo().alert().getText();
		if(txt.contains(var)) {
			System.out.println("Alert Success!");
		}
		else {
			System.out.println("Wrong in Alert");
		}
		

	}

}
