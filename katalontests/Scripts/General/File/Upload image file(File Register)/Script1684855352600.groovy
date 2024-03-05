import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Description(File Pop-Up)'), 'Test')

WebUI.verifyElementChecked(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/IsMainImage(File Pop-Up)'), 
    1)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ARROW_DOWN))

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), 'Test')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Core Functionality/Registers/Vehicle/Edit Vehicle/input_save'))

