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

WebUI.callTestCase(findTestCase('General/Switch to Standard mode improvised'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Make a register field mandatory on Field Management page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Select Add Address (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Options/Field Management/Warning FieldManagement'), 2)

WebUI.click(findTestObject('General/Cancel(RecordPage)'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Remove mandatoriness on a field'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Event', false, FailureHandling.OPTIONAL)

WebUI.uncheck(findTestObject('Core Functionality/Options/Field Management/checkbox(FieldManagement)'), FailureHandling.OPTIONAL)

WebUI.check(findTestObject('Core Functionality/Options/Field Management/checkbox(FieldManagement)'))

WebUI.click(findTestObject('Core Functionality/Options/Field Management/Save(FieldManagement)'))

WebUI.click(findTestObject('General/Admin URL/Span_OK(recordpermissions)'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Navigate to Event register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Select Add Event (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_save'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Options/Field Management/Warning FieldManagement'), 2)

WebUI.click(findTestObject('General/Cancel(RecordPage)'))

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Event', false, FailureHandling.OPTIONAL)

WebUI.uncheck(findTestObject('Core Functionality/Options/Field Management/checkbox(FieldManagement)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Options/Field Management/Save(FieldManagement)'))

WebUI.click(findTestObject('General/Admin URL/Span_OK(recordpermissions)'))

