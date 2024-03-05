import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Standard mode improvised'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)*/
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Select Add Address (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Add Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/File/Upload multiple files using dragNdrop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Registers/File/span_FileLinks'), 8)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/File/span_FileLinks'), 2)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/File/a_Preview Button'), 10)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/File/a_Preview Button'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Core Functionality/Registers/File/Preview Modal/span_File Preview'), 
    15)

WebUI.enhancedClick(findTestObject('Object Repository/Core Functionality/Registers/File/Preview Modal/span_File Preview'))

WebUI.verifyElementClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Properties'))

WebUI.verifyElementNotClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__previous'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__previous'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__previous'))

WebUI.verifyElementNotClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button__previous'))

WebUI.verifyElementClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'), 
    8)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'))

WebUI.callTestCase(findTestCase('General/Delete Record - Copy'), [:], FailureHandling.STOP_ON_FAILURE)

