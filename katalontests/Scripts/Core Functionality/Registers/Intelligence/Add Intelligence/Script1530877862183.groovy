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

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/h3_In Draft-ORIGINAL'), 
    3)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_SecurityClassification'), 
    'Official Sensitive', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_Type'), 
    'Security', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_Investigation'), 
    'Main Event')

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_ReportTitle'), 
    'Ticket touting at the gates')

'Date Occurred'
WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_OccurrenceDate'))

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/a_1'))

not_run: WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_OccurrenceTime'), 
    '10:00')

WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_OccurrenceEndDate'), 
    FailureHandling.STOP_ON_FAILURE)

'Select a date from the picker (1st of the month)'
WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/a_1'))

not_run: WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_OccurrenceEndTime'), 
    '15:00')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_SourceEvaluation'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_IntelligenceAssessment'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_HandlingCode'), 
    'P', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/textarea_edit inline-child'), 
    'Suspicious looking individual')

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/textarea_Summary'), 
    'Sighting of unknown person outside gate 5, further enquiries required.')

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_RecordStatus'), 'Active', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Intelligence Source Management', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/h2_Intelligence Details'), 
    FailureHandling.STOP_ON_FAILURE)

