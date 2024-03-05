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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Expand Advanced Options'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Search and Advanced Options/View/Page_Clue - Incident Register/CrossRegisterViews ChkBx'))

//Verify dashboard checkbox is disabled//
if (WebUI.verifyElementChecked(findTestObject('Register Search and Advanced Options/View/Page_Clue - Incident Register/CrossRegisterViews ChkBx'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.verifyElementNotChecked(findTestObject('Register Search and Advanced Options/View/Show on Dashboard'), 10, FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Register Search and Advanced Options/ExpandColumns'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement selectColumn = driver.findElement(By.xpath('//*[(text() = \'Address > URN\' or . = \'Address > URN\')]'))

selectColumn.click()

WebUI.click(findTestObject('Register Search and Advanced Options/ColumnsMoveRight(Selected)'))

WebDriver driver1 = DriverFactory.getWebDriver()

WebElement selectColumn1 = driver1.findElement(By.xpath('//*[(text() = \'Address > Full Address\' or . = \'Address > Full Address\')]'))

selectColumn1.click()

WebUI.click(findTestObject('Register Search and Advanced Options/ColumnsMoveRight(Selected)'))

WebDriver driver2 = DriverFactory.getWebDriver()

WebElement selectColumn2 = driver2.findElement(By.xpath('//*[(text() = \'Address > Owner Team\' or . = \'Address > Owner Team\')]'))

selectColumn2.click()

WebUI.click(findTestObject('Register Search and Advanced Options/ColumnsMoveRight(Selected)'))

WebDriver driver3 = DriverFactory.getWebDriver()

WebElement selectColumn3 = driver3.findElement(By.xpath('//*[(text() = \'Address > Record Permissions\' or . = \'Address > Record Permissions\')]'))

selectColumn3.click()

WebUI.click(findTestObject('Register Search and Advanced Options/ColumnsMoveRight(Selected)'))

WebUI.click(findTestObject('Register Search and Advanced Options/View/Page_Clue - Incident Register/SortExpand'))

WebUI.selectOptionByIndex(findTestObject('Register Search and Advanced Options/select_SortField'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Register Search and Advanced Options/select_SortField'), 'Address > Owner Team', 
    false)

WebUI.click(findTestObject('Register Search and Advanced Options/Filter/Add Filters/input_go'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Register Search and Advanced Options/Columns in View'), 3)

WebUI.delay(3)

