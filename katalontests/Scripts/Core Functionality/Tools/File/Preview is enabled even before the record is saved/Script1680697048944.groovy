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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Select Add Person (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Add Person'), [('Surname') : findTestData('Person Nominal Data').getValue(
            1, 1), ('Forename') : findTestData('Person Nominal Data').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/File/a_Add File'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

def filePath = RunConfiguration.getProjectDir() + '/TestFiles/Animal Welfare.pdf'

WebUI.uploadFileWithDragAndDrop(findTestObject('Core Functionality/Registers/File/a_Browse(SelectFilePop-Up)'), filePath)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/File/Add File Pop-Up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/File/a_Preview Button'), 0)

WebUI.verifyElementClickable(findTestObject('Core Functionality/Registers/File/a_Preview Button'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Core Functionality/Registers/File/a_Preview Button'))

not_run: WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/File/Preview Modal/span_File Preview'))

not_run: WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

