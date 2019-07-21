package e5p2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class courseStructureInProduction {

	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException, NoSuchElementException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\student.xlsx", "course");
	}

	@BeforeSuite
	public void launchFirefox() {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Java-selenium\\chromedriver_win32\\chromedriver.exe");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

	@Test(testName = "courseStructureInProduction", dataProvider = "getExcelData")
	public void searchCourseInProduction(String courseCode, String courseName) throws InterruptedException, Exception {

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swinburne.edu.au/");
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(element));
/*		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		

		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement applyy(WebDriver driver) {
			return driver.findElement(By.id("foo"));
			}
			});

		WebElement foo=wait.until(new Function() {    
		    public WebElement apply(WebDriver driver) {    
		        return driver.findElement(By.id("foo"));    
		    }
		});
		*/
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // Implicit Wait for 20 seconds
		
		driver.findElement(By.xpath("//*[@id=\"home-search-query\"]")).sendKeys(courseCode);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"home-search-submit\"]/span[1]")).click();
		//Thread.sleep(3000);
		
		//WebElement dynamicElement = (new WebDriverWait(driver, 90))
		//		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/main/section/div[2]/div[3]/a/h2/strong")));
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/main/section/div[2]/div[3]/a/h2/strong")).click();
		//Thread.sleep(3000);
		
		//WebElement dynamicElement2 = (new WebDriverWait(driver, 90))
		//		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"course-detail\"]/div[2]")));
		
		String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
		String fileNameWithPath = new String("C:\\screenshots\\" + courseCode + "@" + formattedDate + ".png");		
		
		//while (driver.findElements(By.xpath("//*[@id=\"course-detail\"]/div[2]/div[2]/h3")).isEmpty()){
		//while(!driver.getPageSource().contains("Course description") && !driver.getPageSource().contains("Course learning outcomes")) {
		while (driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[2]")).getAttribute("style").contains("none")){
			System.out.println(courseCode + " course structure is not displayed. Click to check for the Course details again.");

			driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[1]/a/h2")).click();
			//Thread.sleep(2000);
		}
		System.out.println(courseCode + " course structure displayed");
		Screenshots.takeSnapShot(driver, fileNameWithPath);
		driver.close();
		
		
		/*if (!driver.findElements(By.xpath("//*[@id=\"course-detail\"]/div[2]/div[2]/h3")).isEmpty()) {
			//Screenshots.takeSnapShot(driver, fileNameWithPath);
			System.out.println(courseCode + " course structure displayed");
			Screenshots.takeSnapShot(driver, fileNameWithPath);
			driver.close();
		} else {
			
			System.out.println(courseCode + " course structure is not displayed");

			driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[1]/a/h2")).click();
			Thread.sleep(2000);
			Screenshots.takeSnapShot(driver, fileNameWithPath);
			driver.close();
		}*/
		
		
		/*driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[1]/a/h2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[2]/h3[1]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);*/
		
		
	}

}
