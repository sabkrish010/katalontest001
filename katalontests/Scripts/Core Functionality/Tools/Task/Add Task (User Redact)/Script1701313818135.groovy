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
not_run: WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_SecurityClassification'), 
    1, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type'), 9, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Redaction/Select Person/input_Title_Subject'), (('PII Redaction for ' + GlobalVariable.NewUser) + 
    ' ') + GlobalVariable.NewFirstName)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), ((GlobalVariable.NewUser + 
    ' ') + GlobalVariable.NewFirstName) + '\' house is the oldest structure on the block.')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Priority'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Redaction/Allocate Team/input_button'))

WebUI.selectOptionByValue(findTestObject('Redaction/Allocate Team/select_Select a Team'), 'Redact', true)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_ReviewAfter'), '3 Months', 
    true)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1, FailureHandling.OPTIONAL)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Redact', true, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/a_Select Person'))

WebUI.setText(findTestObject('Redaction/Select Person/input_Search All Fields_freeText'), GlobalVariable.NewUser)

WebUI.click(findTestObject('Redaction/Select Person/input_Search All Fields_goSelectLink'))

WebUI.click(findTestObject('Redaction/Select Person/a_SelectPerson_List'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_OwnerTeam'), 
    'Redact', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_on_save'))

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 0)

WebUI.click(findTestObject('Redaction/span_Redaction_ui-Close-button-icon'))

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 0)

WebUI.click(findTestObject('Redaction/span_Redaction_ui-Close-button-icon'))

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 0)

WebUI.click(findTestObject('Redaction/span_Redaction_ui-Close-button-icon'))

WebUI.click(findTestObject('Redaction/Select Person/a_Find matching Users to redact'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 0)

WebUI.click(findTestObject('Redaction/span_Redaction_ui-Close-button-icon'))

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'Complete', 
    false)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

