import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor

WebUI.click(findTestObject('Core Functionality/Registers/File/a_Add File'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

def filePath = RunConfiguration.getProjectDir() + '/TestFiles/Coffee Man.jpeg'

WebUI.uploadFileWithDragAndDrop(findTestObject('Core Functionality/Registers/File/a_Browse(SelectFilePop-Up)'), filePath)

WebUI.click(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/FileName(File Pop-Up)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Type(File Pop-Up)'), 1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Subtype(File Pop-Up)'), 1, FailureHandling.OPTIONAL)

def fileType = WebUI.getText(findTestObject('Object Repository/Core Functionality/Registers/File/Add File Pop-Up/FileType'), 
    FailureHandling.STOP_ON_FAILURE)

System.out.println(fileType)

if (fileType == '.jpeg') {
	
	WebDriver driver = DriverFactory.getWebDriver();
	WebElement image = driver.findElement(By.id("IsMainImage_summary"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", image);
	
	/*WebUI.check(findTestObject('Object Repository/Core Functionality/Registers/File/Add File Pop-Up/IsMainImage(File Pop-Up)'),
		FailureHandling.STOP_ON_FAILURE)*/
}

/*if (fileType == '.jpeg') {
    WebUI.check(findTestObject('Object Repository/Core Functionality/Registers/File/Add File Pop-Up/IsMainImage(File Pop-Up)'), 
        FailureHandling.STOP_ON_FAILURE)
}*/

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Description(File Pop-Up)'), 'Test')

WebUI.verifyElementChecked(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/IsMainImage(File Pop-Up)'), 
    1)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ARROW_DOWN))

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), 'Test')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Core Functionality/Registers/Vehicle/Edit Vehicle/input_save'))

WebUI.verifyElementPresent(findTestObject('General/MainImagePresent'), 1, FailureHandling.STOP_ON_FAILURE)

