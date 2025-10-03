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

// Import required classes
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Test Case: Successful Login

// 1. Navigate to the login page
WebUI.openBrowser('')  // Replace with the application URL
WebUI.navigateToUrl('https://www.saucedemo.com/')

// 2. Enter valid username and password
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797509673/input_standard_userlocked_out_username'), 'standard_user') // Adjust the path to your username input field accordingly
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797557258/input_standard_userlocked_out_password'), 'secret_sauce') // Adjust the path to your password input field accordingly

// 3. Click on the login button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_1758797588956/input_standard_userlocked_out_login button')) // Adjust the path to your login button accordingly
// Click on the navigator (user dropdown)
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/b navigator'))  // Adjust the path accordingly to match your UI element for the user dropdown

// 6. Click on the logout button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_About_logout'))  // Adjust the path accordingly to match your UI element for the logout option


WebUI.closeBrowser()