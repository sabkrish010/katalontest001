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

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Type'), 
    'Initiated By Incident', false, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/input_Title'), (('Outcome of ' + GlobalVariable.NewUser) + 
    ' ') + GlobalVariable.NewFirstName)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/select_Type'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/select_SubType'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/select_ReviewAfter'), '3 Years', 
    true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/select_RecordStatus'), 'Active', 
    false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Outcome/Add Outcome/select_ReviewAfter'), '1 Year', 
    false)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Outcome/Add Outcome/Page_Clue - Add Outcome/input_on_save'))

