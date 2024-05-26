package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.Utility;

public class ProjectSpecificationMethod extends Utility {

	// Public method to launch browser and load url
	// Parameter tag to pass the browser and url values from testng xml
	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void browserLaunch(String browser, String url) {
		launchBrowser(browser, url);
	}

	// Public method to close browser
	@AfterMethod
	public void browserClose() {
		closeBrowser();
	}

	// Public method to read data from excel sheet
	@DataProvider(name = "ReadfromExcel")
	public String[][] excelRead() throws IOException {
		String[][] data = readExcel(excelFile, sheetName);
		return data;
	}

}