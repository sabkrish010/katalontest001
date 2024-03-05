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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Reference'))

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Taken By'), FailureHandling.STOP_ON_FAILURE)

'Configurable Setting (may not be on)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_RecordType'), 'Betting Concern', 
    true)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SubType'), 
    'Criminal', false)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Reference'), 'INC-01-KAT', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_HowReported'), 'Anonymous Call', 
    false)

'Date Occurred'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Date Occurred'))

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/a_1'))

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Title'), 'Drax Maxwell global satellite roams the galaxy.')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/textarea_Notes'), 'Further enquiries required')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_AssignedTo'), 'Kat Alon', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_AssignedTo'), 'Kat Alon', 
    false, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Priority'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Status'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_ReviewAfter'), '3 Months', 
    false)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_Team'), 'Redact', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Redact', false)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Note Pop Up/a_Add Other Notes'))

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Note Pop Up/input_Entered By_Custom1'), (GlobalVariable.NewUser + 
    ' ') + GlobalVariable.NewFirstName)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Note Pop Up/input_Date Created_Custom2'))

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/a_1'))

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Note Pop Up/textarea_Notes_Custom3'), (('Incident enter by ' + 
    GlobalVariable.NewUser) + ' ') + GlobalVariable.NewFirstName)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Note Pop Up/button_Add'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

