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

'Open the Web Browser'
WebUI.openBrowser("$GlobalVariable.Hostname")

WebUI.waitForPageLoad(5)

'Enter a Username'
WebUI.setText(findTestObject('General/Log On/txt_Username'), 'sysadmin')

'Enter a Password'
WebUI.setText(findTestObject('General/Log On/txt_Password'), 'nimda_68442', FailureHandling.STOP_ON_FAILURE)

'Press the Log On button'
WebUI.click(findTestObject('General/Log On/btn-submit'))

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://test.clue.co.uk/support/cluerelease/admin/recordpermissions')

WebUI.delay(5)

WebUI.click(findTestObject('General/Admin URL/select_Register'))

WebUI.selectOptionByIndex(findTestObject('General/Admin URL/select_Register'), 1, FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementChecked(findTestObject('General/Admin URL/restrictAccess chbx'), 1, FailureHandling.OPTIONAL))
	{
		WebUI.click(findTestObject('General/Admin URL/restrictAccess chbx'))
		
		WebUI.click(findTestObject('General/Admin URL/Span_OK(recordpermissions)'))
		
		WebUI.click(findTestObject('General/Admin URL/input_RecordPerm Save'), FailureHandling.OPTIONAL)
	}
	
WebUI.refresh()

WebUI.click(findTestObject('General/Admin URL/select_Register'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('General/Admin URL/select_Register'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Admin URL/restrictAccess chbx'))

WebUI.click(findTestObject('General/Admin URL/input_RecordPerm Save'))

WebUI.click(findTestObject('General/Admin URL/RemovePermissions OK'))

WebUI.refresh()

WebUI.click(findTestObject('General/Admin URL/select_Register'))

WebUI.selectOptionByIndex(findTestObject('General/Admin URL/select_Register'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Admin URL/restrictAccess chbx'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Admin URL/Span_OK(recordpermissions)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Admin URL/input_RecordPerm Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

