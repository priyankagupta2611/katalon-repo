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

// Test Case ID: TC01_Verify_Login_Success
// Test Priority: High
// Preconditions: Valid account (username: standard_user, password: secret_sauce)
// Application URL: https://www.saucedemo.com/

// Step 1: Open browser and navigate to the Sauce Demo login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')
// Step 2: Enter valid username and password
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797509673/input_standard_userlocked_out_username'), 'standard_user')
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797557258/input_standard_userlocked_out_password'), 'secret_sauce')

// Step 3: Click on the login button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_1758797588956/input_standard_userlocked_out_login button'))
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/b navigator'))
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_About_logout'))
 
// Negative Scenarios
String[][] negativeLoginData = [
	["invalid_user", "secret_sauce"],
	["standard_user", "wrong_password"],
	["", ""],
	["standard_user", ""],
	["", "secret_sauce"]
/*
*  Define an array of username and password pairs representing negative login test cases
*
*  1. Include invalid username with valid password
*  2. Include valid username with incorrect password
*  3. Include empty username and empty password
*  4. Include valid username with empty password
*  5. Include empty username with valid password
*
*/
]

for (def data : negativeLoginData) {
	// Step 1: Open browser and navigate to the Sauce Demo login page
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://www.saucedemo.com/')
	
	// Step 2: Enter username and password from negative scenarios
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797509673/input_standard_userlocked_out_username'), data[0])
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797557258/input_standard_userlocked_out_password'), data[1])
	
	// Step 3: Click on Login button
	WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_1758797588956/input_standard_userlocked_out_login button'))
	
	// Verify expected error messages based on the credentials provided
	if (data[0] == "" && data[1] == "") {
		WebUI.verifyTextPresent('Epic sadface: Username is required', false)
	} else if (data[0] == "" && data[1] == "secret_sauce") {
		WebUI.verifyTextPresent('Epic sadface: Username is required', false)
	} else if (data[0] == "standard_user" && data[1] == "") {
		WebUI.verifyTextPresent('Epic sadface: Password is required', false)
	} else {
		WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)
	}
}

// Edge Case: Special characters as username
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797509673/input_standard_userlocked_out_username'), '#$%^&*')
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797557258/input_standard_userlocked_out_password'), 'secret_sauce')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_1758797588956/input_standard_userlocked_out_login button'))
WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)

// Close the browser
WebUI.closeBrowser()