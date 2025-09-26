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

/*Test Case 1: Valid Credentials
Precondition: User is on the login page

Action: Enter valid username (standard_user) and password (secret_sauce)
Expected Result: User should be redirected to the inventory page successfully.*/

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open browser and navigate to the Sauce Demo login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

// Step 2: Enter valid username and password
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797509673/input_standard_userlocked_out_username'), 'standard_user')
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_1758797557258/input_standard_userlocked_out_password'), 'secret_sauce')

// Step 3: Click on the login button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_1758797588956/input_standard_userlocked_out_login button'))
/*TCID 002 
objejective ; Verify user with  valid login  credentials
;Precondition : User is on login page.Test 
steps:1 click on add to cart first product*/

// Step 1: Click on add to cart for the first product
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_29.99_btn_primary  add to cart'))