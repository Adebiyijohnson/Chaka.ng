package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChakaSignin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Erioluwa Pereira\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chaka.ng/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[1]/label/input")).sendKeys("Adebiyijohnson164@gmail.com");
		 driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[2]/label/input")).sendKeys("Jonnexbj0.");
		 driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[4]/div[1]/button")).click();
		 	 
		 
		 
	}
	
}
