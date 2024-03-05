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

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_Type'), 'Email Address', 
    true)

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication/input_Reference'), 'Personal Email')

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_RecordStatus'), 
    'Active', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication/input_NumberOrAddress'), 'rogersj@yahoo.com')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_ServiceProvider'), 
    'Virgin Media', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication/input_Reason'), 'N/A')

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication/input_Source'), 'Internal')

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication/textarea_Notes'), 'Subject to enquiry')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_ReviewPeriod'), 
    '3 Months', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Intelligence Source Management', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Communication/Add Communication/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Communication/Communication Details/h2_Communication Details'), 
    FailureHandling.STOP_ON_FAILURE)

