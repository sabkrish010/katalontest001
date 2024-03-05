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

WebUI.callTestCase(findTestCase('Core Functionality/Options/User Management/Navigate to User Management'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Options/User Management/Create New User/a_Create New User Account'))

WebUI.delay(3)

int RN

RN = ((Math.random() * 5000) as int)

String NewUser = GlobalVariable.NewUser + RN

String NewUserSpan = (('\'' + GlobalVariable.NewUser) + RN) + '\''

String NewEmail = ((NewUser + '@') + NewUser) + 'nowhere.com'

String NewFullname = NewUser + ' Femi'

WebUI.setText(findTestObject('Core Functionality/Options/User Management/Create New User/input_Username_Username'), NewUser)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Staff URN_StaffUrn'), 
    NewUser)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Email Address_Email'), 
    NewEmail)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Phone Number_PhoneNumber'), 
    '07012345678')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Full Name_FullName'), 
    NewFullname)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/textarea_Description_Description'), 
    NewUser + 'User Account')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_ID Number_IDNumber'), 
    NewUser + '123')

WebUI.setEncryptedText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Password_Password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/input_Confirm Password_ConfirmPassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Core Functionality/Options/User Management/Create New User/button_Save'))

'Add user to permission group.'
WebUI.click(findTestObject('Object Repository/Core Functionality/Options/User Management/User Permission Group/button_Permission Groups_expand'))

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Permission Group/span_Username', [('Username') : NewUserSpan]))

WebUI.dragAndDropToObject(findTestObject('Core Functionality/Options/User Management/User Permission Group/span_Username', 
        [('Username') : NewUserSpan]), findTestObject('Core Functionality/Options/User Management/User Permission Group/h3_Full Access only- Only WF2WF3 Member- Katalon'))

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Permission Group/h3_Full Access only- Only WF2WF3 Member- Katalon'))

WebUI.delay(1)

'Add user to teams.'
WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/button_Teams_expand'))

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]))

WebUI.dragAndDropToObject(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]), 
    findTestObject('Core Functionality/Options/User Management/User Teams/h3_Intel Workflow1'))

WebUI.delay(1)

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]))

WebUI.dragAndDropToObject(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]), 
    findTestObject('Core Functionality/Options/User Management/User Teams/h3_Intel Workflow2'))

WebUI.delay(1)

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]))

WebUI.dragAndDropToObject(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]), 
    findTestObject('Core Functionality/Options/User Management/User Teams/h3_Intel Workflow3'))

WebUI.delay(1)

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]))

WebUI.dragAndDropToObject(findTestObject('Core Functionality/Options/User Management/User Teams/span_Username', [('Username') : NewUserSpan]), 
    findTestObject('Core Functionality/Options/User Management/User Teams/h3_Intelligence Source Management'))

WebUI.click(findTestObject('Core Functionality/Options/User Management/User Teams/h3_Intelligence Source Management'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('General/Log Off/a_Log Off'), 1, FailureHandling.CONTINUE_ON_FAILURE)

'Press the Log Off button'
WebUI.click(findTestObject('General/Log Off/a_Log Off'))

WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

'Enter a Username'
WebUI.setText(findTestObject('General/Log On/txt_Username'), NewUser)

'Enter a Password'
WebUI.setEncryptedText(findTestObject('General/Log On/txt_Password'), 'iFGeFYmXIrUhQZHvW7P22w==', FailureHandling.STOP_ON_FAILURE)

'Press the Log On button'
WebUI.click(findTestObject('General/Log On/btn-submit'))

WebUI.waitForPageLoad(1)

'Add new record for Person Register\r\n'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Select Add Person (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Add Person for User Redact'), [('Surname') : findTestData(
            'Person Nominal Data').getValue(1, 1), ('Forename') : findTestData('Person Nominal Data').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

'Add new record for Decision Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Navigate to Decision Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Select Add Decision(Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Add Decision record for User Redact'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Add new record for Event Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Navigate to Event register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Select Add Event (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Add Event (User Redact)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

'Add new record for Incident Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Select Add Incident (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Add Incident for User Redact'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.refresh()

'Add new record for Task Register'
WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Select Add Task (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Add Task (User Redact)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

