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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Add Incident for redaction'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Redaction/Check if task type PII Redaction is available for selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), 'The successive west vanishes inside the bog. Can the rear sound the owner? An elite opera progresses. The immortal disconnects an erroneous surgery without any variant.')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type1'), 'PII Redaction', 
    false)

WebUI.clearText(findTestObject('Core Functionality/Registers/Task/Edit Task Record/input_Title(Task)'))

WebUI.click(findTestObject('General/AccountProfile/span_loggedinuser'))

def user = WebUI.getAttribute(findTestObject('General/AccountProfile/FullName(AccountProfile)'), 'value')

WebUI.click(findTestObject('General/AccountProfile/Cancel(AccountProfile)'))

System.out.println(user)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_AllocatedTo1'), user, 
    false, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'In Progress', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Edit Task Record/input_Title(Task)'), 'Matt slang recovers the Stewart repeated performance in a cough')

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname(RedactSubject)'), 
    'Vane-Tempest-Stewart', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname'), 'Vane-Tempest-Stewart', 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_OwnerTeam'), 
    'Intelligence Source Management', true, FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'), 
    15)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Redaction/a_RedactionSearchResults'), 15)

WebUI.click(findTestObject('Redaction/a_RedactionSearchResults'))

String result1 = WebUI.getText(findTestObject('Object Repository/Redaction/1st Results(Redact Pop-Up)'))

String[] resultArr = result1.split('\\|')

def result2 = (resultArr[1]).trim()

System.out.println(resultArr)

System.out.println(resultArr[1])

System.out.println(result2)

not_run: WebUI.callTestCase(findTestCase('Redaction/Click Redact button by the search results'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Redaction/ActionOptions(Redact Pop-Up Alt)'))

WebUI.click(findTestObject('Object Repository/Redaction/span_Open(Alt)'))

not_run: WebUI.click(findTestObject('Redaction/button_Redact_options(RedactResultsPop-Up)'))

not_run: WebUI.click(findTestObject('Redaction/a_Open(RedactResultsPop-Up)'))

not_run: WebUI.click(findTestObject('Redaction/button_Close(Redact Pop-up)'))

WebUI.switchToWindowIndex(0)

taskTitle = WebUI.getText(findTestObject('Core Functionality/Registers/Task/Title(ViewMode)'))

WebUI.verifyMatch(taskTitle, 'Matt slang recovers the Stewart repeated performance in a cough', false)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Stewart has been a consistent supporter of Matt')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Vane-Tempest-Stewart')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Matt slang recovers the Stewart repeated performance in a cough')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://qa3.clue.co.uk/LogOn?ReturnUrl=%2f')

