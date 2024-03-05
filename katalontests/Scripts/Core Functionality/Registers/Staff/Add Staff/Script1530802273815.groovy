import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Configurable Setting (may not be on)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_RecordType'), 'Contracted', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Reference'), 'Internal')

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_RecordStatus'), 'Active', 
    true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_Title'), 'Mr', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Surname'), 'Matthews')

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Forename'), 'Kieron')

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_PlaceOfBirth'), 'Swindon')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_Gender'), 'Male', true, FailureHandling.STOP_ON_FAILURE)

'Ethnicity'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_ICCode'), '1 White European', 
    true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_PNCID'), '19/0000019K', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_Religion'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_Deceased'), '0', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/textarea_FurtherDetails'), 'Police Officer on deputation from Avon & Somerset Constabulary')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Staff/Add Staff/select_Nationality'), 1)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Occupation'), 'I.T. Analyst')

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Reason'), 'N/A', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_Source'), 'Administrator', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Staff/Add Staff/textarea_Notes'), 'To be completed.')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Staff/Add Staff/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Staff/Staff Details/h2_Staff Details'), FailureHandling.STOP_ON_FAILURE)

