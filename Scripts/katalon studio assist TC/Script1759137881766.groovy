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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/div_concat(Press , , Enter, ,  to skip to c_5f54e4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 'student')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), 
    'qkNN0R05SI5kDc2ygIIrEA==')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'))

WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), 'student')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_Logged In Successfully  Practice Test _c87e4f/a_Congratulations student. You successfully_69699c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Password_submit'), 
    0)

