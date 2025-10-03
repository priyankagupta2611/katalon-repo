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

//* Write a Katalon Studio test case to perform the following steps.
 /*1. open browser to the URL stored in https://practicetestautomation.com/practice-test-login/
 2.Verify element text present HOME
 3.Click on HOME
 4.Close the browser*/
// Open browser to the URL stored in https://practicetestautomation.com/practice-test-login/
/*WebUI.openBrowser('https://practicetestautomation.com/practice-test-login/')
// Verify element text present HOME

WebUI.verifyTextPresent('HOME', false)
// Click on HOME

WebUI.click(findTestObject('Page_Contact  Practice Test Automation  Sel_b632b1/a'))
// Close the browser
WebUI.closeBrowser()*/

// Step 1: Open browser to the specified URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

// **Step 2: Verify that the element text 'HOME' is present
boolean isHomeTextPresent = WebUI.verifyTextPresent('HOME', false)
if (!isHomeTextPresent) {
	WebUI.comment('The text HOME is NOT present on the page.')
} else {
	WebUI.comment('The text HOME is present on the page.')
}

// Step 3: Click on the HOME link
WebUI.click(findTestObject('Page_Contact  Practice Test Automation  Sel_b632b1/a'))

// Step 4: Close the browser
WebUI.closeBrowser()


