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

WebUI.navigateToUrl('https://ultimateqa.com/automation')

WebUI.click(findTestObject('Object Repository/UltimateQA Automation/Page_Automation Practice - Ultimate QA/a_Big page with many elements'))

WebUI.setText(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/input_Name_et_pb_contact_name_0'), 
    'Firstname')

WebUI.setText(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/input_Email Address_et_pb_contact_email_0'), 
    'email@')

WebUI.click(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/div_Section ofRandom Stuff'))

WebUI.setText(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/input_Sign up below to find out more_fields_f13576'), 
    'fname')

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/input_Sign up below to find out more_email_address'), 
    'emai.com')

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/UltimateQA Automation/Page_Complicated Page - Ultimate QA/span_Subscribe'))

WebUI.closeBrowser()

