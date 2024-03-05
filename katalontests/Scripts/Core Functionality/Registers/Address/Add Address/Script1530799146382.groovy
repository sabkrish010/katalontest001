import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.Random as Random

'Set the Security Classification to Official (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_SecurityClassification'), 
    'Official Sensitive', true, FailureHandling.OPTIONAL)

int optionListLength = 5

Random rand1 = new Random()

int index = rand1.nextInt(optionListLength + 1)

System.out.println(index)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Address/Add Address/select_Address Type'), index)

'Set the Subtype to Private (if field is present)'
WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_Subtype'), 'Private', 
    true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Reference'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'))

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_RecordStatus'), 'Active', 
    true)

Random rand = new Random()

def addressData = findTestData('AddressData1')

int rowCount = addressData.getRowNumbers()

rowNum = (rand.nextInt(rowCount - 1) + 1)

System.out.println(rowNum)

String addressLineOne = addressData.getValue(1, rowNum)

System.out.println(addressLineOne)

String addressLineTwo = addressData.getValue(2, rowNum)

System.out.println(addressLineTwo)

String addressLineThree = addressData.getValue(3, rowNum)

System.out.println(addressLineThree)

String addressLine4 = addressData.getValue(4, rowNum)

System.out.println(addressLine4)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine1'), addressLineOne)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine2'), addressLineTwo)

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine3'), addressLineThree)

//WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine4'), 'Lancashire')
//WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_AddressLine5'), 'England')
WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/input_Postcode'), addressLine4)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_Country'), 'United Kingdom', 
    true)

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

    System.out.println(buffer.toString()) // end for
}

WebUI.setText(findTestObject('Core Functionality/Registers/Address/Add Address/textarea_Notes'), buffer.toString(), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Address/Add Address/select_ReviewPeriod'), '3 Months', 
    true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Address/Add Address/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Address/Address Details/h2_Address Details'), FailureHandling.STOP_ON_FAILURE)

