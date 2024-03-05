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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Log Off/a_Log Off'))

WebUI.setText(findTestObject('General/Log On/txt_Username'), 'clue')

WebUI.setText(findTestObject('General/Log On/txt_Password'), 'nimda_68442')

WebUI.click(findTestObject('General/Log On/btn-submit'))

'Select the Registers link'
WebUI.click(findTestObject('Core Functionality/Registers/Address/Navigate to Address Register/a_Registers'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Incident/Navigate to Incident Register/a_Incident'), 
    3)

'Select the Address register link'
WebUI.click(findTestObject('Core Functionality/Registers/Address/Navigate to Address Register/a_Address'))

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('General/input_Print'), 0)

WebUI.click(findTestObject('General/input_Print'))

WebUI.click(findTestObject('General/input_OK(Print Pop-Up)'))

DownloadManager dm = new DownloadManager();
File dmf= dm.getLastDownloadedFile()

printIn(dmf)




