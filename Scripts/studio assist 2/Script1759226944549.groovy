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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// Scenario 1: Login with Valid Credentials
// Navigate to the application URL.
WebUI.openBrowser('') // Replace with the application URL

// Verify application login page is displayed.
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')
// Enter username and password
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 'student')
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), 'Password123')

// Click the Login button
WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'))

// Verify user is redirected to the home/dashboard page
WebUI.verifyUrlContains('home/dashboard') // Replace with the actual URL segment of the home/dashboard

// Scenario 2: Login with Invalid Credentials
// Navigate to the application URL again.
WebUI.openBrowser('') // Replace with the application URL

// Verify application login page is displayed.
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), FailureHandling.STOP_ON_FAILURE)

// Enter username and invalid password
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 'student')
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), 'wrongPassword')

// Click the Login button
WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'))

// Verify error message is displayed
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/p_error_message')) // Replace with the actual error message Test Object
// Verify user remains on the login page
WebUI.verifyUrlContains('login') // Replace with the actual URL segment of the login page

// Close the browser
WebUI.closeBrowser()