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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Random random = new Random()

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Staff/Navigate to Staff register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Staff/Edit Staff/input_edit'))

def referalNotesData = findTestData('null')

int referalNotesCount = referalNotesData.getRowNumbers()

def referalNotesRowNum = random.nextInt(referalNotesCount - 1) + 1

String referalNoteValue = referalNotesData.getValue(1, referalNotesRowNum)

WebUI.setText(findTestObject('Page_Clue - Edit Staff/Referral Notes Custom Field'), referalNoteValue)

def countryListData = findTestData('null')

int countryListCount = countryListData.getRowNumbers()

def countryListRowNum = random.nextInt(countryListCount - 1) + 1

String countryListValue = countryListData.getValue(1, countryListRowNum)

WebUI.selectOptionByValue(findTestObject('Page_Clue - Edit Staff/Country List Custom Field'), countryListValue, true)

WebUI.click(findTestObject('Core Functionality/Registers/Staff/Edit Staff/input_save'))

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Clue - Staff Details/Length Of Service'), '10 years')

not_run: WebUI.setText(findTestObject('Page_Clue - Staff Details/Date Verified'), 'Tom test')

