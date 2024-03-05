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

'Select the Field drop-down'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterField'), 
    'Stages', true)

'Select the Operator'
WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/Filter/Add Filters/select_FilterOperator'), 
    'Contains', true)

'Enter a filter term'
WebUI.setText(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_FilterValue'), 'test')

'Press Go'
WebUI.click(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_go'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_searchTerm'), 
    5)

