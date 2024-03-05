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
import groovy.time.TimeCategory as TimeCategory
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Add Investigator Note'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/a_Add Field Officer Note'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv.Notes)'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/EnteredBy(Inv.Notes)'), 
    1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Reference(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/SensitiveInformation(TIU -DoE Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Details(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv.Notes)'), 0, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Type(Inv Notes-Cluerelease)'), 
    1, FailureHandling.OPTIONAL)

SimpleDateFormat sdfStopTime = new SimpleDateFormat('hh:mm', Locale.ENGLISH)

System.out.println('Before: ' + sdfStopTime.getCalendar().getTime())

SimpleDateFormat futureTimeValue = sdfStopTime.getCalendar().add(Calendar.HOUR, 1)

System.out.println('After: ' + sdfStopTime.getCalendar().getTime().format('hh:mm'))

//WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/input_TimeOfOccurrence(Inv. Notes))'), 
//sdfStopTime.getCalendar().getTime().format('hh:mm'), FailureHandling.OPTIONAL)
WebUI.clearText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/input_TimeOfOccurrence(Inv. Notes)'))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/input_TimeOfOccurrence(Inv. Notes)'), 
    sdfStopTime.getCalendar().getTime().format('hh:mm'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/button_Add'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Future Time value warning(inv. Notes)'), 
    3)

WebUI.delay(5)

