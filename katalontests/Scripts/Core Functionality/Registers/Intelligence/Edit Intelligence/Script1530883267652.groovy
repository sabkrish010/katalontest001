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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_edit'))

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/input_OperationNameNumber'), 
    'Tip-off on gate crashing on match day')

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/input_ReportTitle'), 
    'Gate crash planned')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_SourceEvaluation'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_IntelligenceAssessment'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_HandlingCode'), 
    'P', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/textarea_edit inline-child'), 
    'Potential plan of gate crashing on event day by causing ruckus at the entrance')

'Remove the first Intelligence Text Entry'
WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/a_Remove'))

WebUI.waitForElementVisible(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/button_OK'), 
    3)

'Okay the confirmation message'
WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/button_OK'))

WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/a_Add Intelligence Entry'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_SourceEvaluation'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_IntelligenceAssessment'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/select_HandlingCode'), 
    'P', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Intelligence/Add Intelligence/textarea_edit inline-child'), 
    'Suspicious looking individual')

WebUI.click(findTestObject('Core Functionality/Registers/Intelligence/Edit Intelligence/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

