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
import org.openqa.selenium.Keys as Keys

'Verify Label exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Location'), 0, 
    FailureHandling.STOP_ON_FAILURE)

'Verify Equine Type exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Equine Type'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Verify No. of Equines exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_No. of Equines'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Verify Breed exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Breed'), 0, FailureHandling.STOP_ON_FAILURE)

'Verify Age exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Age'), 0, FailureHandling.STOP_ON_FAILURE)

'Verify Assigned To exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Assigned To'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Verify Case Priority exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Case Priority'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Verify District exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_District'), 0, 
    FailureHandling.STOP_ON_FAILURE)

'Verify Premise Type exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Premise Type'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

'Verify Status exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Status'), 0, FailureHandling.STOP_ON_FAILURE)

'Verify Caller Informed exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/label_Caller Informed'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_RecordType'), 'Welfare Concern', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SubType'), 'At Risk', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_HowReported'), 'Telephone', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/textarea_Notes'), 'Further enquiries required')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/input_Location'), 'In a field, on the outskirts of Bristol')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_EquineType'), 
    'Horse', false)

'No. of Equines of Concern'
WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/textarea_No of Equines of Concern'), 
    '10', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_Breed'), 'Welsh Cob', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/input_EquineAge'), '7', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_AssignedTo'), 'Kat Alon', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Priority'), 'P1', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_District'), 'Shropshire', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_PremiseType'), 
    'Common land', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_Status'), 'Further Action Required', 
    false)

'Date Completed'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/input_Date Completed'))

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/a_1'))

'Caller Informed: "Yes"'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_CallerInformed'), 
    '1', true)

'Trial Concern (custom field)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/select_TrialConcern'), 
    'Yes', false)

'Total No. at location (custom field)'
WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident (WHW)/input_Total No at Location'), '3', 
    FailureHandling.STOP_ON_FAILURE)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Event/h2_Incident Details'), 
    FailureHandling.STOP_ON_FAILURE)

