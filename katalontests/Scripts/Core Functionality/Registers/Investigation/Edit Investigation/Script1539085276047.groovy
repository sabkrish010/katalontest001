import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Edit Investigation/input_Edit'))

WebUI.setText(findTestObject('Core Functionality/Registers/Investigation/Edit Investigation/textarea_Summary'), 'Investigation into the fraudulent tax affairs of Mr Jeffrey Jeffries was started on 18-05-2015. On Jan. 7, 2016, in Honolulu, Hawaii, Albert S.N. Hee, of Kailua, Hawaii, was sentenced to 46 months in prison, one year of supervised release, ordered to pay a $10,000 fine and $431,793 in restitution to the IRS. Hee was convicted in July to one count of corruptly endeavoring to obstruct the IRS and six counts of filing false individual income tax returns for the years 2007 to 2012. \r\nAccording to court documents, He owned Waimana Enterprises Inc., a telecommunications holding company based in Honolulu.  Between 2002 and 2012, He caused Waimana to pay more than $2 million of his personal expenses. Mr.Hee then falsely characterised these personal expenditures as business expenses on Waimana’s corporate income tax returns. Hee also filed false individual income tax returns for 2002 to 2012 on which he failed to report the expenditures as income.')

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Edit Investigation/input_Save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

