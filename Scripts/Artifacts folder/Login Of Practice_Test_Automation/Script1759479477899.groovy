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
 2.Click on Username type student
 3.Click on Password type Password123
 4.click on Submit button*/

// Open browser to the specified URL
WebUI.openBrowser('https://practicetestautomation.com/practice-test-login/')
// Set text 'student' in the Username input field
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 'student')
// Set text 'Password123' in the Password input field
WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), 'Password123')
// Click on the Submit button
WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'))
