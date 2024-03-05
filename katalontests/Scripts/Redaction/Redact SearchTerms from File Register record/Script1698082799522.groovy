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

WebUI.callTestCase(findTestCase('Core Functionality/Tools/File/Add File record for redaction'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/File/a_Add File'))

WebUI.click(findTestObject('Core Functionality/Registers/File/input_Search All Fields_goSelectLink'))

WebUI.click(findTestObject('Core Functionality/Registers/File/td_5336'))

WebUI.click(findTestObject('Core Functionality/Registers/File/input_submit_Add_File_Task'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/span_Redact_PopUp_Close_Button'))

WebUI.refresh()

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 2)

WebUI.click(findTestObject('Redaction/span_Redact_PopUp_Close_Button'))

WebUI.refresh()

WebUI.click(findTestObject('Redaction/a_Review Redaction record search results'))

WebUI.click(findTestObject('Redaction/button_Redact'))

WebUI.click(findTestObject('Redaction/button_Redact_Confirm'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 2)

WebUI.click(findTestObject('Redaction/span_Redact_PopUp_Close_Button'))

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'Complete', 
    false)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Quick Search/input_QuickSearch'), 'Vax Brown')

WebUI.verifyElementNotPresent(findTestObject('General/Quick Search/QuickSearch(Results)'), 1)

WebUI.callTestCase(findTestCase('Core Functionality/Research/Global Search/Navigate to Global Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_searchTerm(GlobalSearch)'), 'Vax Brown')

WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/button_Go'), 3)

WebUI.click(findTestObject('Core Functionality/Research/Global Search/button_Go'), FailureHandling.STOP_ON_FAILURE)

//uncomment after Rich's ES fix
WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/span_No results found(GS)'), 2, 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Space ship')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Quick Search/input_QuickSearch'), 'Space ship')

WebUI.verifyElementNotPresent(findTestObject('General/Quick Search/QuickSearch(Results)'), 2)

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

