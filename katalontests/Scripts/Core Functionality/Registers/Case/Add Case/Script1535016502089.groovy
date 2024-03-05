import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Set the Security Classification to Official (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Case/Add Case/select_SecurityClassification'), 'Official', 
    true, FailureHandling.OPTIONAL)

'Set the Case Type to Criminal'
WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Case/Add Case/select_CaseType'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

'Set the Status to Open'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Case/Add Case/select_Status'), 'Open', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case/input_Reference'), 'PTA/2018/01234/B1', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case/input_OtherReference'), 'QB/2018/0123')

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case/textarea_Summary'), 'Case summaries are documents written to outline the decisions made in a court of justice. In the summary, key points and aspects about the case are jotted down to help keep a reference and to enhance understanding a court’s order. The templates are significant in simplifying the case narrations for anyone to comprehend. A case summary always has a citation as the heading which indicates the parties involved, the date of processing the event in court, the place the decision over the case was made and sometimes reference sources such as the internet. ')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Add Case/input_StartDate'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Add Case/input_CloseDate'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Case/Add Case/select_ReviewAfter'), '3 Months', true)

'Save the Case record'
WebUI.click(findTestObject('Core Functionality/Registers/Case/Add Case/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Case/h2_Case Details'), FailureHandling.STOP_ON_FAILURE)

