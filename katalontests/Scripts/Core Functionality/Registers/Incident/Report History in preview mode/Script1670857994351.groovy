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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/input_Print'))

WebUI.click(findTestObject('General/Print/SaveReportHistory'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Print/Yes(ReportHistory)'), FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('Core Functionality/Registers/File/Preview Modal/span_File Preview'), 3)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button_Close(preview)'), 30)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button_Close(preview)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('General/Print/a_pdf(ReportHistory)'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/input_Print'))

WebUI.click(findTestObject('General/Print/Report only print'))

WebUI.click(findTestObject('General/Print/SaveReportHistory'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/ReportHistory_Yes'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Print/Ok button (print pop-up)'))

WebUI.waitForElementVisible(findTestObject('Core Functionality/Registers/File/Preview Modal/span_File Preview'), 3)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button_Close(preview)'), 10, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('General/Print/a_pdf(ReportHistory)'), 3)

WebUI.click(findTestObject('General/Print/a_pdf(ReportHistory)'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'), FailureHandling.OPTIONAL)

