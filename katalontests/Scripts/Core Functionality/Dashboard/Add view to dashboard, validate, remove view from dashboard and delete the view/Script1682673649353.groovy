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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

'Select System View'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Enter Register Search Term/select_ViewsDropDown'), 
    'TestView1', true, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Register Search and Advanced Options/View/Delete(view)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Register Search and Advanced Options/View/button_OK(view)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Filter Expand'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Add a view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

'Select System View'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Enter Register Search Term/select_ViewsDropDown'), 
    'TestView1', true)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Register Search and Advanced Options/View/Show on Dashboard'))

WebUI.click(findTestObject('Register Search and Advanced Options/View/button_Save'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/View/button_OK(view)'), 0)

WebUI.enhancedClick(findTestObject('Register Search and Advanced Options/View/button_OK(view)'))

WebUI.callTestCase(findTestCase('Core Functionality/Dashboard/Navigate to Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Register Search and Advanced Options/View/h3_TestView1'), 3)

WebUI.scrollToElement(findTestObject('Register Search and Advanced Options/View/h3_TestView1'), 0)

WebUI.click(findTestObject('General/Dashboard/View Hyperlink'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Delete the view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

