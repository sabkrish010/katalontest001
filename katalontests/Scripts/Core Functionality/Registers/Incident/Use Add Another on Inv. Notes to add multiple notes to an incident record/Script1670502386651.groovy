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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Add Investigator Note'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Add Field Officer Note'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Add Diary Of Events'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Notes/a_Add Note'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv Notes-Cluerelease)'), 
    2, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv.Notes)'), 2, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/EnteredBy(Inv.Notes)'), 
    2, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/SensitiveInformation(TIU -DoE Pop-Up)'), 
    2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Reference(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Details(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/AddAnother(Inv. Notes)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/EnteredBy(Inv.Notes)'), 
    1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Reference(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv Notes-Cluerelease)'), 
    2, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv.Notes)'), 1, 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Details(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/button_Add'))

not_run: WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_on_saveandcontinue'), 
    15)

not_run: WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_on_saveandcontinue'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Staff/Edit Staff/input_save'), 0)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Staff/Edit Staff/input_save'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('General/Edit Button(Record)'), 4)

WebUI.click(findTestObject('General/Edit Button(Record)'))

//WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Organisation/Edit Organisation/input_edit'))
WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Delete'))

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_on_saveandcontinue'), 5)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_on_saveandcontinue'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Delete'), 15)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_on_saveandcontinue'), 5)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

