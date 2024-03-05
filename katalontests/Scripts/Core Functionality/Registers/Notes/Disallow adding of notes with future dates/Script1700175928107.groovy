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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Navigate to notes register and validate page loading'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Select System View(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Add Note(plus button)'))

def result = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Registers/Notes/input_DateTime of Occurrence'), 
    'value')

System.out.println(result)

//def now = new Date().format('MM/dd/yyy')
//System.out.println(now)
//WebUI.verifyMatch(result, now, false)
Date todaysDate = new Date()

//Past Date from calendar//
def futureDate = (todaysDate + 7).format('MM/dd/yyyy')

System.out.println(futureDate)

WebUI.sendKeys(findTestObject('Object Repository/Core Functionality/Registers/Notes/input_DateTime of Occurrence'), futureDate)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/div_Reference'), Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Future Dates Warning(Notes)'), 
    3)

