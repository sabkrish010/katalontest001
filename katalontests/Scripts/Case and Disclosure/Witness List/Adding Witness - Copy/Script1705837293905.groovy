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

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_1'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 2')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_2'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 3')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_3'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 4')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_4'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 5')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.enhancedClick(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_5'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

'Saving Witness 1 - 5'
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_6'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_7'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_8'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_9'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

WebUI.refresh()

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add Witness_Statement'))

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Create New Record'))

WebUI.selectOptionByValue(findTestObject('Case and Disclosure/Witness/select_Witness_Statement_Type'), 'Witness', false)

not_run: WebUI.setText(findTestObject('Case and Disclosure/Witness/input_Title_Title'), 'Witness - 1')

WebUI.click(findTestObject('Case and Disclosure/Witness/a_Add_Person'))

WebUI.click(findTestObject('Case and Disclosure/Witness/input_Search All Fields'))

WebUI.click(findTestObject('Case and Disclosure/Witness/List of Witnesses Selected/a_Select_Person_10'))

WebUI.setText(findTestObject('Case and Disclosure/Witness/input__DateTaken'), '02/01/2024')

WebUI.callTestCase(findTestCase('Case and Disclosure/Witness List/Add Time Witness'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Case and Disclosure/Witness/input_submit_Save_Witness'))

'Saving Witness 6 - 10'
WebUI.click(findTestObject('Case and Disclosure/Witness/input_Investigation_saveandcontinue'))

WebUI.refresh()

not_run: WebUI.delay(5)

