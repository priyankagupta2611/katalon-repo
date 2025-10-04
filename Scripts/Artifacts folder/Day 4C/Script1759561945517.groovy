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

WebUI.callTestCase(findTestCase('Artifacts folder/Day 4B'), [:], FailureHandling.STOP_ON_FAILURE)
//* Write a Katalon Studio test case to perform the following steps.
 //1.. tick a Check box of Apply For hospital readmission
//2. Click on Visit Date select 25/10/2025 day by calender(not happening)
//3. Click on Comment type Emergency
//4.Click on Book Appointment 
// Tick the checkbox of Apply For hospital readmission

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_chk_box'))
// Click on Visit Date to open the calendar
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Visit Date (Required)'))
// Set the Visit Date to 25/10/2025 by sending keys directly to the input field
//WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)'), '25/10/2025')
// Click on Comment textarea and type Emergency
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_comment'), 'Emergency')
// Click on Book Appointment button
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_We Care About Your Health_btn-make-appointment'))