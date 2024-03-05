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

if (WebUI.verifyElementPresent(findTestObject('Object Repository/General/Switch Mode/a_Switch to Standard Mode'), 1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/General/Switch Mode/a_Switch to Standard Mode'))
}

WebUI.callTestCase(findTestCase('Core Functionality/Options/Menus/Navigate to Menus'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Menus/Menu DropDown'), 'Incident: Type', false)

WebUI.delay(3)

WebUI.click(findTestObject('Core Functionality/Options/Menus/Add(MenuItem)'))


WebUI.setText(findTestObject('Core Functionality/Options/Menus/input_MenuItem'), 'MenuItem')

def menuItem = WebUI.getAttribute(findTestObject('Core Functionality/Options/Menus/input_MenuItem'),'value')

System.out.println(menuItem)

WebUI.click(findTestObject('Core Functionality/Options/Menus/OK(MenuItem)'))

WebUI.click(findTestObject('Core Functionality/Options/Menus/Menu Item'))

WebUI.click(findTestObject('Core Functionality/Options/Menus/Remove(MenuItem)'))

WebUI.click(findTestObject('Core Functionality/Options/Menus/Save(MenuItem)'))

WebUI.verifyTextNotPresent(menuItem, true)

