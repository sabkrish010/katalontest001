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

WebUI.callTestCase(findTestCase('Redaction/Check if task type PII Redaction is available for selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Redaction/Subject_FieldLabel'), 0, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), 'Notes test')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type'), 'PII Redaction', 
    false)

WebUI.scrollToElement(findTestObject('Redaction/Redaction_Section'), 3)

WebUI.verifyElementPresent(findTestObject('Redaction/Subject_FieldLabel'), 0)

//subject = WebUI.getText(findTestObject('Object Repository/Redaction/a_subjectLink'), FailureHandling.STOP_ON_FAILURE)

subject = WebUI.getText(findTestObject('Object Repository/Redaction/a_subjectLink'))

System.out.println(subject)

