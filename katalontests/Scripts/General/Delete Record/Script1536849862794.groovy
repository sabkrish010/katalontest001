import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('General/Delete Record (Press Delete Button)/input_delete'), FailureHandling.OPTIONAL)

'Wait for the \'Confirmation\' box to appear'
WebUI.waitForElementVisible(findTestObject('General/Delete Record (Press Delete Button)/span_Please Confirm'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('General/Delete Record (Press Delete Button)/span_OK'), FailureHandling.STOP_ON_FAILURE)


WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'Verify Spinner is not present.'
WebUI.waitForElementNotPresent(findTestObject('Core Functionality/Shared Record Functions/loader'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

