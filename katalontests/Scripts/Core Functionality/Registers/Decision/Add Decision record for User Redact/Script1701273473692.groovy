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

'Set the Security Classification to Official (if field is present)'
not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Decision/Add Decision/textarea_Decision'), 'Drax Maxwell global satellite')

WebUI.setText(findTestObject('Core Functionality/Registers/Decision/Add Decision/textarea_Reason'), 'Drax Maxwell global satellite roams the galaxy.')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Type'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Subtype'), 1, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_ReviewAfter'), '3 Years', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_RecordStatus'), 'Active', 
    true)

WebUI.selectOptionByValue(findTestObject('Redaction/select_Owner_Record'), 'Redact', false)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Redact', 
    false)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Add Person/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

WebUI.click(findTestObject('Core Functionality/Registers/Person/Add Person/input_save'))

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Decision/Decision Details/h2_Decision Details'), 
    FailureHandling.STOP_ON_FAILURE)

