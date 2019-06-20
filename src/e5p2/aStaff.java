package e5p2;

import java.io.IOException;
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

public class aStaff {
	public WebDriver driver;

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\student.xlsx", "staff");
	}

	@BeforeSuite
	public void launchFirefox() {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
	}

	@Test(testName = "aStaff", dataProvider = "getExcelData")
	public void aStaff(String studentID, String courseName) throws InterruptedException, Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String baseUrl = "http://s1-dev3-cia01.ds.swin.edu.au/T1DEV3/CiAnywhere/Web/Environments";
		driver.get(baseUrl);


		driver.findElement(By.xpath("//input[@class = 'initialisable']")).sendKeys(Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LogonName']")).sendKeys("LeoJ");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Welcome123!");
		driver.findElement(By.xpath("//button[@id='BtnLogOn']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Role3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='Ci2Function3']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='dropdownControl chooser']")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//button[@id='EnquiryRelatedDataPortlet_ActionsExMenu_menuItem0_DDC_DefaultButton']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='StudentId']")).sendKeys(studentID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='StudentId']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='defaultAction primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='Tab_SelectCourseListSection_Handle']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//textarea[@id = 'SearchValue']")).sendKeys(courseName, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class = 'defaultAction primary']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='LogonName']")).sendKeys("LeoJ");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Welcome123!");
		driver.findElement(By.xpath("//button[@id='BtnLogOn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ContextualKeysCancelButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='GoToWorkplace']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Role3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='Ci2Function3']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='SearchValue']")).sendKeys(studentID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='SearchValue']")).sendKeys(Keys.ENTER);
		Thread.sleep(11000);
		driver.findElement(By.xpath("//button[@class='defaultAction primary']")).click();

		// assessment start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='MoreActions_DropDownButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='MoreActions_DropDownButton']")).sendKeys(Keys.TAB, Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id = 'Tab_RequirementListSection_Handle']")).click();
		Thread.sleep(3000);
		
		//call verifyCourse function
		staffAssessment.verifyCourse(driver, courseName);
		
		driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Tab_AssessmentAndOutcomesRdpSection_Handle\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"AssessmentAndOutcomesRdpSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div/div/div[4]/div[1]/div/ul/li/button[1]/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"AssessmentAndOutcomesSection_StudyLineItem_BasisOfAdmission\"]"))
				.sendKeys("Higher Education course", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"AssessmentAndOutcomesSection_NewAssessmentOutcome_Outcome\"]"))
				.sendKeys("Successful", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"AssessmentAndOutcomesSection_TopSaveButton\"]/span")).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);

		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"//*[@id=\"AssessmentAndOutcomesRdpSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div/div/div[4]/div[1]/div/ul/li/button[1]/span"))
				.click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"PrimaryAction_DefaultButton\"]/span")).click();
		Thread.sleep(3000);
		System.out.println(courseName + " added to student " + studentID);

		driver.close();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}