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
 //1. open browser to the URL stored in https://practicetestautomation.com/practice-test-exceptions/
/*2.Click Add button
3.Wait for the second row to load
4.Type text into the second input field
5.Push Save button using locator By.name(“Save”)
6.Verify text saved*/

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By as By
import com.kms.katalon.core.testobject.TestObject as TestObject

// Open browser to the URL stored in https://practicetestautomation.com/practice-test-exceptions/
WebUI.openBrowser('https://practicetestautomation.com/practice-test-exceptions/')

// Click Add button
WebUI.click(findTestObject('Object Repository/Page_Test Exceptions  Practice Test Automation/button_Save_add_btn'))

// Wait for the second row to load by waiting for the input field in the second row to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/exception/Page_Test Exceptions  Practice Test Automation/input_Row 1_text field'), 10)

// Type text into the second input field
// Create a TestObject for the second input field using By.xpath or By.cssSelector
TestObject secondInputField = new TestObject()
secondInputField.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '(//input[@type="text"])[2]')
WebUI.setText(secondInputField, 'Sample text')

//*****************not working from here***************************//
// Push Save button using locator By.name("Save")
// Create a TestObject for the Save button by name attribute
TestObject saveButton = new TestObject()
saveButton.addProperty('name', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'Save')
WebUI.click(saveButton)

// Verify text saved by checking the value of the second input field
String savedText = WebUI.getAttribute(secondInputField, 'value')
WebUI.verifyMatch(savedText, 'Sample text', false)


