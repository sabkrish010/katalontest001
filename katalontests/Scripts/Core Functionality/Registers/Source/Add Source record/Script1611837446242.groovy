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

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_RecordType'), 'Person', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Category'), 'IS', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Title'), 'Mr', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Surname'), 'Bloggs')

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Forename(s)'), 'Joe')

'THIS NEEDS CHANGING SO THAT IT USES A SENSIBLE DATE'
not_run: WebUI.sendKeys(findTestObject('Core Functionality/Registers/Source/Add Source/input_Date of Birth'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Place of Birth'), 'Place of birth added', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Gender'), 'Male', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_ICCode'), '7 Other', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Ethnicity'), 'Not Stated', 
    true)

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_PNC ID'), '2021/9999999X')

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_CRO Number'), '200678/12F', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Religion'), 'Atheist', true, 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/textarea_Further Details'), 'Further details added')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_Nationality'), 'Unknown', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Occupation'), 'Occupation added')

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Reason for Nominal'), 'Reason for Nominal Added')

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/input_Source'), 'Source Added')

WebUI.setText(findTestObject('Core Functionality/Registers/Source/Add Source/textarea_Notes'), 'Notes Added')

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Intelligence Source Management', 
    true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Source/Add Source/select_ReviewPeriod'), '1 Month', 
    false)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

