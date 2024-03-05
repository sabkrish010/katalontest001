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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select



WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Staff/Navigate to Staff register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Staff/Select Add Staff (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Staff/Add Staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Set retention date to current day'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Redaction/i_Record Properties_Expand_New'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Redaction/Redaction PII Task/a_Create PII Redaction task(RecordProperties)'), 
    20) == true) {
    //WebUI.click(findTestObject('Redaction/Redaction PII Task/a_Create PII Redaction task(RecordProperties)'))	
} else {
    Date date1 = new Date()

    def screenFormattedDate = date1.format('dd/MM/yyyy')

    WebUI.setText(findTestObject('General/RetainDate(Record)'), screenFormattedDate)

    WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Redaction/i_Record Properties_Expand_New'))
}

WebUI.click(findTestObject('Redaction/Redaction PII Task/a_Create PII Redaction task(RecordProperties)'))

titleValue = WebUI.getAttribute(findTestObject('Redaction/Redaction PII Task/Title(Task Pop-Up)'), 'value')

System.out.println(titleValue)

notesValue = WebUI.getAttribute(findTestObject('Redaction/Redaction PII Task/Notes(Task Pop-Up)'), 'value')

System.out.println(notesValue)

value1 = WebUI.getAttribute(findTestObject('Redaction/Redaction PII Task/SubjectField(Task Pop-Up)'), 'value')

if (value1 == '') {
    throw new Exception('Empty value not found')
}

value2 = WebUI.getAttribute(findTestObject('Redaction/Redaction PII Task/AllocatedToField(Task Pop-Up)'), 'value')

if (value2 == '') {
    throw new Exception('Empty value not found')
}

System.out.println(value2)

/*
 //Non TIU Sites - pls use this code
//value3 = WebUI.getText(findTestObject('AllocatedByText(TIU Task Pop-Up)'))
*/

//TIU use the below
WebDriver driver = DriverFactory.getWebDriver();
value3 = driver.findElement(By.id("AllocatedByAsText")).getAttribute("value")

System.out.println(value3)

if (value3 == false) {
  throw new Exception('Empty value not found')
}

/*
value3 = WebUI.getText(findTestObject('Redaction/Redaction PII Task/AllocatedByField(Task Pop-Up)'))
  
if (value3 == '') { 
	throw new Exception('Empty value not found')
}
 */ 
System.out.println(value3)


WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Task/Save(Task Pop-up)'))


WebUI.click(findTestObject('General/AccountProfile/span_loggedinuser'))

def user = WebUI.getAttribute(findTestObject('General/AccountProfile/FullName(AccountProfile)'), 'value')

System.out.println(user)

WebUI.click(findTestObject('General/AccountProfile/Cancel(AccountProfile)'))

WebUI.verifyMatch(value3, user, false)


WebUI.delay(1)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

