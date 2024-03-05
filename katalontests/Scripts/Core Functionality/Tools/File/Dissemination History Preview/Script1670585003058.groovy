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

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Intelligence/Navigate to Intelligence register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Filter Expand'), [:], FailureHandling.STOP_ON_FAILURE)

'Select the Field drop-down'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterField'), 
    'Version', true)

'Select the Operator'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterOperator'), 
    'Contains', true)

'Enter a filter term'
WebUI.setText(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_FilterValue'), 'Copy')

'Press Go'
WebUI.click(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_go'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_searchTerm'), 
    5)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/IntelligenceURN Hyperlink'))

WebUI.click(findTestObject('Object Repository/Page_Clue - Intelligence Details/a_Report PDF'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/File/Preview Modal/Download_Btn(Preview)'), 3)

