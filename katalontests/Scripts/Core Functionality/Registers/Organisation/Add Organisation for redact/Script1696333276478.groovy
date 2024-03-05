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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Organisation/Navigate to Organisation register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Organisation/Select Add Organisation (Standard Mode)'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/select_SecurityClassification'), 
    'Official Sensitive', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/select_Type'), 
    'Private Limited Company', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_Reference'), 
    'Strackley')

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_Name'), 
    'Strackley Technologies')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_DateOfIncorporation'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_Reason'), 
    'Tax Evasion')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/select_RecordStatus'), 
    'Active', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_Source'), 
    'HMRC')

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_RegistrationNumber'), 
    '012/89/AHX')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_DateAccountsLastSubmitte'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_CivilLitigation'), 
    'Tax Evasion')

WebUI.setText(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/textarea_Notes'), 
    'Monstrous')

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/select_Status'), 
    'Active', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Organisation/Add Organisation/Page_Clue - Add Organisation/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Organisation/Organisation Details/h2_Organisation Details'), 
    FailureHandling.STOP_ON_FAILURE)

