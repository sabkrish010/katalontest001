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

WebUI.callTestCase(findTestCase('General/Switch to Standard Mode'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Custom Fields/Navigate to Custom Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    4)

WebUI.selectOptionByLabel(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Register Dropdown'), 
    'Task', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Link', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/Linkfield_Register'), 'Person', 
    false)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Person linkfield')

//WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'),RandomStringUtils.randomAlphabetic(8).toUpperCase())
WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Reviewed By')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Drop down Custom Field')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Dropdown_Custom')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'List of countries')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Country List')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Counties List')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'County List')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Region list')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Region')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Business division')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Division')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Operational Code')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Operations Code')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Organisation Type')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Organisation Type')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Referral Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Referral Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '0')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Record reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '255')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Organisation reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Org. Reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '255')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '0')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Notes from Investigation officer')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Investigation Officer Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '0')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'New row', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Follow -Up Reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Follow-Up Reference')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '255')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Link', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/Linkfield_Register'), 'Organisation', 
    false)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Review organisation')

//WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'),RandomStringUtils.randomAlphabetic(8).toUpperCase())
WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Linked Organisation')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Link', false)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Linkfields/Linkfield_Register'), 'Person', 
    false)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Organsation Address')

//WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'),RandomStringUtils.randomAlphabetic(8).toUpperCase())
WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Investigation Officer')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Date', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Date Escalated')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Date Escalated')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Date', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Date record reviewed')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Date Reviewed')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Currency', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Damage cost in Pounds')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Total Damage Cost in £.')

/*def currencyName = WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 
    'Damage Cost £.')*/
WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Currency Custom Field/Save Currency Custom Field'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Currency', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Damage cost recovered')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Damage cost recovered in £.')

/*def currencyName = WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 
    'Damage cost recovered £.')*/
WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Currency Custom Field/Save Currency Custom Field'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Subisdiaries')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Subsidiaries')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Visit notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Visit Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '0')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Free text', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Other notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Other Notes')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Character Limit'), '0')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Boolean (Yes/No)', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Other Org. Involved')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Other Org. Involved')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Boolean (Yes/No)', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Investigation Closed')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Investigation Closed')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Field_Layout'), 'Default', true)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/a_Add Custom Field'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Yes(Conditional)'))

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_No(Conditional)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/select_Type(Conditional)'), 
    'Dropdown', true)

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Description'), 'Police Authority Involved')

WebUI.setText(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Label_Label'), 'Police Authority Involved')

WebUI.click(findTestObject('Core Functionality/Options/Custom Fields/Add Custom Fields/input_Save(Conditional)'))

WebUI.delay(4)

