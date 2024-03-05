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
import groovy.time.TimeCategory as TimeCategory
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Navigate to notes register and validate page loading'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Select System View(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Add Note(plus button)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/EnteredBy(Notes UI)'), 1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Type(Notes UI)'), 1)

WebUI.setText(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/input_Reference(Notes UI)'), 'YVDTNFJ9CO')

WebUI.clearText(findTestObject('Core Functionality/Registers/Notes/input_DateTime of Occurrence'))

WebUI.clearText(findTestObject('Core Functionality/Registers/Notes/input_Hour of Occurrence'))

WebUI.clearText(findTestObject('Core Functionality/Registers/Notes/input_DateTime of Occurrence'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/button_Add'))

WebDriver driver = DriverFactory.getWebDriver();
WebElement inputBox = driver.findElement(By.id("OccurrenceDateTime_picker"));
def textInsideInputBox = inputBox.getAttribute("value");

// Check whether input field is blank
if(textInsideInputBox.isEmpty())
{
	System.out.println(textInsideInputBox);
	System.out.println("Input field is empty");
}

//if (value == '') { throw new Exception('Empty value found')}

WebUI.verifyEqual(textInsideInputBox ,'')


WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Delete a note'), [:], FailureHandling.STOP_ON_FAILURE)

