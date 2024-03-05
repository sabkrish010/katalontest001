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

WebUI.click(findTestObject('General/Links/a_Add Communication'))

WebUI.callTestCase(findTestCase('General/Create new record via pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication Pop-Up/select_Type'), 
    'Email Address', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_RecordStatus'), 
    'Active', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Communication/Add Communication Pop-Up/input_NumberOrAddress'), 
    'rogersj@yahoo.com')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_ServiceProvider'), 
    'Virgin Media', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_ReviewPeriod'), 
    '3 Months', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Communication/Add Communication/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'), 0)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/OwnerTeam(Incident Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'),30)
WebUI.executeJavaScript("click()")*/
WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'))

WebUI.delay(2)

WebUI.click(findTestObject('General/LinkReason/Linkreason_expand'))

WebUI.setText(findTestObject('General/LinkReason/LinkReason'), 'Test')

WebUI.click(findTestObject('General/LinkReason/Link_Save_btn'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.delay(3)

