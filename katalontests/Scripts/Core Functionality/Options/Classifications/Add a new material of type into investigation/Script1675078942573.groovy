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

WebUI.callTestCase(findTestCase('Core Functionality/Options/Classifications/Select a register for classification as material'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), [:], FailureHandling.STOP_ON_FAILURE)

'Type a Search term'
WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'skies')

'Press Go button'
WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'), FailureHandling.STOP_ON_FAILURE)

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 
    7)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/URNLink(Inv)'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Communication/Navigate to Communication register'), [:], FailureHandling.STOP_ON_FAILURE)

'Press Add Communication'
WebUI.click(findTestObject('Core Functionality/Registers/Communication/Select Add Communication (Standard Mode)/a_Add Communication'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/a_Create New Record'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Communication/Add Communication'), [:], FailureHandling.STOP_ON_FAILURE)

def title = WebUI.getText(findTestObject('Core Functionality/Registers/Case/CommunicationTitle'))

System.out.println(title)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/a_Summary'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Navigate to Case register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Case/SelectCaseRecord(Inv)'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Sync(case)'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/SyncAlert_OK'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/span_Close(sync)'), FailureHandling.OPTIONAL)

WebUI.refresh()

not_run: WebUI.verifyTextPresent(title, false)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Communication/Navigate to Communication register'), [:], FailureHandling.STOP_ON_FAILURE)

'Type a Search term'
WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'rogersj')

'Press Go button'
WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'), FailureHandling.STOP_ON_FAILURE)

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 
    7)

WebUI.click(findTestObject('Core Functionality/Registers/Communication/CommsURN(Inv)'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Classifications/Remove existing classificaion type value and save'), 
    [:], FailureHandling.STOP_ON_FAILURE)

