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

'Set the Security Classification to Official (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Decision/Add Decision/textarea_Decision'), 'Decision Field')

WebUI.setText(findTestObject('Core Functionality/Registers/Decision/Add Decision/textarea_Reason'), 'Reason Field')

WebUI.click(findTestObject('Core Functionality/Registers/Decision/Add Decision/input_Date of Decision_Date'))

WebUI.click(findTestObject('Core Functionality/Registers/Decision/Add Decision/a_1'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_DecisionMaker'), 'Kat Alon', 
    true)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Type'), 1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Subtype'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Subtype'), 1, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_ReviewAfter'), '3 Years', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Clue - Edit Decision/a_Select File'))

WebUI.click(findTestObject('Page_Clue - Edit Decision/input_Search All Fields_goSelectLink'))

WebUI.click(findTestObject('Page_Clue - Edit Decision/a_Select'))

WebUI.click(findTestObject('Page_Clue - Edit Decision/span_Reason_ui-button-icon ui-icon ui-icon-_41c4bb'))

WebUI.click(findTestObject('Page_Clue - Edit Decision/div_Attachment'))

WebUI.click(findTestObject('Page_Clue - Edit Decision/input'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_RecordStatus'), 'Active', 
    true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1)

WebUI.click(findTestObject('Core Functionality/Registers/Decision/Add Decision/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Decision/Decision Details/h2_Decision Details'), 
    FailureHandling.STOP_ON_FAILURE)

