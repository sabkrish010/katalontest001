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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Assessment/Navigate to Assessment Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Assessment/Select Add Assessment (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

'Set the Security Classification to Official (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_SecurityClassification'), 
    'Official', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Assessment/input_Title'), 'The storm leans above the ear!')

WebUI.setText(findTestObject('Core Functionality/Registers/Assessment/textarea_Assessment Notes'), 'The genocide grinds the track into a peculiar paranoid. The desirable barrister sweeps in an epic. The havoc scratches on top of the cap. A chapel believes in the forecast. Why won\'t the dot rate the worth? A ruined trade quotes the derived phenomenon.ROXSDNM5G9')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Type'), 1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Subtype'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_Subtype'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Assessment/a_Select PerformedBy'))

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_ReviewAfter'), '3 Years', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Decision/Add Decision/select_RecordStatus'), 'Active', 
    true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Decision/Add Decision/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

