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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Information/Add Information/select_Information'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Information/Add Information/input_Reference'), 'Reference')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Information/Add Information/input_Date Reported'), Keys.chord(
        Keys.ENTER))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Information/Add Information/input_Date Occurred'), Keys.chord(
        Keys.ENTER))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Information/Add Information/input_Until_Until'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Core Functionality/Registers/Information/Add Information/input_Title'), 'Title added')

WebUI.setText(findTestObject('Core Functionality/Registers/Information/Add Information/textarea_Information_Info'), 'Information added')

WebUI.setText(findTestObject('Core Functionality/Registers/Information/Add Information/textarea_Provenance'), 'Provenance added')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Information/Add Information/select_ReviewPeriod'), 
    '1 Month', true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 'Intelligence Source Management', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Information/Add Information/input_on_save'))

