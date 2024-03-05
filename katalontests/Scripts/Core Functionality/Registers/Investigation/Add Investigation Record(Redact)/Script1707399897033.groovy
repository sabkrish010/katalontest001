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

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Select Add Investigation'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Investigation Details'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_SecurityClassification'), 
    'Official', false, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Type'), 'Initiated By Incident', 
    false, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Status'), 
    'Open', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Title'), (('Investigation of ' + 
    GlobalVariable.NewUser) + ' ') + GlobalVariable.NewFirstName)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Reference'), 'Tax Fraud', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/textarea_Summary'), ((GlobalVariable.NewUser + 
    ' ') + GlobalVariable.NewFirstName) + ' did not pay more than £12 million of his personal expenses.')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_StartDate'), Keys.chord(
        Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_ReviewAfter'), 
    '1 Week', true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_RecordStatus'), 'Active', 
    true)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Save'))

URN = WebUI.getText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/h3_Investigation_URN'))

URN2 = URN.replaceAll('\\[|\\]', '')

System.out.print(URN2)

WebUI.waitForElementVisible(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/span_PleaseConfirm'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/button_OK'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.STOP_ON_FAILURE)

'Return to Investigation Details Page'
not_run: WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

not_run: WebUI.verifyElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

