package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jQuerytest {

	ChromeDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\offic\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
  //Navigate to the URL
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
//	@Test (priority=1)
//		public void verifyTitleAndURL() {
//
//		// Get the title of the page
//        String title = driver.getTitle();
//
//        // Verify that the title is correct
//        Assert.assertEquals(title, "Droppable | jQuery UI");
//        
//        //Get the current URL
//       String currentURL= driver.getCurrentUrl();
//       
//       /// Verify that the current URL is correct
//       Assert.assertEquals(currentURL, "https://jqueryui.com/droppable/");
//       driver.quit();
        
        
	@Test (priority= 2)
	
	public void dragAndDropTest() throws InterruptedException {
        // switch to the iframe that contains the drag and drop elements
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        
        // get the draggable and droppable elements
        WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
        WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
        
        // perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();
        // assert that the drop message is displayed
        String dropText = droppable.findElement(By.cssSelector("#droppable > p")).getText();
        Assert.assertEquals(dropText, "Dropped!");
        Thread.sleep(3000);
        driver.quit();
    }
	
	

}
