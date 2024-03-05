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

WebUI.callTestCase(findTestCase('Core Functionality/Options/User Management/Navigate to User Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Options/User Management/Permission Groups/Permission Groups_expand'))

WebUI.scrollToElement(findTestObject('Core Functionality/Options/User Management/Permission Groups/Permissions Group'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Options/User Management/Permission Groups/a_Edit(permissions group)'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Core Functionality/Options/User Management/Page_Clue - User Management/Classification Management'), 
    0)

WebUI.enhancedClick(findTestObject('Core Functionality/Options/User Management/Permission Groups/Classification Management(all permissions check-box)'))

WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Options/User Management/Permission Groups/Save(Permissions Group)'))

WebUI.callTestCase(findTestCase('Core Functionality/Options/Classifications/Navigate to Classifications'), [:], FailureHandling.STOP_ON_FAILURE)

