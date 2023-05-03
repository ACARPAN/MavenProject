package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Saucedemo1 {
	ChromeDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\offic\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	// Valid User Test
	@Test(priority = 1)
	public void userLogin() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//		String actualUrl = driver.getTitle();
//		Thread.sleep(3000);
//		Assert.assertEquals(actualUrl, "Swag Labs");
//		driver.close();

		// Invalid user and Password Test

//		driver.findElement(By.id("user-name")).sendKeys("user");
//		driver.findElement(By.id("password")).sendKeys("s1234");
//		driver.findElement(By.id("login-button")).click();

		// verify that the error message is displayed
//		String errorMessage = driver.findElement(By.cssSelector("[data-test=error]")).getText();
//		Thread.sleep(3000);
//		Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
//		driver.quit();
	}

//	@Test (priority=2) 
//		public void dashLogo() {
//		String Logo= driver.findElement(By.cssSelector(".app_logo")).getText();
//		Assert.assertEquals(Logo, "Swag Labs");
//		driver.quit();

	// }
//	@Test(priority = 3)
//	public void navItem() {
		// verify that the correct number of navigation items are displayed
//		List<WebElement> navigationItems = driver.findElements(By.cssSelector("a[class=\"bm-item menu-item\"]"));
//		Assert.assertEquals(navigationItems.size(), 4);
//		driver.quit();
//	}

	@Test(priority = 4)
	public void cartFunctionality() {
		// verify the add to card functionality
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click();
		String cartNumber = driver.findElement(By.cssSelector("#shopping_cart_container > a")).getText();
		Assert.assertEquals(cartNumber, "1");
	}
}
