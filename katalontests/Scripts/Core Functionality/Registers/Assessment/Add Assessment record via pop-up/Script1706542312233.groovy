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

not_run: WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/a_Add Assessment'))

WebUI.setText(findTestObject('General/Pop-Up/URN(Select Pop-Up)'), '1', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/a_Create New Record(Pop-up)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Assessment/Add Assessment(Pop-Up)/select_Type(Assessment Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

'Set the Subtype to Private (if field is present)'
WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address/select_Subtype'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Assessment/Add Assessment(Pop-Up)/input_Title(Assessment Pop-Up)'), 
    'The dance purges across the sponsor!', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Assessment/Add Assessment(Pop-Up)/input_Performed By(Assessment Pop-Up)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/OwnerTeam(Incident Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('General/Pop-Up/Save(Pop-Up)'), 1)

/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'),30)
WebUI.executeJavaScript("click()")*/
WebUI.enhancedClick(findTestObject('General/Pop-Up/Save(Pop-Up)'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Set the link reason'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record(JS Script)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Assessment/Assessment_RecordLink'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

