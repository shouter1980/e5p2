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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class STUTestCases {
	public WebDriver driver;
int numberOfNewStudent = 1;	

	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException {
		readExcel read = new readExcel();
		return read.getCellData("C:\\Data\\newStudent.xlsx", "STU");
	}

	@BeforeSuite
	public void launchFirefox() {
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ljiang\\Downloads\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Java-selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljiang\\Downloads\\chromedriver.exe");
	}


	
	@Test(testName = "STU-2974", priority = 1, enabled = false)
	public void eAppCreateNewStudent() throws InterruptedException, Exception {
	
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
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
				//Thread.sleep(2000);
				
				//Register page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpTitle_InputControl\"]")).sendKeys("Mr");
				//Thread.sleep(1000);
								
				String tmpformattedDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String tmpformattedDate2 = new SimpleDateFormat("MMddHHmm").format(new Date());
				String studentFirstName = "S" + tmpformattedDate;
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys(studentFirstName);
				//driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys("TestStudent-A" + String.valueOf(i));

				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtFamName_InputControl\"]")).sendKeys("STUstudent");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobDay\"]")).sendKeys("9");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobMonth\"]")).sendKeys("September");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobYear\"]")).sendKeys("1999");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpGender_InputControl\"]")).sendKeys("Male");
				//Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmail_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmailConfirm_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_repPhone_ctl00_txtPhone_InputControl\"]")).sendKeys("04" + tmpformattedDate2);
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpCountry_InputControl\"]")).sendKeys("Australia");
				//Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrLine1_InputControl\"]")).sendKeys(tmpformattedDate + " Toorak Road");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrSuburb_InputControl\"]")).sendKeys("Toorak");
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpState_InputControl\"]")).sendKeys("VIC");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrPostCode_InputControl\"]")).sendKeys("3142");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_radCiti_OSRES\"]")).click();
				//Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_drpCountryOfCiti_InputControl\"]")).sendKeys("Singapore");
				//Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_SubmissionCountry_drpCountry_InputControl\"]")).sendKeys("Australia");
				//Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpCountryOfBirth_InputControl\"]")).sendKeys("Iceland");
				//Thread.sleep(3000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpMainLangAtHome_InputControl\"]")).sendKeys("English Only");
				//Thread.sleep(1000);
								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(8000);
				
				//Register page Confirmation
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(8000);				
				//???verify "You have been successfully registered as a user in our system"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(7000);
				
				//Select page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys("DP-ICT1");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();
				//Thread.sleep(7000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl03_btnApply\"]")).click();
				//Thread.sleep(7000);
				//???verify "Course DP-ICT1 - Diploma of Information Technology (UniLink) has been added to your application."
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys("BA-ICT");
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();
				//Thread.sleep(7000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl02_btnApply\"]")).click();
				//Thread.sleep(7000);
				//???verify "Course BA-ICT - Bachelor of Information and Communication Technology has been added to your application."

				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_lnkSelectedCourses\"]")).click();
				//Thread.sleep(5000);
				//???verify "BA-ICT" "DP-ICT1"
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(5000);
				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\the" + String.valueOf(i) + "newStudent@" + formattedDate + ".png");	
				
				if (driver.findElements(By.xpath("//*[@id=\"ctl00_Content_EapPart_ScholarshipSrch_txtFreeTextSrch_InputControl\"]")).isEmpty()) {
					Screenshots.takeSnapShot(driver, fileNameWithPath);			
					System.out.println("The " + String.valueOf(i) + " new student failed. Scholarship page is not displayed.");
					driver.close();
					Assert.assertFalse(true);
				}		
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(3000);
				
				//???verify "Advanced Standing Application"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(3000);
				
				//???verify "Application Selection Summary"
				//???verify "BA-ICT" "DP-ICT1"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(3000);
				
				//Apply page			
				//???switch forms
				String shiftTab = Keys.chord(Keys.SHIFT, Keys.TAB);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "No");
				//Thread.sleep(6000);
						
				
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_TermsAppln_chkAgreeTc\"]")).click();
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//Thread.sleep(15000);
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
	
	
	
	@Test(testName = "STU-2971", dataProvider = "getExcelData", priority = 1)
	//public void eAppCreateNewCIAcheck() throws InterruptedException, Exception {
	public void eAppCreateNewCIAcheck(String studentFirstName, String courseNameCode) throws InterruptedException, Exception {
	
		String newStudentslist[][] = new String[numberOfNewStudent+1][2];
		newStudentslist[0][0]= "Student";
		newStudentslist[0][1]= "Course";
		//String[] coursesList = {"GC-CMGT","GD-FBS","MA-CIMGT","MM-BAEXEI","MA-IT1","BA-BUS10","BA-CS","BA-ICT","BA-MCMN","BB-HSCBUS","AB-AV","XP-CISPG","XU-BUS","BH-ENG","BA-HSC1"};
		
		//String courseNameCode = "DP-ENG1";
		for (int i = 0; i < numberOfNewStudent; i++) {
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			String baseUrl = "http://s1-tst-web01.ds.swin.edu.au/eStudent/SM/eApplications/eAppLogin.aspx?f=%24S1.EAP.CI2LOGIN.WEB";
			
		
			try {
				//eApp portal login page
				driver.get(baseUrl);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_cmdRegister\"]")).click();
				
				//Register page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpTitle_InputControl\"]")).sendKeys("Mr");								
				String tmpformattedDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String tmpformattedDate2 = new SimpleDateFormat("MMddHHmm").format(new Date());
				
				//String studentFirstName = "S" + tmpformattedDate;
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtGvnName_InputControl\"]")).sendKeys(studentFirstName);
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtFamName_InputControl\"]")).sendKeys("STUstudent");
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobDay\"]")).sendKeys("9");
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobMonth\"]")).sendKeys("September");
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_txtBirthDate_drpDobYear\"]")).sendKeys("1999");				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Personal_drpGender_InputControl\"]")).sendKeys("Male");							
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmail_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_txtEmailConfirm_InputControl\"]")).sendKeys(studentFirstName + "@ProjectSTU.com");		
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Contact_repPhone_ctl00_txtPhone_InputControl\"]")).sendKeys("04" + tmpformattedDate2);			
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpCountry_InputControl\"]")).sendKeys("Australia");
				Thread.sleep(2000);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrLine1_InputControl\"]")).sendKeys(tmpformattedDate + " Toorak Road");
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrSuburb_InputControl\"]")).sendKeys("Toorak");
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_drpState_InputControl\"]")).sendKeys("VIC");				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Address_txtAddrPostCode_InputControl\"]")).sendKeys("3142");		
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CitiResi_pnlCiti\"]/span[1]/label")).click();
				Thread.sleep(2000);														
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpCountryOfBirth_InputControl\"]")).sendKeys("Iceland");
				Thread.sleep(3000);							
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_Cultural_drpMainLangAtHome_InputControl\"]")).sendKeys("English Only");							
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				
				//Register page Confirmation
				int nTimeTries = 0;
				while (nTimeTries<50 && !driver.getTitle().contains("Swinburne University of Technology - Registration Confirmation - Ci2 eApplication Applicant Role")) {
					try {
						nTimeTries++;
						WebElement dynamicElement = (new WebDriverWait(driver, 90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ctl00_Content_pnlEdit\"]/div[1]/label")));							
						//wait for "Your Information" is displayed then click Next button"
						driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();							
					}
					catch(Exception e){
						System.out.print("Student is trying to click Registraion Confirmation button for the ");
						System.out.print(nTimeTries);
						System.out.println(" time.");
						Thread.sleep(2000);
					}				
				}
											
				WebElement dynamicElement = (new WebDriverWait(driver, 90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ctl00_Content_regConfirm_pnlEdit\"]/div[1]/label")));			
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				
				//Select page
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_txtFreeTextSrch_InputControl\"]")).sendKeys(courseNameCode);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_btnSearch\"]")).click();			
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_grdRslt_ctl04_btnApply\"]")).click();
				//???verify "Course DP-ICT1 - Diploma of Information Technology (UniLink) has been added to your application."				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_CourseSrch_lnkSelectedCourses\"]")).click();
				//???verify "DP-ENG1"				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();				
				String formattedDate = new SimpleDateFormat("dd.MM.yyyy_HH;mm;ss").format(new Date());
				String fileNameWithPath = new String("C:\\screenshots\\the" + String.valueOf(i) + "newStudent@" + formattedDate + ".png");	
				
				if (driver.findElements(By.xpath("//*[@id=\"ctl00_Content_EapPart_ScholarshipSrch_txtFreeTextSrch_InputControl\"]")).isEmpty()) {
					Screenshots.takeSnapShot(driver, fileNameWithPath);			
					System.out.println("The " + String.valueOf(i) + " new student failed. Scholarship page is not displayed.");
					driver.close();
					Assert.assertFalse(true);
				}						
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();				
				//???verify "Advanced Standing Application"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();			
				//???verify "Application Selection Summary"
				//???verify "BA-ICT" "DP-ICT1"
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();			
				
				//Apply page			
				//???switch forms
				String shiftTab = Keys.chord(Keys.SHIFT, Keys.TAB);				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab,"No");				
				Thread.sleep(9000);						
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "2018");							
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "Complete Secondary");							
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "No");				
				Thread.sleep(6000);			
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "Completed year 12");						
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, shiftTab, shiftTab, shiftTab, "2018");								
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_BackButton\"]")).sendKeys(shiftTab, shiftTab, "Australia");				
				Thread.sleep(6000);						
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();			
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_EapPart_TermsAppln_chkAgreeTc\"]")).click();				
				driver.findElement(By.xpath("//*[@id=\"ctl00_Content_ctlProgAction_NextButton\"]")).click();
				//???verify "Thank you, your application has been submitted!"				
				Screenshots.takeSnapShot(driver, fileNameWithPath);			
				System.out.println("New student " + studentFirstName + " and application created.");				
				//Thread.sleep(15000);
				
				
				//Staff works in CIA
				baseUrl = "https://s1-tst-cia.ds.swin.edu.au/T1TST/CiAnywhere/Web/TST/Workplace/Account/LogOn";
				driver.get(baseUrl);
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//*[@id=\"LogonName\"]")).sendKeys("LJIANG");
				driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("welcome123");
				driver.findElement(By.xpath("//*[@id=\"BtnLogOn\"]")).click();	
				driver.findElement(By.xpath("//*[@id=\"LnkToWorkplace\"]/span[1]")).click();					
				driver.findElement(By.xpath("//*[@id=\"Role3\"]/span[3]")).click();
				
				nTimeTries = 0;
				while (nTimeTries<50 && driver.getTitle().contains("Ci Anywhere Workplace")) {
					try {
						nTimeTries++;
						dynamicElement = (new WebDriverWait(driver, 90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Ci2Function3\"]/a")));							
						driver.findElement(By.xpath("//*[@id=\"Ci2Function3\"]/a")).click();						
					}
					catch(Exception e){
						driver.findElement(By.xpath("//*[@id=\"Role3\"]/span[3]")).click();
						Thread.sleep(2000);
					}				
				}
							
				nTimeTries = 0;
				while (nTimeTries<50 && !driver.getTitle().contains("Application Enquiry")) {
					try {
						nTimeTries++;
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ActionsMenu_menuItem0_DDC_DefaultButton\"]/span")).click();						
					}
					catch(Exception e){
						System.out.print("Staff is trying to click Applications button for the ");
						System.out.print(nTimeTries);
						System.out.println(" time.");
						Thread.sleep(2000);
					}				
				}
			
				dynamicElement = (new WebDriverWait(driver, 90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ActionsExMenu_menuItem0_DDC_DefaultButton\"]/span[2]")));			
				driver.findElement(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ActionsExMenu_menuItem0_DDC_DefaultButton\"]/span[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"GivenName\"]")).sendKeys(studentFirstName);
				driver.findElement(By.xpath("//*[@id=\"OtherName\"]")).click();		
				String newStudentIDwithName = driver.findElement(By.xpath("//*[@id=\"QuickEnquiryPopup\"]/div[1]/div[4]/div[2]/div[3]/div[3]/div/div/div/div[3]/div[1]/div/div/span")).getText();
				String newStudentID = newStudentIDwithName.substring(0, 9);				
				driver.findElement(By.xpath("//*[@id=\"GoToWorkplace\"]/span[2]")).click();								
				driver.findElement(By.xpath("//*[@id=\"Ci2Function3\"]/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"SearchValue\"]")).sendKeys(newStudentID + Keys.ENTER);
				driver.findElement(By.xpath("//*[@id=\"EnquiryRelatedDataPortlet_ThumbnailViewer_CARD\"]/div[4]/div/div/div/div[4]/div[1]/div/div/span")).click();
				
				String newStudentCourse = driver.findElement(By.xpath("//*[@id=\"AssessmentDetailSection\"]/div[1]")).getText();
				String newStudentCourseCode = newStudentCourse.substring(0,5);
				System.out.println("Student name and ID are " + studentFirstName + ", " + newStudentID + ". Expected " + courseNameCode + ". Actually got " + newStudentCourseCode);
				
				if(!courseNameCode.contains(newStudentCourseCode)) {		
					Assert.assertFalse(true);
				}
				driver.close();

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