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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('General/input_Print'))

WebUI.enhancedClick(findTestObject('General/Print - Append files'))

WebUI.check(findTestObject('General/Print/AppendAll'))

WebUI.callTestCase(findTestCase('General/Check SaveToReportHistory check-box'), [:], FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/General/Print/Ok button (print pop-up)'))

def now = new Date().format('MM/dd/yyy')

def now1 = new Date().format('dd/MM/yyy')

def nowDate = new Date()

def nowTime = nowDate.format('HH:mm')

System.out.println(nowTime)

def currentDateTime = WebUI.concatenate((([now, ' ', nowTime]) as String[]), FailureHandling.STOP_ON_FAILURE)

System.out.println(currentDateTime)

def currentDateTime1 = WebUI.concatenate((([now1, ' ', nowTime]) as String[]), FailureHandling.STOP_ON_FAILURE)

System.out.println(currentDateTime1)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/File/Close preview modal'), [:], FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('General/Report History/span_Report History'), 2)

WebUI.comment('Get value in date/time value in report history')

def reportTime = WebUI.getText(findTestObject('Object Repository/General/Report History/ReportHistory_CreatedDateTime'))

System.out.println(reportTime)

System.out.println(reportTime.equals(currentDateTime))

System.out.println(reportTime.equals(currentDateTime1))

if (!(reportTime.equals(currentDateTime) || reportTime.equals(currentDateTime1))) {
    //KeywordUtil.markFailed('error')
    assert false
}

