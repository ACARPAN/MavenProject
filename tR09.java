package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tR09 {
	ChromeDriver driver;

	@DataProvider(name = "loginData")
	public Object[][] datasetOne() {
		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" }

		};
	}

//	@Test(dataProvider = "data", enabled = false)
//	public void Login(String username, String pwd) {
//		System.out.println("login with user " + username + pwd);

	// }

	@Test(dataProvider = "loginData")
	public void LoginOne(String username, String pwd) {

		System.setProperty("webdrive.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome12.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login-button")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".inventory_item_name"));
		Assert.assertEquals(products.size(), 6);
		driver.quit();

	}
}
