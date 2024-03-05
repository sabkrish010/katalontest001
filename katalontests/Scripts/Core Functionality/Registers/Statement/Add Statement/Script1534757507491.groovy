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

'Configurable Setting (may not be on)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Statement/Add Statement/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

'Set the Type'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Statement/Add Statement/select_Type'), 'Witness', 
    true)

'Enter a Title'
WebUI.setText(findTestObject('Core Functionality/Registers/Statement/Add Statement/input_Title'), 'Statement given by Kieron Matthews on 17/09/2018')

'Enter a Description'
WebUI.setText(findTestObject('Core Functionality/Registers/Statement/Add Statement/textarea_Description'), 'I am John Smith and I reside at the address shown overleaf. ')

'Mandatory Field'
WebUI.setText(findTestObject('Core Functionality/Registers/Statement/Add Statement/input_DateTaken'), '02/05/2018')

'Select a Review After value'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Statement/Add Statement/select_ReviewAfter'), '3 Months', 
    true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Statement/Add Statement/select_RecordStatus'), 'Active', 
    true)

'Press the Save button'
WebUI.click(findTestObject('Core Functionality/Registers/Statement/Add Statement/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Statement/Statement Details/h2_Statement Details'), 
    FailureHandling.STOP_ON_FAILURE)

