import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {

		System.out.println("d");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com");
		driver.get("http://127.0.0.1:5500/index.html");
		// driver.navigate().back();

		// System.out.println(
		// driver.findElement(By.id("label-one")).getText().toUpperCase());

		driver.findElement(By.id("email-input")).sendKeys("bayanmayyas14@gmail.com");
		driver.findElement(By.id("passwor-input")).sendKeys("Passw0rd");
		driver.findElement(By.id("date-input")).sendKeys("7-18-1995");
		driver.findElement(By.id("mobile-input")).sendKeys("9623323247");

		 driver.findElement(By.tagName("button")).click();

	}

}
