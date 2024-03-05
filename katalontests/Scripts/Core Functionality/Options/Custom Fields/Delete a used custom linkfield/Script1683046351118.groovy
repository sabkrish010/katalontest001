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

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Navigate to Custom Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Address', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/td_ReviewedBy _Link'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/Delete Confirm(Used Customfield)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Alert_Close'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Address', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Link', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/Linkfield_Register'), 'Person', 
    false)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Person linkfield')

//WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'),RandomStringUtils.randomAlphabetic(8).toUpperCase())
WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'ReviewedBy _Link')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Conditional Custom Fields/input Conditional Custom field - Save'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/URN_hyperlink'))

not_run: WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Core Functionality/Options/Custom Fields/CustomFields_Section'), 2)

WebUI.scrollToElement(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/ReviewedBy_Link(custom linkfield)'), 
    1)

WebUI.enhancedClick(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/ReviewedBy_Link(custom linkfield)'))

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/input_Go(Pop-Up)'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Person/Person pop-up/input_Go(Pop-Up)'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Person/Person pop-up/Select Person(Pop-Up)'), 
    15)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Person/Person pop-up/Select Person(Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Navigate to Custom Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4, FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Address', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/td_ReviewedBy _Link'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/Delete Confirm(Used Customfield)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'), FailureHandling.OPTIONAL)

