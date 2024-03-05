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

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/File/a_Add File'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Core Functionality/Registers/File/a_Browse button'), RunConfiguration.getProjectDir() + 
    '/TestFiles/ChristianH 842711.jpeg')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/File/select_FileType'), 'Image', false)

WebUI.setText(findTestObject('Core Functionality/Registers/File/textarea_FileDescription'), 'Test')

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_FileReason'), 'Attachment')

WebUI.sendKeys(findTestObject('Page_Clue - Edit Address/input_Reason_custom-combobox-input combo-bo_5686f2'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Core Functionality/Registers/File/input(AddFilePop-Up)'))

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

WebUI.delay(5)

WebUI.click(findTestObject('General/input_Print'))

WebUI.click(findTestObject('General/Print - Append files'))

//WebUI.verifyElementText(findTestObject('Core Functionality/Registers/File/Verify_file on print pop-up'), 'ChristianH 842711 *')
WebUI.verifyTextPresent('ChristianH 842711', false)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

