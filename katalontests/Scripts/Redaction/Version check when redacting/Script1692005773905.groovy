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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebMobileDriverFactory as WebMobileDriverFactory
import org.openqa.selenium.WebDriver as WebDriver

String result1 = WebUI.getText(findTestObject('Object Repository/Redaction/1st Results(Redact Pop-Up)'))

String[] resultArr = result1.split('\\|')

def result2 = (resultArr[1]).trim()

System.out.println(resultArr)

System.out.println(resultArr[1])

System.out.println(result2)

urlText = WebUI.getUrl().split('#')

partial_url = (urlText[(urlText.size() - 2)])

System.out.println(partial_url)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

int currentTab = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl(partial_url)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), result2)

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Select a record from inside investigation mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(currentTab)

WebUI.click(findTestObject('Redaction/button_Redact(Redact Pop-Up)'))

WebUI.click(findTestObject('Redaction/button_CancelRedact confirm)'))

WebUI.click(findTestObject('Redaction/button_Redact(Redact Pop-Up)'))

WebUI.click(findTestObject('Redaction/Redact Confirm Btn'))

