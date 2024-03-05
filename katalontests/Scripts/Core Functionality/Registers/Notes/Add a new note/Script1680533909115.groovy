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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import groovy.time.TimeCategory as TimeCategory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Navigate to notes register and validate page loading'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Select System View(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Add Note(plus button)'))

if (WebUI.setText(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/EnteredBy(Notes UI)'), 'Phil Smith1', FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/EnteredBy(Notes UI)'), 1)
}

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Type(Notes UI)'), 1)

WebUI.setText(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/input_Reference(Notes UI)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

def result = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Registers/Notes/input_DateTime of Occurrence'), 
    'value')

System.out.println(result)

def now = new Date().format('MM/dd/yyy')

System.out.println(now)

WebUI.verifyMatch(result, now, false, FailureHandling.OPTIONAL)

def now1 = new Date()

def nowTime = now1.format('HH:mm')

System.out.println(nowTime)

def hour = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Registers/Notes/input_Hour of Occurrence'), 
    'value')

def minutes = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Registers/Notes/input_Minute of Occurrence'), 
    'value')

def timeValue = WebUI.concatenate((([hour, ':', minutes]) as String[]), FailureHandling.STOP_ON_FAILURE)

System.out.println(timeValue)

WebUI.verifyMatch(timeValue, nowTime, false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/button_Add'))

WebUI.enableSmartWait()

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Delete a note'), [:], FailureHandling.STOP_ON_FAILURE)

