package e5p2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class staffAssessment {
	public static void verifyCourse(WebDriver driver, String courseName) throws Exception {
		switch (courseName) {

		case "GC-CMGT":
		case "GD-FBS":
		case "MA-CIMGT":
		case "MM-BAEXEI":
		case "MA-IT1":
			// 7 questions
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			break;

		
		case "BA-BUS10":
		case "BA-CS":
		case "BA-ICT":
		case "BA-MCMN":
			// 10 questions
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class = 'defaultAction primary']")).click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[9]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[10]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);

			break;

		case "BB-HSCBUS":
		case "AB-AV":
			// 8 questions
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);

			break;

		case "XP-CISPG":
		case "XU-BUS":
			// 6 questions
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			break;

		case "BH-ENG":
			// 9 questions
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[9]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);

			break;

		
		case "BA-HSC1":
			// 9 questions b
			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[1]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[4]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[5]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[8]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[9]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[2]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[6]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.sendKeys(Keys.TAB, Keys.TAB, "No", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[3]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, "2018", Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB,
					Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, "Complete Secondary", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='RequirementSection_TopActionPanel']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"//*[@id=\"RequirementListSection_RDP_ThumbnailViewer_CARD\"]/div[4]/div/div[7]/div/div[4]/div[1]/div/ul/li/button[1]/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id='RequirementSection_Requirement_VerificationStatus_Container']/div[2]/button"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Verified')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, "Year 8 or below", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]"))
					.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "2018", Keys.ENTER, Keys.ENTER, Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"RequirementSection_Requirement_VerificationStatus\"]")).sendKeys(
					Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Australia", Keys.ENTER, Keys.ENTER,
					Keys.TAB, Keys.TAB);
			Thread.sleep(2000);

			break;	
			
			
		default:
			System.out.println("Sorry, no such course. Please double check.");

		}

	}

}
