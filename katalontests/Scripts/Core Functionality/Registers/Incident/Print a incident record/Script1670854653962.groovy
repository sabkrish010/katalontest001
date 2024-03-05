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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.keyword.BuiltinKeywords as BuiltinKeywords
import com.kms.katalon.core.keyword.internal.KeywordExecutor as KeywordExecutor
import com.kms.katalon.core.webui.common.ImageTextProperties as ImageTextProperties
import com.kms.katalon.core.webui.constants.StringConstants as StringConstants
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import groovy.transform.CompileStatic as CompileStatic

incidentTitle = WebUI.getText(findTestObject('Core Functionality/Registers/Incident/incidentTitle'))

System.out.println(incidentTitle)

WebUI.verifyTextPresent(incidentTitle, false)

WebUI.callTestCase(findTestCase('General/Click print on a record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/ReportHistory_Yes'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/SaveReportHistory Check-Box'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('Object Repository/General/Print/Ok button (print pop-up)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/File/Close preview modal'), [:], FailureHandling.STOP_ON_FAILURE)

