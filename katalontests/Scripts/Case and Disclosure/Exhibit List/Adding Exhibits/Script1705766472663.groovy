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

not_run: WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Add Exhibit'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Exhibit/select_Type'), 'Cash', false)

mydate = new Date()

formattedDate = mydate.format('dd')

dateHour = mydate.format('HHmmss')

WebUI.setText(findTestObject('Case and Disclosure/Exhibit/input_Title_Title'), ('Cash found -' + formattedDate) + dateHour)

WebUI.setText(findTestObject('Case and Disclosure/Exhibit/Input_Description'), ('Amount of cash found at seen -' + formattedDate) + 
    dateHour)

WebUI.setText(findTestObject('Case and Disclosure/Exhibit/input_Reference'), 'INC/' + dateHour)

WebUI.setText(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundDate'), '02/01/2024')

WebUI.sendKeys(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundTime'), Keys.chord(Keys.NUMPAD1))

WebUI.sendKeys(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundTime'), Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundTime'), Keys.chord(Keys.SEMICOLON))

WebUI.sendKeys(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundTime'), Keys.chord(Keys.NUMPAD1))

WebUI.sendKeys(findTestObject('Case and Disclosure/Exhibit/input_WhenFoundTime'), Keys.chord(Keys.NUMPAD5))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Select Location_1'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Select_Address_1'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Select Location_2'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Select_Address_2'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/btn_Save'))

