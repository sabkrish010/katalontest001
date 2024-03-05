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

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Research/Global Search/select_SearchDropdown'), 'Records', 
    true)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 'Joe Bloggs')

WebUI.click(findTestObject('Core Functionality/Research/Global Search/Go_Button'))

not_run: WebUI.waitForPageLoad(7)

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 7)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Research/Global Search/select_SearchDropdown'), 'Attachments', 
    true)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 'Crime')

WebUI.click(findTestObject('Core Functionality/Research/Global Search/Go_Button'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 7)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Research/Global Search/select_SearchDropdown'), 'Records and attachments', 
    true)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 'Incident')

WebUI.click(findTestObject('Core Functionality/Research/Global Search/Go_Button'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 7)

'Verify the presence of the Attachments checkbox'
WebUI.verifyElementClickable(findTestObject('Core Functionality/Research/Global Search/span_File'))

'Un-check the Attachments checkbox'
WebUI.click(findTestObject('Core Functionality/Research/Global Search/span_File'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Research/Global Search/Go_Button'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 7)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 'NonsenseSearchTerm')

WebUI.click(findTestObject('Core Functionality/Research/Global Search/Go_Button'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 7)

WebUI.verifyElementText(findTestObject('Core Functionality/Research/Global Search/span_No results found'), 'No results found.', 
    FailureHandling.CONTINUE_ON_FAILURE)

