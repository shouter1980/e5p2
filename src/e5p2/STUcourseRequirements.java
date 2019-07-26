package e5p2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class STUcourseRequirements {
	public static void populateRequirements(WebDriver driver, String courseName) throws Exception {
		switch (courseName) {

		case "BA-PSY":
			// 9 questions
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[2]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			WebElement dynamicElement = (new WebDriverWait(driver,90)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")));
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			//dynamicElement = (new WebDriverWait(driver,90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")));
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[3]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("2018", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_2_RequirementResponse')]")).get(3).sendKeys("Complete Secondary", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[6]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[7]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("Completed year 12", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_2_RequirementResponse')]")).get(3).sendKeys("2018", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_2_RequirementResponse')]")).get(3).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownPanel\"]/ul/li[8]/a/span[2]")).click();
			Thread.sleep(7000);
			break;
			
		case "DR-ENG":
			// 12 questions
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[1]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			dynamicElement = (new WebDriverWait(driver,90)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")));
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("Test Answer 1", Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[2]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[3]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();		
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[4]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("2018", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_2_RequirementResponse')]")).get(3).sendKeys("Complete Secondary", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[5]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[6]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[7]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[9]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(4000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Questions_3_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(5000);			
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Requirements_1_RequirementResponseItems_1_Questions_1_RequirementResponse')]")).get(3).sendKeys("Test Answer 5");
			Thread.sleep(1000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Requirements_1_RequirementResponseItems_1_Questions_4_RequirementResponse')]")).get(3).sendKeys("Test Answer 6");
			Thread.sleep(1000);
			driver.findElements(By.xpath("//*[starts-with(@id,'RequirementSection_Requirement_RequirementResponseItems_1_Requirements_1_RequirementResponseItems_1_Questions_2_RequirementResponse')]")).get(3).sendKeys("No", Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[11]/div/div[3]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_1_Attachments\"]/div[1]/ul[1]/li/button")).click();
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_1_Attachments\"]/div[1]/ul[1]/li/div/ul/li/a")).click();
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_C);        // C
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"attType_newFiles_$S1_EAP\"]")).sendKeys("Passport");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"Popup1\"]/div/footer/div/button[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_3_Attachments\"]/div[1]/ul[1]/li/button")).click();
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_3_Attachments\"]/div[1]/ul[1]/li/div/ul/li/a")).click();
			Thread.sleep(2000);
			r = new Robot();
			r.keyPress(KeyEvent.VK_C);        // C
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"attType_newFiles_$S1_EAP\"]")).sendKeys("Passport");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"Popup1\"]/div/footer/div/button[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_2_Attachments\"]/div[1]/ul[1]/li/button")).click();
			driver.findElement(By.xpath("//*[@id=\"Requirement_RequirementDocuments_2_Attachments\"]/div[1]/ul[1]/li/div/ul/li/a")).click();
			Thread.sleep(2000);
			r = new Robot();
			r.keyPress(KeyEvent.VK_C);        // C
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"attType_newFiles_$S1_EAP\"]")).sendKeys("Passport");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"Popup1\"]/div/footer/div/button[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownButton\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"MoreActions_DropDownPanel\"]/ul/li[8]/a/span[2]")).click();
			Thread.sleep(7000);
			break;


		default:
			System.out.println("Sorry, no such course. Please double check.");

		}

	}
	
	
	public static void verifyRequirements(WebDriver driver, String courseName) throws Exception {
		switch (courseName) {

		case "BA-PSY":
			// 9 questions
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[9]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
					
			break;
			
		case "DR-ENG":
			// 14 questions
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[9]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[10]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[11]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[12]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[13]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[3]/div/div[14]/div/div[4]/div[1]/div/ul/li/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys("Verified", Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_TopSaveButton\"]/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"GlobalHeader\"]/div/div/div[2]/ul/li[1]/div/button/span")).click();
		
			break;

			
			


		default:
			System.out.println("Sorry, no such course. Please double check.");

		}

	}

	
	

}
