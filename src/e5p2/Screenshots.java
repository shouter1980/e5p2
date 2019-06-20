package e5p2;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(fileWithPath);
	        FileUtils.copyFile(SrcFile, DestFile);
	        /*this is a test 2019-06-20 11:21"*/
	  }


}
