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

WebUI.waitForElementClickable(findTestObject('General/Print - Append files'), 20)

WebUI.enhancedClick(findTestObject('General/Print - Append files'))

WebUI.waitForElementClickable(findTestObject('General/Print/AppendAll'), 20)

WebUI.check(findTestObject('General/Print/AppendAll'))

WebUI.callTestCase(findTestCase('General/Check SaveToReportHistory check-box'), [:], FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/General/Print/Ok button (print pop-up)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/File/Close preview modal'), [:], FailureHandling.OPTIONAL)

