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

WebUI.callTestCase(findTestCase('Redaction/Populate subject field with a link and save the task record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Redaction/summary_ Search terms'), 2)

WebUI.click(findTestObject('Redaction/span_ Search terms'))

WebUI.verifyElementPresent(findTestObject('Redaction/forename(SearchResults)'), 2)

WebUI.verifyElementPresent(findTestObject('Redaction/surname(SearchResults)'), 2)

def searchterm = WebUI.getText(findTestObject('Redaction/span_result'))

System.out.println(searchterm)

WebUI.callTestCase(findTestCase('Redaction/Select a hit from the results(checkbox)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Redaction/ResultsTotal(Redact Pop-up)'), 2)

results = WebUI.getText(findTestObject('Object Repository/Redaction/ResultsTotal(Redact Pop-up)'))

surname = WebUI.getText(findTestObject('Object Repository/Redaction/surname(Redact Pop-Up)'))

System.out.println(surname)

forename = WebUI.getText(findTestObject('Object Repository/Redaction/forename(Redact Pop-Up)'))

System.out.println(forename)

//WebUI.verifyMatch(forename, searchterm, false OR forename, searchterm, false)
if (!(forename.equals(searchterm) || surname.equals(searchterm))) {
    //KeywordUtil.markFailed('error')
    assert false
}

WebUI.callTestCase(findTestCase('Redaction/Version check when redacting'), [:], FailureHandling.STOP_ON_FAILURE)

