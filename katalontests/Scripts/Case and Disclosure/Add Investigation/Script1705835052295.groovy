import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_SecurityClassification'), 
    'Official', false, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Type'), '2')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Status'), 
    'Open', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Title'), 'Case and Disclosure - Hawaiian Businessman.')

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Reference'), 'Tax Fraud', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/textarea_Summary'), 'Outstanding payment of more than £2 million.')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_StartDate'), Keys.chord(
        Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_ReviewAfter'), 
    '1 Week', true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_RecordStatus'), 'Active', 
    true)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Save'))

not_run: WebUI.waitForElementVisible(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/span_PleaseConfirm'), 
    5, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/button_OK'), FailureHandling.OPTIONAL)

'Return to Investigation Details Page'
not_run: WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

