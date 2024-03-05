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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Open the Web Browser'
WebUI.openBrowser("$GlobalVariable.Hostname")

WebUI.waitForPageLoad(5)

'Enter a Username'
WebUI.setText(findTestObject('General/Log On/txt_Username'), "$GlobalVariable.Username")

'Enter a Password'
WebUI.setText(findTestObject('General/Log On/txt_Password'), 'INVALIDPASSWORD', FailureHandling.STOP_ON_FAILURE)

'Press the Log On button'
WebUI.click(findTestObject('General/Log On/btn-submit'))

WebUI.waitForElementPresent(findTestObject('General/Log On/li_Incorrect username or password'), 3)

WebUI.verifyElementText(findTestObject('General/Log On/li_Incorrect username or password'), 'Incorrect username or password.')

WebUI.closeBrowser()

