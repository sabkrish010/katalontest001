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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

/*Configurable Setting (may not be on)*/
not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Add Person/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Add Person/select_Type'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Add Person/select_SubType'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_Surname'), GlobalVariable.NewUser)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_Forename'), GlobalVariable.NewFirstName)

not_run: WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Add Person/select_Sex'), 'Male', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Add Person/select_1 ICCode'), '7 Other', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_PNCID'), '19/0000019K', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Add Person/select_Religion'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Add Person/select_Deceased'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/textarea_FurtherDetails'), 'Brown Hair, Brown Eyes, 5"10, 1 inch Scar above right eye')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_Occupation'), 'Doctor of medicine', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_ReasonForNominal'), 'Person of interest')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/input_Source'), 'unknown', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Add Person/textarea_Notes'), 'Notes')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Add Person/select_ReviewAfter'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_RecordStatus'), 'Active', 
    true)

not_run: WebUI.selectOptionByValue(findTestObject('Redaction/select_Owner_Record'), 'Redact', false)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
not_run: WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

not_run: WebUI.selectOptionByIndex(findTestObject('Redaction/select_Owner_Record'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Add Person/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 2)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

WebUI.click(findTestObject('Core Functionality/Registers/Person/Add Person/input_save'))

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Person/Person Details/h2_Person Details'), FailureHandling.STOP_ON_FAILURE)

