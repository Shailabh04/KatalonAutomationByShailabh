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

WebUI.navigateToUrl('https://demo.applitools.com/')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME Demo App by Applitools/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME Demo App by Applitools/input_Password_password'), 
    'RAIVpflpDOg=')


WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME Demo App by Applitools/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_Credit cards'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_Debit cards'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/div_Customer_os-icon os-icon-chevron-down'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/a_Make Payment'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_Make Payment'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_View Statement'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/i_View Statement_os-icon os-icon-arrow-right4'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/i_Request Increase_os-icon os-icon-arrow-right4'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_Loans'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/a_Finance'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/span_Add Account'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/i_Mortgages_os-icon os-icon-ui-22'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/div_Customer_os-icon os-icon-chevron-down'))

WebUI.setText(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/input_text'), 'loan')

WebUI.sendKeys(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/input_text'), Keys.chord(
        Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/i_ACME_os-icon os-icon-mail-14'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/i_Payment Confirmation_os-icon os-icon-ui-46'))

WebUI.click(findTestObject('Object Repository/Demo Site 1 _ Bank Payment App/Page_ACME demo app/img'))

WebUI.closeBrowser()

