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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.apache.pdfbox.text.PDFTextStripper as PDFTextStripper
import org.apache.pdfbox.pdmodel.PDDocument as PDDocument
import java.io.File as File
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.apache.pdfbox.Loader as Loader
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.pdfbox.pdmodel.PDDocumentCatalog as PDDocumentCatalog
import org.apache.pdfbox.pdmodel.PDDocumentInformation as PDDocumentInformation
import org.apache.pdfbox.pdmodel.common.PDMetadata as PDMetadata
import java.io.BufferedInputStream as BufferedInputStream
import java.io.IOException as IOException
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import org.apache.pdfbox.cos.COSDocument as COSDocument
import org.apache.pdfbox.pdfparser.PDFParser as PDFParser
import org.openqa.selenium.By as By
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.testng.annotations.AfterClass as AfterClass
import org.testng.annotations.BeforeClass as BeforeClass
import org.testng.annotations.Test as Test
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.CapabilityType as CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Investigation/Investigation Dropdown'), 'Wildfire', 
    false)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Material/Navigate to Material Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Material/Add material(Exhibit)'), [:], FailureHandling.STOP_ON_FAILURE)

value = WebUI.getText(findTestObject('Object Repository/General/Inv,Number(Record)'))

System.out.println(value)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Load summary page in investigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Case/a_Case Links(Inv. Summary page)'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Sync Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/Filters_plus(CaseClas.)'))

'Enter a filter term'
WebUI.setText(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_FilterValue'), 'Izer')

'Press Go'
WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/button_Go(CaseClas.)'))

'Wait for the \'Search this Register\' box to be available again'
WebUI.waitForElementClickable(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_searchTerm'), 
    5)

WebUI.click(findTestObject('Case and Disclosure/Exhibit/Classification/span_TBC_1'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Exhibit/Classification/select_TBC_Clasification'), 'Unused - Non-Sensitive - Assists or Undermines', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Schedules/Description_and_Relevance(Case Classification)'), 
    'Test')

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Schedules/Reasons_Why_AssistsUndermines(Case Classification)'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Exhibit/Classification/select_Document_Type'), 'MG 12 - Exhibit List', 
    false)

WebUI.setText(findTestObject('Case and Disclosure/Exhibit/Classification/input_DocumentName'), 'Exhibit')

WebUI.click(findTestObject('Case and Disclosure/Exhibit/Classification/btn_submit_TBC'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Case/Schedules/select_ScheduleDropDown'), 'MG6C Unused non-sensitive', 
    false)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/GenerateButton'))

WebUI.uncheck(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/Continuation_checkbox'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Preview'))

//WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('General/Switch to Investigation Mode'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Investigation/Investigation Dropdown'), 'Wildfire', 
//    false)
//
//WebUI.click(findTestObject('Core Functionality/Registers/Case/a_Case Links(Inv. Summary page)'))
//
//WebUI.selectOptionByLabel(findTestObject('Core Functionality/Registers/Case/Schedules/select_ScheduleDropDown'), 'MG6C Unused non-sensitive', 
//    false)
//
//WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/GenerateButton'))
//
//WebUI.uncheck(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/Continuation_checkbox'))
//
//WebUI.click(findTestObject('Core Functionality/Registers/Case/Ordering(Case Witness List)/button_Preview'))
//
//not_run: WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/Download_Btn(Preview)'))
WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('Core Functionality/Registers/Case/Schedules/iframe_MG6C Unused non-sensitive_webviewer-1'), 
    20)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Case/Schedules/SearchButton(preview window)'), 60)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Schedules/SearchButton(preview window)'))

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Case/Schedules/SearchBox(Preview Modal)'))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Schedules/SearchBox(Preview Modal)'), 'WK1M9P5SQ8')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Schedules/SearchBox(Preview Modal)'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Core Functionality/Registers/Case/Schedules/result_row'), 'WK1M9P5SQ8', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Schedules/clearSearch(Preview Modal)'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Schedules/SearchBox(Preview Modal)'), value)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Schedules/SearchBox(Preview Modal)'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Core Functionality/Registers/Case/Schedules/result_row1'), value, FailureHandling.STOP_ON_FAILURE)

