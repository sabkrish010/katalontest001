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

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Notes/select_View Dropdown(Notes)'), 'System View', 
    false, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Notes/select_View Dropdown(Notes)'), 'Test1', false, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Notes/Settings(New View)'))

WebUI.check(findTestObject('Core Functionality/Registers/Notes/SetAsDefaultView(New UI)'))

WebUI.uncheck(findTestObject('Core Functionality/Registers/Notes/SetAsDefaultView(New UI)'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/View_Delete(New UI)'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Confirm_Delete(New UI)'))

