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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Select Add Address (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Add Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/File/Upload file'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Details_Hyperlink'))

filename = WebUI.getText(findTestObject('Object Repository/Core Functionality/Registers/File/div_Title'))

System.out.println(filename)

//def filename1 = 'Animal Welfare.pdf'
WebUI.click(findTestObject('General/Details_Hyperlink'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

/*url = WebUI.getUrl()

System.out.println(url)

index = url.indexOf('Details')

partial_url = url.substring(0, index)

System.out.println(partial_url)

WebUI.navigateToUrl(partial_url)

WebUI.getUrl()*/
WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), filename)

'Press Go button'
WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Register Search and Advanced Options/AttachmentLink'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Details'), 0)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Details'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Preview'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Properties'))

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'))

WebUI.click(findTestObject('General/URN SearchResults'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

