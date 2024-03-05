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

WebUI.callTestCase(findTestCase('General/Log On QA2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Navigate to Investigation register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Investigation/Select Add Investigation'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Case and Disclosure/Add Investigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Type'), '2')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_Status'), 
    'Open', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Title'), 'Case and Disclosure - Hawaiian Businessman.')

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_Reference'), 'Tax Fraud', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/textarea_Summary'), 'Outstanding payment of more than £2 million.')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/input_StartDate'), Keys.chord(
        Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Investigation/Add Investigation/select_ReviewAfter'), 
    '1 Week', true)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Event/Add Event/select_RecordStatus'), 'Active', 
    true)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_1'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_2'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_3'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_4'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_5'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 1 - 5'
not_run: WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_6'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_7'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_8'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_9'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_10'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 6 - 10'
not_run: WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

not_run: WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_11'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_12'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

