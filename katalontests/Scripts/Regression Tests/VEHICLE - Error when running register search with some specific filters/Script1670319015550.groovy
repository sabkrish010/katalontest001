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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Vehicle/Navigate to Vehicle Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Search and Advanced Options/Expand Advanced Options/i_Advanced Options_fas fa-plus'))

WebUI.selectOptionByValue(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterField'), 
    'Vehicle Class', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Vehicle/VesselClass Dropdown'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Press Go button'
WebUI.click(findTestObject('Register Search and Advanced Options/Go Button'), FailureHandling.STOP_ON_FAILURE)

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 
    7)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterField'), 
    'Vessel Class', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Vehicle/VesselClass Dropdown'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Press Go button'
WebUI.click(findTestObject('Register Search and Advanced Options/Go Button'), FailureHandling.STOP_ON_FAILURE)

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 
    7)

