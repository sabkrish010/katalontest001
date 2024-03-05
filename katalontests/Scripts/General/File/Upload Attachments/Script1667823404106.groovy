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

WebUI.refresh()

WebUI.click(findTestObject('General/Attachments/a_URN link'))

WebUI.click(findTestObject('Core Functionality/Registers/Person/Edit Person/input_edit'))

WebUI.verifyElementPresent(findTestObject('General/Attachments/a_Upload Attachments'), 2)

CustomKeywords.'cluepackage.uploadattachments.uploadFile'(findTestObject('General/Attachments/a_Upload Attachments'), '\\\\clue-fs.clue.local\\Operational\\Testing\\Automated Testing\\Attachments\\2016 Telephone Billing.xlsx')

WebUI.waitForElementClickable(findTestObject('General/Attachments/td_2016 Telephone Billing'), 5)

WebUI.verifyElementPresent(findTestObject('General/Attachments/th_Caption'), 5)

WebUI.click(findTestObject('Core Functionality/Registers/Statement/Add Statement/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

