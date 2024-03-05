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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testdata.DBData as DBData

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/a_Create New Record(person pop-up)'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_Title'), 
    'Dr', true)

Random rand = new Random()

def PersonData = findTestData('PersonData')

int rowCount = PersonData.getRowNumbers()

rowNum = (rand.nextInt(rowCount - 1) + 1)

String firstName = PersonData.getValue(1, rowNum)

String lastName = PersonData.getValue(2, rowNum)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_Surname'), lastName)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_Type'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_Forename'), firstName)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/OwnerTeam(Subject Person)'), 
    1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/textarea_Notes'), 'Test')

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'))

