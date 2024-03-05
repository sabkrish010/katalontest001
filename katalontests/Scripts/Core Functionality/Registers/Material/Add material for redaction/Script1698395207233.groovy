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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Material/Navigate to Material Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Material Register/a_Add Exhibit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/select_CashDrugsElectronicsStewartWeapons'), 
    'Cash', true)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Title_Title'), 
    'Rowen Heraldsun money fraud')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/textarea_Description_Notes'), 
    'Rowen Heraldsun erroneous accounting practices')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Reference_Reference'), 
    'Rowen Heraldsun')

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/ul_Type                                    _22fe06'))

//WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_When Found_WhenFoundDate'))
Date todaysDate = new Date()

//Past Date from calendar//
def pastDate = (todaysDate - 7).format('dd/MM/yyyy')

System.out.println(pastDate)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_When Found_WhenFoundDate'), 
    pastDate)

//WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_26'))
WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD8))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.SEMICOLON))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_Select Location'))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Search All Fields_goSelectLink'))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/td_12, Crest Hill, London'))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_Select Location_1'))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Search All Fields_goSelectLink'))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/td_21, Strackley Hill, Ketley Bank, London,_d09bf4'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/select_Intelligence Source ManagementRedact'), 
    'Redact', true)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_on_save'))

