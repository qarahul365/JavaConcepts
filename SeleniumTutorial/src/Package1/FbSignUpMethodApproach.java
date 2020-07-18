package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpMethodApproach {
	
	public void dropdownSelection(WebElement element,String visibleTest ) {
		Select s = new Select(element);
		s.selectByVisibleText(visibleTest);
		
	}
	
	public static void main(String[] args) {
		FbSignUpMethodApproach obj = new FbSignUpMethodApproach();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rahul_sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#u_0_m")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("Sharma");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8860555083");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Testing@123");
		WebElement Day = driver.findElement(By.cssSelector("Select[title='Day']"));
		obj.dropdownSelection(Day, "8");
		WebElement Month = driver.findElement(By.cssSelector("Select#month"));
		obj.dropdownSelection(Month, "Sept");
		WebElement Year = driver.findElement(By.cssSelector("Select#year"));
		obj.dropdownSelection(Year, "1989");
		
		
		
		
		
		
		
	}

}
