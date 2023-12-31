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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/i_Today_oxd-icon bi-stopwatch'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/span_Reports'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/a_Project Reports'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/i_Enabled_oxd-icon bi-check oxd-checkbox-in_111cd0'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/i_Enabled_oxd-icon bi-trash'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/i_Yes, Delete_oxd-icon bi-trash oxd-button-icon'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/span_Performance'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/a_Time'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/span_Magdalena Lozowska-Pereira kim'))

WebUI.click(findTestObject('Object Repository/Orange HRM Automation Demo/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

