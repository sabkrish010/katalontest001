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

WebUI.callTestCase(findTestCase('Redaction/Check if task type PII Redaction is available for selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), 'The successive west vanishes inside the bog. Can the rear sound the John owner? An elite opera progresses. The immortal disconnects an erroneous surgery without any variant. Strackley drives Porsche.')

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

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Edit Task Record/input_Title(Task)'), 'Strackley slang recovers the Mark\'s repeated performance in a cough')

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

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'))

WebUI.delay(2)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Forename(subject)'), 
    'Strackley')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/textarea_Notes'), 'Test')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname_Subject'), 'Vane-Tempest-Stewart')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname(RedactSubject)'), 
    'Vane-Tempest-Stewart', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_OwnerTeam'), 
    'Intelligence Source Management', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Redaction/a_RedactionSearchResults'))

WebUI.enhancedClick(findTestObject('Redaction/Close(Redaction Results Pop-Up)'))

WebUI.enhancedClick(findTestObject('Redaction/a_RedactionSearchResults'))

WebUI.click(findTestObject('Redaction/RedactBtn(Result2)'))

WebUI.click(findTestObject('Redaction/RedactConfirm_Result2'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 3)

WebUI.click(findTestObject('Redaction/Close(Redaction Results Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'Complete', 
    false)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Quick Search/input_QuickSearch'), 'strackley')

WebUI.verifyElementNotPresent(findTestObject('General/Quick Search/QuickSearch(Results)'), 2)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Vane-Tempest-Stewart')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Strackley')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.verifyElementPresent(findTestObject('Register Search and Advanced Options/regsiterSearch(0 hits for search)'), 2)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'erroneous')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.setText(findTestObject('General/Quick Search/input_QuickSearch'), 'strackley')

WebUI.verifyElementNotPresent(findTestObject('General/Quick Search/QuickSearch(Results)'), 2)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Core Functionality/Research/Global Search/Navigate to Global Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_searchTerm(GlobalSearch)'), 'strackley')

'Change the handling to **** stop on failure ****'
WebUI.click(findTestObject('Core Functionality/Research/Global Search/button_Go'), FailureHandling.STOP_ON_FAILURE)

//uncomment after Rich's ES fix
WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/span_No results found(GS)'), 2, 
    FailureHandling.OPTIONAL)

