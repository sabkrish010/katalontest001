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

WebUI.callTestCase(findTestCase('General/Log On QA2'), [:], FailureHandling.STOP_ON_FAILURE)

'Add new record for Person Register\r\n'
WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Select Add Person (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Add Person for User Redact'), [('Surname') : findTestData(
            'Person Nominal Data').getValue(1, 1), ('Forename') : findTestData('Person Nominal Data').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Select Add Investigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Add Investigation Record(Redact)'), [:], FailureHandling.STOP_ON_FAILURE)

'Add new record for Task Register'
WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Select Add Task (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Add Task (User Redact) - Investigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Research/Global Search/Navigate to Global Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_searchTerm(GlobalSearch)'), GlobalVariable.NewUser + ' ' + GlobalVariable.NewFirstName)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/button_Go'), 3)

WebUI.click(findTestObject('Core Functionality/Research/Global Search/button_Go'), FailureHandling.STOP_ON_FAILURE)

//uncomment after Rich's ES fix
WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/span_No results found(GS)'), 2, 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

