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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - My Dashboard/a_Outcome'))

not_run: WebUI.navigateToUrl('https://test.clue.co.uk/league/Outcome/Index/0#search=66e17ea1-435b-47ea-b3c3-ac277c8c247a')

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Outcome/Navigate to Outcome register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Outcome Register/a_Add Outcome'))

Random rand1 = new Random()

def outcomeData = findTestData('OutcomeTestData')

int rowCount = outcomeData.getRowNumbers()

rowNum = (rand1.nextInt(rowCount - 1) + 1)

String outcomeTitle = outcomeData.getValue(2, rowNum)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/input_Title_Title'), 
    outcomeTitle)

//WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/input_Title_Title'), 
//  'Test Johnson')
WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/fieldset_Details                           _ba73f2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/select_1 Month1 Week2 Months2 Weeks3 Months_7506d5'), 
    '3 Years', true)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/input_on_save'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

