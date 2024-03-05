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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Select Investigation Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Material/Navigate to Material Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Add Other Materials'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Adding Other Materials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Navigate to Case register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Select Case Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Sync Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/btn_Edit_Case'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Sort by Material'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Classify Material'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/btn_Save_Case'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Generate Material List'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Material List Display'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Generate Submit - Continuation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Generate Material List'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Generate Submit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('Case and Disclosure/Exhibit List/Generate Material List'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Generate Preview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('General/Log Off'), [:], FailureHandling.STOP_ON_FAILURE)

