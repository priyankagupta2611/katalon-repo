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

// Start of the test case
WebUI.openBrowser('')

// Step 1: Open the specified URL
WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

// Step 2: Set Username
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Username_txt-username'), 'problem_user' // Change to the actual path if necessary
    )

// Step 3: Set Password
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Password_txt-password'), 'secret_sauce' // Change to the actual path if necessary
    )

// Step 4: Click Login Button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Login_btn-login') // Change to the actual path if necessary
    )

// Step 5: Verify login successful
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Products'), 10 // Change to the actual path in your repository for a successful login screen element
    )

// Step 6: Close the browser
WebUI.closeBrowser()

