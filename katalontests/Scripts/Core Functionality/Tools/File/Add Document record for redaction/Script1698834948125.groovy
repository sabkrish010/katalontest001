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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementPresentKeyword as WaitForElementPresentKeyword
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Edit Person/input_edit'))

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Navigate to Case register'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Select Add Case (Investigation)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/File/div_DragnDrop'), 5)

def filePath = RunConfiguration.getProjectDir() + '/TestFiles/Coffee Man.jpeg'

def filePath1 = RunConfiguration.getProjectDir() + '/TestFiles/The computer wouldn.pdf'

def filePath2 = RunConfiguration.getProjectDir() + '/TestFiles/Tomatoes 5428511480.jfif'

WebUI.uploadFileWithDragAndDrop(findTestObject('Core Functionality/Registers/File/div_DragnDrop'), (((filePath + '\n') + 
    filePath1) + '\n') + filePath2)

WebUI.delay(5)

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Description(File Pop-Up)'), 'Test')

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/ApplyToAll(File Pop-Up)'), 
    5)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/ApplyToAll(File Pop-Up)'))

WebUI.delay(2)

WebUI.click(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Span OK(File Pop-Up)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Type(File Pop-Up)'), 1)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Subtype(File Pop-Up)'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/Description(File Pop-Up)'), 'Test')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ARROW_DOWN))

WebUI.setText(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), 'Test')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/File/Add File Pop-Up/LinkReason(File Pop-Up)'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

/*def filerecordcount = WebUI.getText(findTestObject('Core Functionality/Registers/File/Page_Clue - Incident Details/file linklist record number'), 
    0)

System.out.println(filerecordcount)*/
WebUI.verifyElementPresent(findTestObject('Core Functionality/Registers/File/Page_Clue - Incident Details/file linklist record number'), 
    0)

