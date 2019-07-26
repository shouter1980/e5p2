package e5p2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
	int numberOfNewStudent = 2;	
	
	@BeforeSuite
	public void launchFirefox() {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljiang\\Downloads\\chromedriver.exe");
	}
	
	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\newStudent.xlsx", "staff");
	}
	
	

	@Test(testName = "createNewStudent", priority = 1)
	public void createNewStudent() throws InterruptedException, Exception {
	
		
		String newStudentslist[][] = new String[numberOfNewStudent+1][2];
		newStudentslist[0][0]= "Student";
		newStudentslist[0][1]= "Course";
		String[] coursesList = {"GC-CMGT","GD-FBS","MA-CIMGT","MM-BAEXEI","MA-IT1","BA-BUS10","BA-CS","BA-ICT","BA-MCMN","BB-HSCBUS","AB-AV","XP-CISPG","XU-BUS","BH-ENG","BA-HSC1"};
		for (int i = 0; i < numberOfNewStudent; i++) {
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
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

				driver.findElement(By.xpath("//*[@id=\"FamilyName\"]")).sendKeys("E5Project");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"GivenName\"]")).sendKeys("TestStudent-I" + String.valueOf(i));
				Thread.sleep(1000);

				driver.findElement(By.xpath("//*[@id=\"Gender\"]")).sendKeys("Male");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Gender\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"PreferredEmail\"]")).sendKeys("TestStudent-I" + String.valueOf(i) + "@E5Project.com");
						
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
				
				driver.findElement(By.xpath("//*[@id=\"CitizenshipCountry\"]")).sendKeys("Australia");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"CitizenshipCountry\"]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"StudentDetailSection_TopSaveButton\"]/span")).click();
				Thread.sleep(4000);

				String newStudent = driver.findElement(By.xpath("//*[@id=\"FormTitleControl\"]/div[2]/div[2]/span[1]")).getText();
				String newStudentID = newStudent.substring(0, 9);
				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + newStudentID + "@" + formattedDate + ".png");
				Screenshots.takeSnapShot(driver, fileNameWithPath);
				
				System.out.println(newStudentID + " - the No." + String.valueOf(i) + " new student was created successfully.");
				
				
				
				int j = coursesList.length;
				int tmpi = i;
				while (tmpi + 1 > j) {
					tmpi -= j;
				}
				newStudentslist[i+1][0] = newStudentID;
				newStudentslist[i+1][1] = coursesList[tmpi];
				
				System.out.println(Arrays.deepToString(newStudentslist));

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
		readExcel.excelWriter("C:\\Data\\newStudent.xlsx", newStudentslist);

	}
	
	
	
	
	@Test(testName = "addCourse&ReleaseOffer", dataProvider = "getExcelData", priority = 2)
	public void aStaff(String studentID, String courseName) throws InterruptedException, Exception {

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
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
		Thread.sleep(3000);
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
	
	
	
	
	@Test(testName = "changeNewStudentsPSW", dataProvider = "getExcelData", priority = 3)
	public void changeNewStudentPSW(String studentID, String courseName) throws InterruptedException, Exception {

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String baseUrl = "http://teststudentpassword.ds.swin.edu.au/Account/Login?ReturnUrl=%2F";
		driver.get(baseUrl);


		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("Kclee");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Happyday12345!");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys(studentID);
		driver.findElement(By.xpath("/html/body/form[2]/div[5]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/form[2]/div[7]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ResetPassword\"]")).sendKeys("Welcome12345!");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form[2]/div[6]/div/input")).click();
		Thread.sleep(1000);
		
		System.out.println(studentID + " password reset");

		driver.close();
	}
	
	
	@Test(testName = "SIT-CIA-login", priority = 1, enabled = false)
	public void SITciaStaff() throws InterruptedException, Exception {

		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String baseUrl = "https://s1-tst-cia.ds.swin.edu.au/T1TST/CiAnywhere/Web/TST/Workplace/Account/LogOn";
		driver.get(baseUrl);


		driver.findElement(By.xpath("//*[@id=\"LogonName\"]")).sendKeys("LJIANG");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("welcome123");
		driver.findElement(By.xpath("//*[@id=\"BtnLogOn\"]")).click();
		Thread.sleep(7000);		
		driver.findElement(By.xpath("//*[@id=\"LnkToWorkplace\"]/span[1]")).click();
		Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id=\"Role3\"]/span[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Ci2Function3\"]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ActionsMenu_menuItem0_DDC_DefaultButton\"]/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ActionsExMenu_menuItem0_DDC_DefaultButton\"]/span[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"GivenName\"]")).sendKeys("S20190722115203");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"OtherName\"]")).click();
		Thread.sleep(9000);
		
		String newStudentIDwithName = driver.findElement(By.xpath("//*[@id=\"QuickEnquiryPopup\"]/div[1]/div[4]/div[2]/div[3]/div[3]/div/div/div/div[3]/div[1]/div/div/span")).getText();
		String newStudentID = newStudentIDwithName.substring(0, 9);
		
		System.out.println(newStudentID + " is found:)");
		
		
		
		
		
		
		
		
/*
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
		Thread.sleep(3000);
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

		driver.close();*/
	}
	

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
	}
}