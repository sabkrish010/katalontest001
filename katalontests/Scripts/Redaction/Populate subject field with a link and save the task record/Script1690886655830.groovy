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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testdata.DBData as DBData

WebUI.callTestCase(findTestCase('Redaction/Check if task type PII Redaction is available for selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Redaction/Subject_FieldLabel'), 0, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), 'Notes test')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type'), 'PII Redaction', 
    false)

WebUI.scrollToElement(findTestObject('Redaction/Redaction_Section'), 3)

WebUI.verifyElementPresent(findTestObject('Redaction/Subject_FieldLabel'), 0)

WebUI.click(findTestObject('Core Functionality/Registers/Task/Add New Task record/Subject(Task Record)'))

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

not_run: WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'))

WebUI.delay(2)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Forename(subject)'), 
    'Matt')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/textarea_Notes'), 'Test')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname_Subject'), 'Vane-Tempest-Stewart', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname(RedactSubject)'), 
    'Vane-Tempest-Stewart', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_Type'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_OwnerTeam'), 
    'Intelligence Source Management', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'))

WebUI.click(findTestObject('General/AccountProfile/span_loggedinuser'))

def user = WebUI.getAttribute(findTestObject('General/AccountProfile/FullName(AccountProfile)'), 'value')

WebUI.click(findTestObject('General/AccountProfile/Cancel(AccountProfile)'))

System.out.println(user)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_AllocatedTo'), user, 
    false, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'In Progress', 
    false)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

subject = WebUI.getText(findTestObject('Object Repository/Redaction/a_subjectLink'))

System.out.println(subject)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Redaction/Verify searchValues on Results pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

def search = WebUI.getText(findTestObject('Object Repository/Redaction/span_Subject'))

System.out.println(search)

splitText = (search.split(',')[2]).trim()

System.out.println(splitText)

System.out.println(subject)

WebUI.verifyMatch(splitText, subject, false)

