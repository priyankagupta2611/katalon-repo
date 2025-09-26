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

// Step 1: Open the OrangeHRM login page
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

// Step 2: Maximize the browser window
WebUI.maximizeWindow()

// Step 3: Input username
WebUI.setText(findTestObject('Orange HCM objects/Page_OrangeHRM/input_Username_orangehcm'), 'Admin' // Replace with correct Test Object path
    )

// Step 4: Input password
WebUI.setText(findTestObject('Orange HCM objects/Page_OrangeHRM/input_Password_orangehcm'), 'admin123' // Replace with correct Test Object path
    )

// Step 5: Click the login button
WebUI.click(findTestObject('Orange HCM objects/Page_OrangeHRM/button_Password_login button' // Replace with correct Test Object path
        ))

WebUI.verifyTextPresent('asdf', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Orange HCM objects/Page_OrangeHRM/p_Upgrade_oxd-userdropdown-name'))

// Step 7: Logout
WebUI.click(findTestObject('Orange HCM objects/Page_OrangeHRM/a_Change Password_oxd- logout' // Replace with correct Test Object path
        ))

// Step 8: Close the browser
WebUI.closeBrowser()

