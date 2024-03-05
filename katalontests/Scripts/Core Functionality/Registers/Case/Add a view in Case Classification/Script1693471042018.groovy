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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Filter Expand'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_searchTerm'), 'Operation Gooseberg', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/URNLink(Inv)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Navigate to Case register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Select Add Case (Investigation)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Case/Add Case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Sync(case)'))

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Case/AfterSync_OK'))

WebUI.refresh()

WebUI.delay(2)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Case/Classification View/span_Classification'), 0)

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/Filters_plus(CaseClas.)'))

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Classification View/input_Action_advOptFilterValue0'), 'Test')

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/button_Go(CaseClas.)'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/Save as a new view(CaseClas.)'))

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Classification View/input_NameValue(CaseClas.)'), 'TestView')

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/button_Save(CaseClas.)'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/Filters_plus(CaseClas.)'))

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Case/Classification View/button_DeleteView(Case Clas)'))

WebUI.click(findTestObject('Core Functionality/Registers/Case/Classification View/ViewDelete_OK(Case Clas)'))

