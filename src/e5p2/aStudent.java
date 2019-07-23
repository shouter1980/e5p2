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

public class aStudent {
	public WebDriver driver;
	int numberOfNewStudent = 1;	

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\newStudent.xlsx", "staff");
	}

	@BeforeSuite
	public void launchFirefox() {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Java-selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljiang\\Downloads\\chromedriver.exe");
	}

	@Test(testName = "portalLogin", dataProvider = "getExcelData", enabled = false)
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
		//driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys(studentPsw);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Welcome12345!");
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
	}
	
	@Test(testName = "studentUpdateProfiles", dataProvider = "getExcelData", enabled = false)
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
	
	
	
	@Test(testName = "STU-2974", priority = 1, enabled = false)
	public void eAppCreateNewStudent() throws InterruptedException, Exception {
	
		
		String newStudentslist[][] = new String[numberOfNewStudent+1][2];
		newStudentslist[0][0]= "Student";
		newStudentslist[0][1]= "Course";
		String[] coursesList = {"GC-CMGT","GD-FBS","MA-CIMGT","MM-BAEXEI","MA-IT1","BA-BUS10","BA-CS","BA-ICT","BA-MCMN","BB-HSCBUS","AB-AV","XP-CISPG","XU-BUS","BH-ENG","BA-HSC1"};
		for (int i = 0; i < numberOfNewStudent; i++) {
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			String baseUrl = "http://s1-tst-web01.ds.swin.edu.au/eStudent/SM/eApplications/eAppLogin.aspx?f=%24S1.EAP.CI2LOGIN.WEB";
			
		
			try {
				//eApp portal login page
				driver.get(baseUrl);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_cmdRegister\"]")).click();
				Thread.sleep(2000);
				
				//Register page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpTitle_InputControl\"]")).sendKeys("Mr");
				Thread.sleep(1000);
								
				String tmpformattedDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String tmpformattedDate2 = new SimpleDateFormat("MMddHHmm").format(new Date());
				String studentFirstName = "S" + tmpformattedDate;
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys(studentFirstName);
				//driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys("TestStudent-A" + String.valueOf(i));

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtFamName_InputControl\"]")).sendKeys("STUstudent");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobDay\"]")).sendKeys("9");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobMonth\"]")).sendKeys("September");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobYear\"]")).sendKeys("1999");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpGender_InputControl\"]")).sendKeys("Male");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmail_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmailConfirm_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_repPhone_ctl00_txtPhone_InputControl\"]")).sendKeys("04" + tmpformattedDate2);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpCountry_InputControl\"]")).sendKeys("Australia");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrLine1_InputControl\"]")).sendKeys(tmpformattedDate + " Toorak Road");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrSuburb_InputControl\"]")).sendKeys("Toorak");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpState_InputControl\"]")).sendKeys("VIC");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrPostCode_InputControl\"]")).sendKeys("3142");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_radCiti_OSRES\"]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_drpCountryOfCiti_InputControl\"]")).sendKeys("Singapore");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_SubmissionCountry_drpCountry_InputControl\"]")).sendKeys("Australia");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpCountryOfBirth_InputControl\"]")).sendKeys("Iceland");
				Thread.sleep(3000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpMainLangAtHome_InputControl\"]")).sendKeys("English Only");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(8000);
				
				//Register page Confirmation
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(8000);				
				//???verify "You have been successfully registered as a user in our system"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(7000);
				
				//Select page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys("DP-ICT1");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();
				Thread.sleep(7000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl03_btnApply\"]")).click();
				Thread.sleep(7000);
				//???verify "Course DP-ICT1 - Diploma of Information Technology (UniLink) has been added to your application."
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys("BA-ICT");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();
				Thread.sleep(7000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl02_btnApply\"]")).click();
				Thread.sleep(7000);
				//???verify "Course BA-ICT - Bachelor of Information and Communication Technology has been added to your application."

				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_lnkSelectedCourses\"]")).click();
				Thread.sleep(5000);
				//???verify "BA-ICT" "DP-ICT1"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(5000);
				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\the" + String.valueOf(i) + "newStudent@" + formattedDate + ".png");	
				
				if (driver.findElements(By.xpath("//*[@id=\"ctl00_Content_EapPart_ScholarshipSrch_txtFreeTextSrch_InputControl\"]")).isEmpty()) {
					Screenshots.takeSnapShot(driver, fileNameWithPath);			
					System.out.println("The " + String.valueOf(i) + " new student failed. Scholarship page is not displayed.");
					driver.close();
					Assert.assertFalse(true);
				}		
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//???verify "Advanced Standing Application"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//???verify "Application Selection Summary"
				//???verify "BA-ICT" "DP-ICT1"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//Apply page			
				//???switch forms
				String shiftTab = Keys.chord(Keys.SHIFT, Keys.TAB);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "No");
				Thread.sleep(6000);
						
				
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_TermsAppln_chkAgreeTc\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(15000);
				//???verify "Thank you, your application has been submitted!"
				
				Screenshots.takeSnapShot(driver, fileNameWithPath);			
				System.out.println("The " + String.valueOf(i) + " new student and application created.");
				driver.close();

			} catch (Exception e) {
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + "@" + formattedDate + ".png");
				Screenshots.takeSnapShot(driver, fileNameWithPath);
				System.out.println("Create New failed. No Logout button found.");
				driver.close();
				Assert.assertFalse(true);
			}
		}
		//readExcel.excelWriter("C:\\Data\\newStudent.xlsx", newStudentslist);

	}
	
	
	
	@Test(testName = "STU-2971", priority = 1)
	public void eAppCreateNewCIAcheck() throws InterruptedException, Exception {
	
		
		String newStudentslist[][] = new String[numberOfNewStudent+1][2];
		newStudentslist[0][0]= "Student";
		newStudentslist[0][1]= "Course";
		String[] coursesList = {"GC-CMGT","GD-FBS","MA-CIMGT","MM-BAEXEI","MA-IT1","BA-BUS10","BA-CS","BA-ICT","BA-MCMN","BB-HSCBUS","AB-AV","XP-CISPG","XU-BUS","BH-ENG","BA-HSC1"};
		for (int i = 0; i < numberOfNewStudent; i++) {
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			String baseUrl = "http://s1-tst-web01.ds.swin.edu.au/eStudent/SM/eApplications/eAppLogin.aspx?f=%24S1.EAP.CI2LOGIN.WEB";
			
		
			try {
				//eApp portal login page
				driver.get(baseUrl);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_cmdRegister\"]")).click();
				Thread.sleep(2000);
				
				//Register page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpTitle_InputControl\"]")).sendKeys("Mr");
				Thread.sleep(1000);
								
				String tmpformattedDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String tmpformattedDate2 = new SimpleDateFormat("MMddHHmm").format(new Date());
				String studentFirstName = "S" + tmpformattedDate;
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys(studentFirstName);
				//driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys("TestStudent-A" + String.valueOf(i));

				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtFamName_InputControl\"]")).sendKeys("STUstudent");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobDay\"]")).sendKeys("9");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobMonth\"]")).sendKeys("September");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobYear\"]")).sendKeys("1999");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpGender_InputControl\"]")).sendKeys("Male");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmail_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmailConfirm_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_repPhone_ctl00_txtPhone_InputControl\"]")).sendKeys("04" + tmpformattedDate2);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpCountry_InputControl\"]")).sendKeys("Australia");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrLine1_InputControl\"]")).sendKeys(tmpformattedDate + " Toorak Road");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrSuburb_InputControl\"]")).sendKeys("Toorak");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpState_InputControl\"]")).sendKeys("VIC");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrPostCode_InputControl\"]")).sendKeys("3142");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_pnlCiti\"]/span[1]/label")).click();
				Thread.sleep(2000);							
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpCountryOfBirth_InputControl\"]")).sendKeys("Iceland");
				Thread.sleep(3000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpMainLangAtHome_InputControl\"]")).sendKeys("English Only");
				Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(8000);
				
				//Register page Confirmation
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(8000);				
				//???verify "You have been successfully registered as a user in our system"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(7000);
				
				//Select page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys("DP-ENG1");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();
				Thread.sleep(7000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl04_btnApply\"]")).click();
				Thread.sleep(7000);
				//???verify "Course DP-ICT1 - Diploma of Information Technology (UniLink) has been added to your application."
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_lnkSelectedCourses\"]")).click();
				Thread.sleep(5000);
				//???verify "DP-ENG1"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(5000);
				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\the" + String.valueOf(i) + "newStudent@" + formattedDate + ".png");	
				
				if (driver.findElements(By.xpath("//*[@id=\"ctl00_Content_EapPart_ScholarshipSrch_txtFreeTextSrch_InputControl\"]")).isEmpty()) {
					Screenshots.takeSnapShot(driver, fileNameWithPath);			
					System.out.println("The " + String.valueOf(i) + " new student failed. Scholarship page is not displayed.");
					driver.close();
					Assert.assertFalse(true);
				}		
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//???verify "Advanced Standing Application"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//???verify "Application Selection Summary"
				//???verify "BA-ICT" "DP-ICT1"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(3000);
				
				//Apply page			
				//???switch forms
				String shiftTab = Keys.chord(Keys.SHIFT, Keys.TAB);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab,"No");				
				Thread.sleep(6000);
						
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "2018");				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "Complete Secondary");				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "No");				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "Completed year 12");				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "2018");				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, "Australia");				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_TermsAppln_chkAgreeTc\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				Thread.sleep(15000);
				//???verify "Thank you, your application has been submitted!"
				
				Screenshots.takeSnapShot(driver, fileNameWithPath);			
				System.out.println("The " + String.valueOf(i) + " new student and application created.");
				//driver.close();

			} catch (Exception e) {
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\" + "@" + formattedDate + ".png");
				Screenshots.takeSnapShot(driver, fileNameWithPath);
				System.out.println("Create New failed. No Logout button found.");
				//driver.close();
				Assert.assertFalse(true);
			}
		}
		//readExcel.excelWriter("C:\\Data\\newStudent.xlsx", newStudentslist);

	}
	
	

	
	

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
	}
}