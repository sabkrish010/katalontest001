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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa3.clue.co.uk/LogOn?ReturnUrl=%2f')

WebUI.setText(findTestObject('General/Log On/txt_Username'), 'QA3Test')

WebUI.setEncryptedText(findTestObject('General/Log On/txt_Password'), 'bJwdWegY3MgfVVpiUB9QlA==')

WebUI.click(findTestObject('General/Log On/btn-submit'))

WebUI.waitForPageLoad(5)

WebUI.refresh()

'Add new record for Task Register'
not_run: WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Select Add Task (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Add Task (User Redact)'), [:], FailureHandling.STOP_ON_FAILURE)

'Add new record for Person Register\r\n'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Select Add Person (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Add Person for User Redact'), [('Surname') : findTestData(
            'Person Nominal Data').getValue(1, 1), ('Forename') : findTestData('Person Nominal Data').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

'Add new record for Decision Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Navigate to Decision Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Select Add Decision(Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Decision/Add Decision record for User Redact'), [:], FailureHandling.STOP_ON_FAILURE)

'Add new record for Event Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Navigate to Event register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Select Add Event (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Add Event (User Redact)'), [:], FailureHandling.STOP_ON_FAILURE)

'Add new record for Incident Register'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Select Add Incident (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Add Incident for User Redact'), [:], FailureHandling.STOP_ON_FAILURE)

