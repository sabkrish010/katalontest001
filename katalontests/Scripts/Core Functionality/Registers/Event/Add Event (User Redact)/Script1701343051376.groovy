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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Edit Event/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_Type'), 'Surveillance Log Paul', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_Subtype'), 'Incoming', true)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Event/Add Event/input_at_TimeOccurred'), Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Event/Add Event/input_at_TimeOccurred'), Keys.chord(Keys.NUMPAD4))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Event/Add Event/input_at_TimeOccurred'), Keys.chord(Keys.SEMICOLON))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Event/Add Event/input_at_TimeOccurred'), Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Event/Add Event/input_at_TimeOccurred'), Keys.chord(Keys.NUMPAD0))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_Officer'), 'Kat Alon', true, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Event/Add Event/input_Title'), ((GlobalVariable.NewUser + ' ') + 
    GlobalVariable.NewFirstName) + ' private Event', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Event/Add Event/textarea_Notes'), ((GlobalVariable.NewUser + 
    ' ') + GlobalVariable.NewFirstName) + ' notes')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_Team'), 'Redact', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_ReviewPeriod'), '3 Months', 
    true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Redact', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_RecordStatus'), 'Active', 
    true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
not_run: WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

not_run: WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Event/Add Event/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Event/Add Event/input_save'))

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Event/Event Details/h2_Event Details'), FailureHandling.OPTIONAL)

