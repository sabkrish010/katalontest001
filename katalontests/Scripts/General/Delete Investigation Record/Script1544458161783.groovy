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

'Wait for the \'Confirmation\' box to appear'
WebUI.waitForElementClickable(findTestObject('General/Delete Record (Press Delete Button)/input_delete'), 7, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/input_delete'))

'Wait for the \'Confirmation\' box to appear'
WebUI.waitForElementVisible(findTestObject('General/Delete Record (Press Delete Button)/span_Please Confirm'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Verify Spinner is not present.'
WebUI.waitForElementNotPresent(findTestObject('Core Functionality/Shared Record Functions/loader'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

