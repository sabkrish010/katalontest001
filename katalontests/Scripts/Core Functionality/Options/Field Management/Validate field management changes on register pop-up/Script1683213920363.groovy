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

WebUI.callTestCase(findTestCase('General/Switch to Standard mode improvised'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Make a register field mandatory on Field Management page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/a_Add Address'))

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_Search All Fields'), 'Test')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/a_Create New Record'))

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Address Pop-Up(Save)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('General/Pop-Up/Validation Warning Message'), 2)

WebUI.scrollToElement(findTestObject('General/Pop-Up/Cancel(Pop-Up)'), 0)

WebUI.enhancedClick(findTestObject('General/Pop-Up/Cancel(Pop-Up)'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.enhancedClick(findTestObject('General/Pop-Up/Add Pop-Up_Close'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Pop-Up/Close(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Navigate to Field Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Field Management/Remove mandatoriness on a field'), [:], FailureHandling.STOP_ON_FAILURE)

