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

WebUI.click(findTestObject('Object Repository/General/Links/a_Add Address'))

WebUI.setText(findTestObject('General/Pop-Up/URN(Select Pop-Up)'), '1', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('General/a_Create New Record(Pop-up)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Type(Address Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

'Set the Subtype to Private (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_Subtype'), 'Private', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Reference'), 'Factory Address', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_RecordStatus'), 'Active', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Address1(Address Pop-Up)'), '55, York Road')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Address2(Address Pop-Up)'), 'Manchester')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/AddressLine3(Address Pop-Up)'), 'Greater Manchester')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/AddressLine4(Address Pop-Up)'), 'Lancashire')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/AddressLine5(Address Pop-Up)'), 'England')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Country(Address Pop-Up)'), 
    'United Kingdom', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Postcode(Address Pop-Up)'), 'BP1 3JY')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Easting(Address Pop-Up)'), '100')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Northing(Address Pop-Up)'), '41')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Latitude(Address Pop-Up)'), '25')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Longitude(Address Pop-Up)'), '32')

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/CreatorTeam(Address Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Save(Address Pop-Up)'), 1)

/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'),30)
WebUI.executeJavaScript("click()")*/
WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Address/Add Address Pop-Up/Save(Address Pop-Up)'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Set the link reason'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record(JS Script)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/AddressLink'))

not_run: WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('General/Select a record from View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

