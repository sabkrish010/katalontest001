
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import org.openqa.selenium.WebDriver



def static "cluepackage.pdfRead2.ReadPDF"(
    	String PDFURL	) {
    (new cluepackage.pdfRead2()).ReadPDF(
        	PDFURL)
}


def static "cluepackage.scrollTo.ScrollToText"(
    	String TextToScrollTo	) {
    (new cluepackage.scrollTo()).ScrollToText(
        	TextToScrollTo)
}


def static "cluepackage.fileupload.uploadFile"(
    	TestObject to	
     , 	String filePath	) {
    (new cluepackage.fileupload()).uploadFile(
        	to
         , 	filePath)
}


def static "cluepackage.ReadPdfFromBrowser.PdfReaderUtil"(
    	String html	
     , 	WebDriver driver	) {
    (new cluepackage.ReadPdfFromBrowser()).PdfReaderUtil(
        	html
         , 	driver)
}


def static "cluepackage.clickmethod.clickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new cluepackage.clickmethod()).clickUsingJS(
        	to
         , 	timeout)
}


def static "cluepackage.uploadattachments.uploadFile"(
    	TestObject to	
     , 	String filePath	) {
    (new cluepackage.uploadattachments()).uploadFile(
        	to
         , 	filePath)
}
