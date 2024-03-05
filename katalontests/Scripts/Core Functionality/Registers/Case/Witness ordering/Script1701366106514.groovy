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

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Investigation/Investigation Dropdown'), 5)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Investigation/Investigation Dropdown'), 'Operation LEOPARD', 
    false, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Navigate to Case register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Click Sync on a case record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/select_ScheduleDropDown'), 
    0)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/select_ScheduleDropDown'), 
    'MG9 Witness List', false)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/GenerateButton'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Move Down'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Move Up'))

WebUI.check(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/Continuation_checkbox'))

WebUI.uncheck(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/Continuation_checkbox'))

WebUI.verifyElementClickable(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Preview'))

WebUI.verifyElementClickable(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Submit'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/Close_Button'))

