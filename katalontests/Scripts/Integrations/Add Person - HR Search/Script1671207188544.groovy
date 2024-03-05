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

'Open the Web Browser'
WebUI.openBrowser('https://test.clue.co.uk/amazon-training')

WebUI.waitForPageLoad(5)

'Enter a Username'
WebUI.setText(findTestObject('General/Log On/txt_Username'), 'bererik')

'Enter a Password'
WebUI.setText(findTestObject('General/Log On/txt_Password'), 'nimda_68442', FailureHandling.STOP_ON_FAILURE)

'Press the Log On button'
WebUI.click(findTestObject('General/Log On/btn-submit'))

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Select Add Person (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Add Person_HRSearch'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/span_Person Search'), 
    0)

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Surname'), 'jo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Go Btn'))

WebUI.delay(5)

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Surname'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Forename(s)'), 'mo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Go Btn'))

WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/a_Next'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/a_Previous'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/a_Last'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/a_First'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/div_No. of records'), 
    0)

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Forename(s)'), 'ma')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Go Btn'))

WebUI.delay(5)

WebUI.verifyTextPresent('Too many results', false)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Alert_OK btn'))

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Forename(s)'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Amazon Login'), 'bbbartel')

WebUI.delay(5)

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Forename(s)'), 'Bradford')

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Surname'), 'Bartell')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Go Btn'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Page_Clue - Add Person/div_No. of records'), 
    3)

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Surname'))

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Amazon Login'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Forename(s)'), 'jo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/input_Go Btn'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/a_Select'))

WebUI.delay(5)

value = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Integrations/HR Integration(Amazon)/Page_Clue - Add Person/input_Reference'), 
    'value')

System.out.println(value)

if (value == '') {
    throw new Exception('Empty value found')
}

value1 = WebUI.getAttribute(findTestObject('Object Repository/Core Functionality/Integrations/HR Integration(Amazon)/Page_Clue - Add Person/input_Surname'), 
    'value')

System.out.println(value1)

if (value1 == '') {
    throw new Exception('Empty value found')
}

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Page_Clue - Add Person/EU Data Policy'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Page_Clue - Add Person/input_on_save'))

WebUI.delay(5)

WebUI.verifyTextPresent(value1, false)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

