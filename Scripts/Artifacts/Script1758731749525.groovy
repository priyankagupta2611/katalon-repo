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

// Step 1: Open browser and navigate
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')

// Step 2: Valid Login
WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/h4_Login Page_subheader'))

WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Username_username'), 'tomsmith')

WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/h4_Login Page_subheader'))

WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Password_password'), 'SuperSecretPassword!')

WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/i_Password_fa fa-2x fa-sign-in'))

// Step 3: Verify Secure Area
WebUI.verifyElementText(findTestObject('Object Repository/page the internet/Page_The Internet/h2'), 'Secure Area')

WebUI.comment('Valid login successful')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/page the internet/Page_The Internet/a_Welcome to the Secure Area. When you are _85f6bb'))

WebUI.delay(2)

WebUI.delay(2)

// Step 4: Logout
WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/i_Welcome to the Secure Area. When you are _8fc17e'))

// step 5:invaild credentials
WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/h4_Login Page_subheader'))

WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Username_username'), 'wrongsmith')

WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/h4_Login Page_subheader'))

WebUI.setText(findTestObject('Object Repository/page the internet/Page_The Internet/input_Password_password'), 'SecretPassword!')

WebUI.click(findTestObject('Object Repository/page the internet/Page_The Internet/i_Password_fa fa-2x fa-sign-in'))

WebUI.comment('inValid login successful')

