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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.waitForElementClickable(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/a_Add Incident'), 10)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/a_Add Incident'))

WebUI.setText(findTestObject('General/Pop-Up/URN(Select Pop-Up)'), '1')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'))

not_run: WebUI.click(findTestObject('Core Functionality/Registers/Linkfields/a_Select Person'))

not_run: WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/a_Create New Record(person pop-up)'))

not_run: WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_Title'), 
    'Dr', true)

not_run: Random rand1 = new Random()

not_run: def PersonData = findTestData('PersonData')

not_run: int rowCount1 = PersonData.getRowNumbers()

not_run: rowNum = (rand1.nextInt(rowCount1 - 1) + 1)

not_run: String firstName = PersonData.getValue(1, rowNum)

not_run: String lastName = PersonData.getValue(2, rowNum)

not_run: WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname'), 
    lastName)

not_run: WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_Type'), 
    1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Forename'), 
    firstName)

not_run: WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/OwnerTeam(Subject Person)'), 
    1, FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/textarea_Notes'), 
    'Test')

not_run: WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'), 
    0)

not_run: WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Type(incident Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Subtype(Incident Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/TakenBy_TypeAhead(Incident Pop-up)'), 
    'Olivia Mills', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/TakenBy_TypeAhead(Incident Pop-up)'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Incident/select_HowReported'), 1, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/TakenBy(Incident Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

Random rand = new Random()

def IncidentData = findTestData('Incident Data')

int rowCount = IncidentData.getRowNumbers()

rowNum = (rand.nextInt(rowCount - 1) + 1)

String incidentTitle = IncidentData.getValue(1, rowNum)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Title(Incident Pop-Up)'), incidentTitle)

//WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Title(Incident Pop-Up)'), 'Incident relating to an illegal betting syndicate')
WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/select_OwnerTeam'), 
    1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Notes(Incident Pop-Up)'), 'Further enquiries required')

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/AssignedTo_TypeAhead(Incident Pop-up)'), 
    'Olivia Mills', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/AssignedTo_TypeAhead(Incident Pop-up)'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/AssignedTo(Incident Pop-Up)'), 
    'Kat Alon', false, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Priority(Incident Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Status(Incident Pop-Up)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/ReviewAfter(Incident Pop-Up)'), 
    '3 Months', false)

WebUI.scrollToElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'), 0)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/OwnerTeam(Incident Pop-Up)'), 
    1, FailureHandling.OPTIONAL)

/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'),30)
WebUI.executeJavaScript("click()")*/
WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Incident/Incident Pop-Up/Save(Add Pop-Up)'))

WebUI.delay(2)

WebUI.click(findTestObject('General/LinkReason/Linkreason_expand'))

WebUI.setText(findTestObject('General/LinkReason/LinkReason'), 'Test')

WebUI.click(findTestObject('General/LinkReason/Link_Save_btn'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Incident/input_save'))

WebUI.delay(5)

