package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tR08 {

	@DataProvider(name = "LoginCredntials")
	public Object[][] dataset2() {
		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" } };

	}

	@Test(dataProvider = "LoginCredntials")
	// Instead method name , we can pass value of name attribute in dataProviders
	public void Login(String username, String password) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\OneDrive\\Desktop\\Chrome12.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// step1

		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);

		driver.quit();

	}
}
