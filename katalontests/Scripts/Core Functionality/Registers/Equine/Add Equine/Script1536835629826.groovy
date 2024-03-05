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
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/input_Name'), 'Katalon Kate')

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/input_Age'), '14')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Status'), 'In Farm - Our Horse', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_ReasonForAdmittance'), 'Born in Farm', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_OriginalFarm'), 'Belwade Farm', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_ProsecutionInfo'), 'Born in Farm', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Gender'), 'Filly', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Type'), 'Horse', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/input_HRNumber'), '123456')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Height'), '11.1hh', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Colour'), 'Piebald', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Breed'), 'Cleveland Bay', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_RehomingCategory'), 'Companion', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_AssignedTo'), 'Adele Edwards', 
    true)

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/textarea_Important Notes'), 'Important Notes')

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/textarea_Farm Rehoming Notes'), 'Animal came into our care following a call to the welfare line in March 2017 from a member of the public concerned about a group of horses in the Strathclyde area of Scotland, one of which had been seen in thin condition.')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_CountyOfOrigin'), 'Cleveland', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_OriginalFieldOfficer'), 
    'Jacko Jackson', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Deceased'), '1', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_CauseOfDeath'), 'Natural Causes', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_LocationOfDeath'), 'Penny Farm', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_OnRehomingWebsite'), '1', 
    true)

'Expand to show \'Rehoming Web Info\''
WebUI.click(findTestObject('Core Functionality/Registers/Equine/Add Equine/a_Details'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Ailments'), 'Bone spavins', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_TurnOut'), 'Cannot be left alone', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Bedding'), 'Paper', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Vices'), 'Barges', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_CatchInField'), 'Cautious', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_HayFeed'), 'Feed during the winter', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Feet'), 'Difficult to shoe', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_Rugs'), 'Doesn\'t need a rug', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_StableShelter'), 'Can live out all year with shelter', 
    true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_RehomingFee'), '250', true)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_HorseOfTheWeek'), '0', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/textarea_History'), 'History')

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/textarea_Temperament'), 'Temperament')

WebUI.setText(findTestObject('Core Functionality/Registers/Equine/Add Equine/textarea_General Information'), 'General Information')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Equine/Add Equine/select_ReviewPeriod'), '3 Months', 
    true)

WebUI.click(findTestObject('Core Functionality/Registers/Equine/Add Equine/input_Save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Equine/Equine Details/h2_Equine Details'), FailureHandling.STOP_ON_FAILURE)

