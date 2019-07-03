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

public class aStudent {
	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\student.xlsx", "student");
	}

	@BeforeSuite
	public void launchFirefox() {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljiang\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Java-selenium\\chromedriver_win32\\chromedriver.exe");
	}

	/*@Test(testName = "portalLogin", dataProvider = "getExcelData")
	public void studentLogin(String studentID, String studentPsw) throws InterruptedException, Exception {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://swin-tst.connexus.online/login");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys(studentID, "@student.test.swin.edu.au");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys(studentPsw);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys(Keys.ENTER);
		Thread.sleep(900);
		driver.findElement(By.xpath("//*[@id='idBtn_Back']")).click();
		Thread.sleep(30000);
		
		String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
		String fileNameWithPath = new String("C:\\screenshots\\" + studentID + "@" + formattedDate + ".png");		
		//Screenshots.takeSnapShot(driver, fileNameWithPath);
		
		if (!driver.findElements(By.xpath("//*[@id=\"svg5112\"]")).isEmpty()) {
			//Screenshots.takeSnapShot(driver, fileNameWithPath);
			System.out.println(studentID + " Login successful");
			driver.findElement(By.xpath("//*[@id=\"svg5112\"]")).click();
			Thread.sleep(900);
			driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/li[3]/a")).click();
			driver.close();
		} else {
			Screenshots.takeSnapShot(driver, fileNameWithPath);			
			System.out.println(studentID + " Login failed. No Logout button found.");
			driver.close();
			Assert.assertFalse(true);
		}		
	}*/
	
	@Test(testName = "studentUpdateProfiles", dataProvider = "getExcelData")
	public void studentUpdateProfiles(String studentID, String studentPsw) throws InterruptedException, Exception {

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swin-tst.connexus.online/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys(studentID, "@student.test.swin.edu.au");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys(studentPsw);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys(Keys.ENTER);
		Thread.sleep(900);
		driver.findElement(By.xpath("//*[@id='idBtn_Back']")).click();
		Thread.sleep(15000);

		try 
		{
			driver.findElement(By.xpath("//*[@id=\"svg5112\"]")).click();
			Thread.sleep(900);
			driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/li[1]/a")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[1]/div/div/button")).click();
			Thread.sleep(1500);
			
			for (int i = 0; i < 10; i++) {
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[1]/div/div/div[2]/input")).clear();
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[1]/div/div/div[2]/input")).sendKeys(String.valueOf(i) + " Test Contact Ave");
				Thread.sleep(500);
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[2]/div/div/div[2]/input")).clear();
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[2]/div/div/div[2]/input")).sendKeys(String.valueOf(i) +" Test Residential Ave");
				Thread.sleep(500);
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[8]/div/div/div[2]/input")).clear();
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[8]/div/div/div[2]/input")).sendKeys("TestPersonalEmail" + String.valueOf(i) + "@Swin.edu.au");
				Thread.sleep(500);
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[9]/div/div/div[2]/input")).clear();
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/form/div[9]/div/div/div[2]/input")).sendKeys("TestStudentEmail" + String.valueOf(i) + "@Swin.edu.au");
				Thread.sleep(500);
				driver.findElement(By.xpath("/html/body/app-root/app-connexus-app/app-user-page/app-layout/div[2]/div/app-profile-page/div/accordion/app-contact-details-form/accordion-group/div/div[2]/div/button")).click();
				Thread.sleep(9000);		
				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + studentID + "@" + formattedDate + ".png");		
				Screenshots.takeSnapShot(driver, fileNameWithPath);
			}
			
			driver.close();
		} 
		
		catch(Exception e) 
		{
			String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
			String fileNameWithPath = new String("C:\\screenshots\\" + studentID + "@" + formattedDate + ".png");	
			Screenshots.takeSnapShot(driver, fileNameWithPath);			
			System.out.println(studentID + " Login failed. No Logout button found.");
			driver.close();
			Assert.assertFalse(true);	
		}		
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}