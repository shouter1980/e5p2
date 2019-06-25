package e5p2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class courseStructureInProduction {

	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\student.xlsx", "course");
	}

	@BeforeSuite
	public void launchFirefox() {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

	@Test(testName = "courseStructureInProduction", dataProvider = "getExcelData")
	public void searchCourseInProduction(String courseCode, String courseName) throws InterruptedException, Exception {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swinburne.edu.au/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"home-search-query\"]")).sendKeys(courseCode);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"home-search-submit\"]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/main/section/div[2]/div[3]/a/h2/strong")).click();
		Thread.sleep(3000);
		
		String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
		String fileNameWithPath = new String("C:\\screenshots\\" + courseCode + "@" + formattedDate + ".png");		
		
		//while (driver.findElements(By.xpath("//*[@id=\"course-detail\"]/div[2]/div[2]/h3")).isEmpty()){
		//while(!driver.getPageSource().contains("Course description") && !driver.getPageSource().contains("Course learning outcomes")) {
		while (driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[2]")).getAttribute("style").contains("none")){
			System.out.println(courseCode + " course structure is not displayed. Click to check for the Course details again.");

			driver.findElement(By.xpath("//*[@id=\"course-detail\"]/div[1]/a/h2")).click();
			Thread.sleep(2000);
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
