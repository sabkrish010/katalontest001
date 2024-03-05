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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/General/Switch Mode/a_Switch to Standard Mode'), 1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/General/Switch Mode/a_Switch to Standard Mode'))
}

WebUI.callTestCase(findTestCase('Core Functionality/Options/Lists/Navigate to Lists'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Lists/Select registers in Lists page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Options/Lists/a_Reset(AddressLinkList)'))

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'))

WebUI.click(findTestObject('Core Functionality/Options/Lists/button_OK(LinkListReset)'))

WebUI.click(findTestObject('Core Functionality/Options/Lists/a_Edit(Lists Page)'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement selectColumn = driver.findElement(By.xpath('//*[(text() = \'Address Line 1\' or . = \'Address Line 1\')]'))

selectColumn.click()

System.out.println(selectColumn)

WebUI.click(findTestObject('Core Functionality/Options/Lists/MoveRight(Lists)'))

WebUI.click(findTestObject('Core Functionality/Options/Lists/Save(Lists)'))

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/a_Add Address'))

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/input_Go(Pop-Up)'))

WebUI.click(findTestObject('Core Functionality/Integrations/HR Integration(Amazon)/Add Person Pop-up/a_Select'))

WebUI.callTestCase(findTestCase('General/Set the link reason'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Shared Record Functions/input_save'))

WebUI.verifyElementPresent(findTestObject('Core Functionality/Options/Lists/Column(Address Line 1)'), 1)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('General/Links/a_Add Address'), 1)

WebUI.click(findTestObject('General/Links/a_Remove(AddressLink)'))

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Lists/Navigate to Lists'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Options/Lists/Select registers in Lists page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Options/Lists/a_Edit(Lists Page)'))

WebDriver driver1 = DriverFactory.getWebDriver()

WebElement selectColumn1 = driver1.findElement(By.xpath('//*[(text() = \'Address Line 1\' or . = \'Address Line 1\')]'))

selectColumn1.click()

WebUI.click(findTestObject('Core Functionality/Options/Lists/MoveLeft(Lists)'))

WebUI.click(findTestObject('Core Functionality/Options/Lists/Save(Lists)'))

