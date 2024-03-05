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

WebUI.callTestCase(findTestCase('Core Functionality/Options/Audit/Navigate to Audit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

'Press Go'
WebUI.click(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_go'))

WebUI.click(findTestObject('Core Functionality/Options/Audit/button_Export'))

WebUI.click(findTestObject('Core Functionality/Options/Audit/button_OK(confirm export)'))

WebUI.refresh()

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Audit/Apply Audit Filter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Search and Advanced Options/View/Save new view btn(View)'))

WebUI.setText(findTestObject('Register Search and Advanced Options/View/View Name'), 'Audit View')

WebUI.click(findTestObject('Register Search and Advanced Options/View/Save(Save View Popup)'))

WebUI.click(findTestObject('Core Functionality/Options/Audit/button_Export'))

WebUI.click(findTestObject('Core Functionality/Options/Audit/button_OK(confirm export)'))

WebUI.refresh()

'Select System View'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Enter Register Search Term/select_ViewsDropDown'), 
    'System View', true)

'Select System View'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Enter Register Search Term/select_ViewsDropDown'), 
    'Audit View', true)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Search and Advanced Options/View/Delete(view)'))

WebUI.click(findTestObject('Register Search and Advanced Options/View/button_OK(view)'))

WebUI.delay(2)

