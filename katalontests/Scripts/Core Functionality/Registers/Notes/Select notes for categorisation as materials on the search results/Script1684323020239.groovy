import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Add a new note'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Select System View(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebDriver driver = DriverFactory.getWebDriver();
WebElement selectNote = driver.findElement(By.id("cb-1"));
selectNote.click();*/

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Notes/SelectNote'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/BulkAction(New Note)'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/a_Link to material'))

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/Page_Clue - Investigation Notes/NoteLinkYes Alt'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Links/Page_Clue - Investigation Notes/OK_NotesLinkOK'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/LinkComplete_OK'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Delete a note'), [:], FailureHandling.STOP_ON_FAILURE)

