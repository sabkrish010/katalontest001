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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Standard mode improvised'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Navigate to Custom Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Address', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Drop down Custom Field')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Dropdown_Custom')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Options/Custom Fields/Dropdown Custom/td_Dropdown'), 15)

WebUI.enhancedClick(findTestObject('Core Functionality/Options/Custom Fields/Dropdown Custom/td_Dropdown'))

/*WebDriver driver = DriverFactory.getWebDriver();
WebElement td_Dropdown = driver.find_elements_by_xpath("//*[contains(text(), 'Dropdown_Custom')]")
td_Dropdown.click();
*/
WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Dropdown Custom/td_Dropdown'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Order Custom field'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Options/Custom Fields/Dropdown Custom/td_Dropdown'), 2)

WebUI.enhancedClick(findTestObject('Core Functionality/Options/Custom Fields/Dropdown Custom/td_Dropdown'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'), 
    10)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/a_Delete'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Delete Custom Fields/button_OK'))

