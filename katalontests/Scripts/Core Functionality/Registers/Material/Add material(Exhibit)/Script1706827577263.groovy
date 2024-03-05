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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.Random as Random

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Select Add Address (Inv Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

'Set the Security Classification to Official (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_SecurityClassification'), 
    'Official Sensitive', true, FailureHandling.OPTIONAL)

int optionListLength = 5

Random rand1 = new Random()

int index = rand1.nextInt(optionListLength + 1)

System.out.println(index)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address/select_Address Type'), index)

'Set the Subtype to Private (if field is present)'
WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address/select_Subtype'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Reference'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_RecordStatus'), 'Active', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine1'), '39')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine2'), 'Fieldwater Close')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine3'), 'Humberston')

//WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine4'), 'Lancashire')
//WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine5'), 'England')
WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Postcode'), 'DN6 4KJ')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_Country'), 'United Kingdom', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Reason'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

/*WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Easting'), '100')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Northing'), '41')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Latitude'), '25')

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Longitude'), '32')*/
WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Source'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase(), FailureHandling.OPTIONAL)

/*WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/textarea_Notes'), RandomStringUtils.randomAlphabetic(
        100))*/
Random generator = new Random()

String[] article = ['The', 'A', 'One', 'Some', 'Any', 'Which', 'Why', 'What', 'When', 'How', 'This', 'Where', 'There']

// define noun, verb, preposition in same way here
String[] noun = ['boy', 'dog', 'car', 'bicycle', 'jet', 'horse', 'ball', 'rod', 'umbrella', 'bike', 'trampoline']

String[] verb = ['ran', 'jumped', 'sang', 'moves', 'kick', 'catch', 'shoot', 'waiting', 'swim', 'jump']

String[] preposition = ['away', 'towards', 'around', 'near', 'faraway', 'long', 'into', 'look', 'lost']

StringBuilder buffer = new StringBuilder()

// randomly create sentence
for (int j = 0; j < 1; j++) {
    int article1 = generator.nextInt(article.length)

    // generate others here like noun1, verb1, ....
    System.out.println(article.length)

    System.out.println(article1)

    System.out.println(article[article1])

    int noun1 = generator.nextInt(noun.length)

    System.out.println(noun1)

    int verb1 = generator.nextInt(verb.length)

    System.out.println(verb1)

    int preposition1 = generator.nextInt(preposition.length)

    System.out.println(preposition1)

    int article2 = generator.nextInt(article.length)

    System.out.println(article2)

    int noun2 = generator.nextInt(noun.length)

    System.out.println(noun2)

    // concatenate words and add period
    buffer.append(article[article1]).append(' ').append(noun[noun1]).append(' ').append(verb[verb1]).append(' ').append(
        preposition[preposition1]).append(' ').append(article[article2]).append(' ').append(noun[noun2]).append(' ').append(
        '.\n')

    // capitalize first letter and display
    buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)))

    System.out.println(buffer.toString( // end for
            ))
}

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/textarea_Notes'), buffer.toString(), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_ReviewPeriod'), '3 Months', 
    true, FailureHandling.OPTIONAL)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Address/Add Address/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Address/Address Details/h2_Address Details'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Material/Navigate to Material Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Material/Select Add Material(Inv Mode)/a_Add Exhibit(Inv. mode)'))

WebUI.click(findTestObject('Case and Disclosure/Exhibit/a_Create New Record'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/select_CashDrugsElectronicsStewartWeapons'), 
    'Cash', true)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Title_Title'), 
    'Izer Laptop')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/textarea_Description_Notes'), 
    'Erroneous accounting practices')

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_Reference_Reference'), 
    'WK1M9P5SQ8')

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/ul_Type                                    _22fe06'))

//WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_When Found_WhenFoundDate'))
Date todaysDate = new Date()

//Past Date from calendar//
def pastDate = (todaysDate - 7).format('dd/MM/yyyy')

System.out.println(pastDate)

WebUI.setText(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_When Found_WhenFoundDate'), 
    pastDate)

//WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_26'))
WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD8))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.SEMICOLON))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_at_WhenFoundTime'), 
    Keys.chord(Keys.NUMPAD0))

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_Select Location'))

WebUI.setText(findTestObject('General/Pop-Up/input_Search All Fields(Pop-Up)'), 'DN6 4KJ')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/a_Select Location_1'))

WebUI.setText(findTestObject('General/Pop-Up/input_Search All Fields(Pop-Up)'), 'DN6 4KJ')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/Statement/Add Statement/a_Select Person(StatementRegister)'))

WebUI.setText(findTestObject('General/Pop-Up/input_Search All Fields(Pop-Up)'), 'Test')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Select a record on the pop-up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/select_Intelligence Source ManagementRedact'), 
    'Redact', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Core Functionality/Registers/Material/Add Material/Page_Clue - Add Material/input_on_save'))

