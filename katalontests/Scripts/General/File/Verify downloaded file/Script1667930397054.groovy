import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
 
'Define Custom Path where file needs to be downloaded'
String downloadPath = 'C:\\Users\\PrasadB\\Downloads' 


'Verifying the file is download in the User defined Path'
Assert.assertTrue(isFileDownloaded(downloadPath, 'Animal Welfare.pdf'), 'Failed to download Expected document')
 
boolean isFileDownloaded(String downloadPath, String fileName) {
	long timeout = 5 * 60 * 05
	long start = new Date().getTime()
	boolean downloaded = false
	File file = new File(downloadPath, fileName)
	while (!downloaded) {
		KeywordUtil.logInfo("Checking file exists ${file.absolutePath}")
		downloaded = file.exists()
		if (downloaded) {
			file.delete() // remove this line if you want to keep the file
		} else {
			long now = new Date().getTime()
			if (now - start > timeout) {
				break
			}
			Thread.sleep(30)
		}
	}
	return downloaded
}