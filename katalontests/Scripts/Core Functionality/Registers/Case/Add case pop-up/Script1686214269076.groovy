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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.Random as Random
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

List elements = WebUiCommonHelper.findWebElements(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/select_Status(Case Pop-up)'), 
    30)

WebElement randomElement = elements.get(new Random().nextInt(elements.size()))

System.out.println(randomElement)

randomElement.click()

List elements1 = WebUiCommonHelper.findWebElements(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/select Type(Case Pop-up)'), 
    30)

println("Found $elements1.size() elements1!")

WebElement randomElement1 = elements1.get(new Random().nextInt(elements1.size()))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/select Type(Case Pop-up)'), Keys.chord(
        'randomElement1', Keys.ARROW_DOWN, Keys.ENTER))

'Set the Status to Open'
WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/Reference(Case Pop-up)'), 'PTA/2018/01234/B1', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/Summary(Case Pop-up)'), 'Case summaries are documents written to outline the decisions made in a court of justice. In the summary, key points and aspects about the case are jotted down to help keep a reference and to enhance understanding a court’s order. The templates are significant in simplifying the case narrations for anyone to comprehend. A case summary always has a citation as the heading which indicates the parties involved, the date of processing the event in court, the place the decision over the case was made and sometimes reference sources such as the internet. ')

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/StartDate(Case Pop-up)'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/CloseDate(Case Pop-up)'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/Reference(Case Pop-up)'), 'QB/2018/0123', 
    FailureHandling.OPTIONAL)

'Save the Case record'
WebUI.enhancedClick(findTestObject('Core Functionality/Registers/Case/Add Case Pop-Up/Save(Case Pop-up)'))

WebUI.delay(2)

