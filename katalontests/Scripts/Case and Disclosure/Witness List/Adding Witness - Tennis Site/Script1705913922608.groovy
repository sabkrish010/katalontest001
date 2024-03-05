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
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_6'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_7'))

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
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_11'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_12'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_13'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_14'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_15'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 11 - 15'
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_16'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_17'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_18'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_19'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_20'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 16 - 20'
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_21'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_22'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_23'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_24'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_25'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 11 - 15'
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_26'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_27'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_28'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_29'))

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - Before Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/a_Next'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_30'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/btn_OK_Add_Witness_From_OtherCase'), 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Adding Witness - After Person Select'), [:], FailureHandling.STOP_ON_FAILURE)

'Saving Witness 16 - 20'
not_run: WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/input_Investigation_save'))

not_run: WebUI.delay(5)

