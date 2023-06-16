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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_Name_firstName'), 'firstname')

WebUI.setText(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_Name_lastName'), 'lastname')

WebUI.setText(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_Email_userEmail'), 'name@example.com')

WebUI.click(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/label_Male'))

WebUI.click(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/label_Female'))

WebUI.click(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/label_Male'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_(10 Digits)_userNumber'), '123456789')

WebUI.setText(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '13 Jun 2023')

WebUI.click(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2006', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/DemoQA Automation/Page_DEMOQA/div_11'))



WebUI.closeBrowser()

