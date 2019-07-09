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

public class aStaff {
	public WebDriver driver;

	@BeforeSuite
	public void launchFirefox() {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
	}

	/*
	 * @DataProvider public String[][] getExcelData() throws InvalidFormatException,
	 * IOException { readExcel read = new readExcel(); return
	 * read.getCellData("C:\\Data\\student.xlsx", "staff"); }
	 * 
	 * 
	 * @Test(testName = "aStaff", dataProvider = "getExcelData") public void
	 * aStaff(String studentID, String courseName) throws InterruptedException,
	 * Exception {
	 * 
	 * driver = new FirefoxDriver(); driver.manage().timeouts().implicitlyWait(30,
	 * TimeUnit.SECONDS); driver.manage().window().maximize();
	 * 
	 * String baseUrl =
	 * "http://s1-dev3-cia01.ds.swin.edu.au/T1DEV3/CiAnywhere/Web/Environments";
	 * driver.get(baseUrl);
	 * 
	 * 
	 * driver.findElement(By.xpath("//input[@class = 'initialisable']")).sendKeys(
	 * Keys.TAB, Keys.ENTER); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//input[@id='LogonName']")).sendKeys("LeoJ");
	 * driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(
	 * "Welcome123!");
	 * driver.findElement(By.xpath("//button[@id='BtnLogOn']")).click();
	 * 
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//div[@id='Role3']")).click();
	 * Thread.sleep(1000);
	 * driver.findElement(By.xpath("//div[@id='Ci2Function3']")).click();
	 * 
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//li[@class='dropdownControl chooser']")).click(
	 * ); Thread.sleep(1000); driver.findElement( By.xpath(
	 * "//button[@id='EnquiryRelatedDataPortlet_ActionsExMenu_menuItem0_DDC_DefaultButton']"
	 * )) .click(); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//input[@id='StudentId']")).sendKeys(studentID);
	 * Thread.sleep(1000);
	 * driver.findElement(By.xpath("//input[@id='StudentId']")).sendKeys(Keys.ENTER)
	 * ; Thread.sleep(1000);
	 * 
	 * driver.findElement(By.xpath("//button[@class='defaultAction primary']")).
	 * click(); Thread.sleep(1000);
	 * driver.findElement(By.xpath("//div[@id='Tab_SelectCourseListSection_Handle']"
	 * )).click(); Thread.sleep(1500);
	 * driver.findElement(By.xpath("//textarea[@id = 'SearchValue']")).sendKeys(
	 * courseName, Keys.ENTER); Thread.sleep(3000);
	 * driver.findElement(By.xpath("//button[@class = 'defaultAction primary']")).
	 * click(); Thread.sleep(4000);
	 * driver.findElement(By.xpath("//input[@id='LogonName']")).sendKeys("LeoJ");
	 * driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(
	 * "Welcome123!");
	 * driver.findElement(By.xpath("//button[@id='BtnLogOn']")).click();
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//button[@id='ContextualKeysCancelButton']")).
	 * click(); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//a[@id='GoToWorkplace']")).click();
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//div[@id='Role3']")).click();
	 * Thread.sleep(1000);
	 * driver.findElement(By.xpath("//div[@id='Ci2Function3']")).click();
	 * 
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//textarea[@id='SearchValue']")).sendKeys(
	 * studentID); Thread.sleep(1000);
	 * driver.findElement(By.xpath("//textarea[@id='SearchValue']")).sendKeys(Keys.
	 * ENTER); Thread.sleep(11000);
	 * driver.findElement(By.xpath("//button[@class='defaultAction primary']")).
	 * click();
	 * 
	 * // assessment start Thread.sleep(3000);
	 * driver.findElement(By.xpath("//button[@id='MoreActions_DropDownButton']")).
	 * click(); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//button[@id='MoreActions_DropDownButton']")).
	 * sendKeys(Keys.TAB, Keys.ENTER);
	 * 
	 * Thread.sleep(3000); driver.findElement(By.
	 * xpath("//div[@id = 'Tab_RequirementListSection_Handle']")).click();
	 * Thread.sleep(3000);
	 * 
	 * //call verifyCourse function staffAssessment.verifyCourse(driver,
	 * courseName);
	 * 
	 * driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")
	 * ).click();
	 * 
	 * Thread.sleep(3000); driver.findElement(By.xpath(
	 * "//*[@id=\"Tab_AssessmentAndOutcomesRdpSection_Handle\"]")).click();
	 * Thread.sleep(2000); driver.findElement(By.xpath(
	 * "//*[@id=\"AssessmentAndOutcomesRdpSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div/div/div[4]/div[1]/div/ul/li/button[1]/span"
	 * )) .click(); Thread.sleep(3000); driver.findElement(By.xpath(
	 * "//*[@id=\"AssessmentAndOutcomesSection_StudyLineItem_BasisOfAdmission\"]"))
	 * .sendKeys("Higher Education course", Keys.ENTER, Keys.ENTER, Keys.TAB,
	 * Keys.TAB); Thread.sleep(2000); driver.findElement(By.xpath(
	 * "//*[@id=\"AssessmentAndOutcomesSection_NewAssessmentOutcome_Outcome\"]"))
	 * .sendKeys("Successful", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
	 * Thread.sleep(2000); driver.findElement(By.xpath(
	 * "//*[@id=\"AssessmentAndOutcomesSection_TopSaveButton\"]/span")).click();
	 * 
	 * Thread.sleep(15000);
	 * driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]")).click
	 * (); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]")).
	 * sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
	 * Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
	 * 
	 * Thread.sleep(6000); driver.findElement(By.xpath(
	 * "//*[@id=\"AssessmentAndOutcomesRdpSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div/div/div[4]/div[1]/div/ul/li/button[1]/span"
	 * )) .click();
	 * 
	 * Thread.sleep(6000);
	 * driver.findElement(By.xpath("//*[@id=\"PrimaryAction_DefaultButton\"]/span"))
	 * .click(); Thread.sleep(3000); System.out.println(courseName +
	 * " added to student " + studentID);
	 * 
	 * driver.close(); }
	 */

	@Test(testName = "createNewStudent")
	public void createNewStudent() throws InterruptedException, Exception {

		for (int i = 0; i < 50; i++) {
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

			try {

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

				driver.findElement(By.xpath("//*[@id=\"BirthDate\"]")).sendKeys("01/01/1980");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"BirthDate\"]")).sendKeys(Keys.TAB);
				Thread.sleep(1000);

				driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("Mr");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);

				driver.findElement(By.xpath("//*[@id=\"FamilyName\"]")).sendKeys("TestStudent" + String.valueOf(i));
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"GivenName\"]")).sendKeys("E5Project");
				Thread.sleep(1000);

				driver.findElement(By.xpath("//*[@id=\"Gender\"]")).sendKeys("Male");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Gender\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"PreferredEmail\"]"))
						.sendKeys("TestStudent" + String.valueOf(i) + "@E5Project.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Nationality\"]")).sendKeys("Australian");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Nationality\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[@id=\"QuickEnquiryPopup\"]/div[2]/div[4]/button/div")).click();

				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id=\"Tab_StudentDetailSection_Handle\"]/div/div[1]/span")).click();

				driver.findElement(By.xpath("//*[@id=\"Addresses_1_AddressType\"]")).sendKeys("Contact");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_AddressType\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(4000);

				driver.findElement(By.xpath("//*[@id=\"Addresses_1_Country\"]")).sendKeys("Australia");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_Country\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_Line1\"]"))
						.sendKeys(String.valueOf(i) + " E5ProjectTest Street");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_Suburb\"]")).sendKeys("Box Hill");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_State\"]")).sendKeys("VIC");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_State\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Addresses_1_Postcode\"]")).sendKeys("3124");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"BirthCountry\"]")).sendKeys("Australia");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"BirthCountry\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"HomeLanguage\"]")).sendKeys("English Only");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"HomeLanguage\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"StudentDetailSection_TopSaveButton\"]/span")).click();
				Thread.sleep(4000);

				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + "@" + formattedDate + ".png");
				Screenshots.takeSnapShot(driver, fileNameWithPath);
				System.out.println(String.valueOf(i) + " students created successfully.");

				driver.close();

			} catch (Exception e) {
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + "@" + formattedDate + ".png");
				Screenshots.takeSnapShot(driver, fileNameWithPath);
				System.out.println("Create New failed. No Logout button found.");
				driver.close();
				//Assert.assertFalse(true);
			}
		}

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}