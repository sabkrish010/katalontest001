import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement 
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory



WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Address/Navigate to Address Register/a_Registers'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/a_Notes'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Columns(New View)'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Add Another Column btn(New View)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Notes/Column Field(New View)'), 'CreatedBy', false)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Notes/Columns_Save(New UI)'))

WebUI.setText(findTestObject('Core Functionality/Registers/Notes/ViewName(New UI)'), 'Test1')

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Filters(New View)'))

WebUI.click(findTestObject('Core Functionality/Registers/Notes/Save(New View)'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Delete a view(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

