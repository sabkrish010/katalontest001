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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Navigate to notes register and validate page loading'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Notes/Select System View(New UI)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Notes/a_Edit(Notes)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/EnteredBy(Notes UI)'), 2)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Notes/Note Pop-Up/Type(Notes UI)'), 2)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Notes/Note Pop-Up/input_Reference(Notes UI)'), 
    RandomStringUtils.randomAlphabetic(10).toUpperCase())

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Notes/Note Pop-Up/textarea(Notes UI)'), RandomStringUtils.randomAlphabetic(
        10).toUpperCase())

not_run: Date todaysDate = new Date()

not_run: def screenFormattedDate = (todaysDate - 10).format('dd/MM/yyyy')

not_run: WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Notes/Note Pop-Up/DateTimeOfOccurrence(Notes UI)'), 
    screenFormattedDate)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Notes/Note Pop-Up/button_Save(Notes UI)'))

