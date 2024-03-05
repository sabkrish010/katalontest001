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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/a_Add Person'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/Add From HR Search(Person Pop-up)'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Surname'), 
    'jo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_goSelectLink'))

WebUI.delay(5)

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Surname'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Forename(s)'), 
    'mo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_goSelectLink'))

WebUI.delay(5)

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Forename(s)'), 
    'ma')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_goSelectLink'))

WebUI.delay(5)

WebUI.verifyTextPresent('Too many results', false)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Alert_OK btn'))

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Forename(s)'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Amazon Login'), 
    'bbbartel')

WebUI.delay(5)

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Forename(s)'), 
    'Bradford')

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Surname'), 
    'Bartell')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_goSelectLink'))

WebUI.delay(5)

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Surname'))

WebUI.clearText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Amazon Login'))

WebUI.setText(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_Forename(s)'), 
    'jo')

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_goSelectLink'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Next'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Previous'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Last'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_First'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/div_No of records(Add Pop-Up)'), 
    0)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Select'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/select_EU Policy(Add Pop-Up)'), 
    1)

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/input_personSave'))

WebUI.setText(findTestObject('General/LinkReason/LinkReason'), 'Test')

WebUI.click(findTestObject('General/LinkReason/Link_Save_btn'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Details'))

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

