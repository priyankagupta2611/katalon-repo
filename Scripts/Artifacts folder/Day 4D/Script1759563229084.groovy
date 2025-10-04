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

/* Write a Katalon Studio test case to perform the following steps.
 1. open browser to the URL stored in https://the-internet.herokuapp.com/login
 2.Click on Username type tomsmith
 3.Click on Password type SuperSecretPassword!
 4.click on Submit button*/
// Open browser to the URL https://the-internet.herokuapp.com/login
WebUI.openBrowser('https://the-internet.herokuapp.com/login')

// Set text 'tomsmith' in the Username input field
WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Username_username'), 'tomsmith')

// Set text 'SuperSecretPassword!' in the Password input field
WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Password_password'), 'SuperSecretPassword!')

// Click on the Submit button (sign in icon)
WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/i_Password_fa fa-2x fa-sign-in'))
