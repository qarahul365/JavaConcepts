package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rahul_sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#u_0_m")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("Sharma");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8860555083");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Testing@123");
		WebElement element = driver.findElement(By.id("day"));
		Select s=new Select(element);
		s.selectByIndex(1);
		WebElement element1 = driver.findElement(By.id("month"));
		Select s1=new Select(element1);
		s1.selectByValue("9");
		WebElement element2 = driver.findElement(By.id("year"));
		Select s2=new Select(element2);
		s2.selectByVisibleText("1989");
		driver.findElement(By.cssSelector("input[id='u_0_7']")).click();
		driver.close();
	}

}
