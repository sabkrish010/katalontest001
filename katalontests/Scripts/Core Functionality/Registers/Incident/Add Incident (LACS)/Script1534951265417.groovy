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

'Verify Handling Codes exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (LACS)/label_Handling Code'), 
    2, FailureHandling.OPTIONAL)

'Verify Intelligence Evaluation exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (LACS)/label_Intelligence Evaluation'), 
    2, FailureHandling.OPTIONAL)

'Verify Source Evaluation exists'
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Add Incident (LACS)/label_Source Evaluation'), 
    2, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_RecordType'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_SubType'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Reference'), 'INC-01-KAT', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_HowReported'), 'Email', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_Title'), 'Incident relating to an illegal Deer Hunting')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Add Incident/textarea_Notes'), 'Further enquiries required')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_AssignedTo'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Priority'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_Status'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_ReviewAfter'), '3 Months', 
    false)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Event/h2_Incident Details'), FailureHandling.STOP_ON_FAILURE)

