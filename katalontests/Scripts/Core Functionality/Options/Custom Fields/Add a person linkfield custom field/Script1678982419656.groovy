import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Navigate to Custom Fields'), [:], FailureHandling.STOP_ON_FAILURE)

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
WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Reviewed By')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/td_Link'))

WebUI.scrollToElement(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'), 0)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/button_OK'))

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

