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

'Select the Registers link'
WebUI.click(findTestObject('Core Functionality/Registers/Address/Navigate to Address Register/a_Registers'))

'Select the Address register link'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Navigate to Incident Register/a_Incident'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Select Add Incident (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Reference'))

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Taken By'), FailureHandling.STOP_ON_FAILURE)

'Configurable Setting (may not be on)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_RecordType'), 'Notifiable Association', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SubType'), 'Criminal', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Reference'), 'INC-01-KAT', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_HowReported'), 'Anonymous Call', 
    false)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Select Source'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/select_Type'), 
    'Person', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/select_Title'), 
    'Dr', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/input_Forename'), 'Joe')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/input_Surname'), 'Ratburn')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/select_Category'), 
    'IS', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/Notes'), 'Test')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/select_OwnerTeam'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/input'))

'Date Occurred'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Date Occurred'))

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/a_1'))

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Title'), 'Incident relating to an illegal betting syndicate')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/textarea_Notes'), 'Further enquiries required')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_AssignedTo'), 'Kat Alon', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Priority'), 'P1', false, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Status'), 'Further Action Required', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_ReviewAfter'), '3 Months', 
    false)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Intelligence Source Management', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.click(findTestObject('General/Log Off/a_Log Off'))

WebUI.setText(findTestObject('General/Log On/txt_Username'), 'clue')

WebUI.setText(findTestObject('General/Log On/txt_Password'), 'nimda_68442')

WebUI.click(findTestObject('General/Log On/btn-submit'))

'Select the Registers link'
WebUI.click(findTestObject('Core Functionality/Registers/Address/Navigate to Address Register/a_Registers'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Incident/Navigate to Incident Register/a_Incident'), 
    3)

'Select the Address register link'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Navigate to Incident Register/a_Incident'))

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 0)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Promote/Promote button'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Promote/promote_OK'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Delete investigation'), [:], FailureHandling.STOP_ON_FAILURE)

