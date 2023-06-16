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

WebUI.navigateToUrl('http://sampleapp.tricentis.com/101/')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Tricentis Vehicle Insurance/a_Automobile'))

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Engine Performance kW_kW'), 
    '4324')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Date of Manufacture_Date of Manufacture'), 
    '')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Date of Manufacture_Date of Manufacture'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Engine Performance kW_kW'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Date of Manufacture_Date of Manufacture'), 
    '04/04/2020')

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/select_please select                       _9e925e'), 
    'default', true)

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/select_please select                       _9e925e'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/select_please select                       _b55154'), 
    'Diesel', true)

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_List Price_List Price'), 
    '5000')

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)


WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_License Plate Number_License Plate Number'), 
    'LIC4638')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/input_Annual Mileage mi_Annual Mileage'), 
    '450')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Vehicle Data/button_Next'))

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_First Name_First Name'), 
    'first name')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Last Name_Last Name'), 
    'lastname')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Last Name_Last Name'))

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_First Name_First Name'), 
    'firstname')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/span_Male_ideal-radio'))

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/button_Date of Birth_Open Date of Birth Calender'))

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/a_6'))

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/button_Date of Birth_Open Date of Birth Calender'))

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Date of Birth_Date of Birth'), 
    '06/06/2000')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Street Address_Street Address'), 
    'street address')

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/select_please select AfghanistanAlbaniaAlge_c83022'), 
    'default', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/select_please select AfghanistanAlbaniaAlge_c83022'), 
    'Bangladesh', true)

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Zip Code_Zip Code'), 
    '23442')

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_City_City'), 
    'columbo')

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/select_please select                       _4c6253'), 
    'default', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/select_please select                       _4c6253'), 
    'Employee', true)

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/span_Speeding_ideal-check'))

WebUI.setText(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/input_Website_Website'), 
    'website.com')

WebUI.click(findTestObject('Object Repository/Tricentis Sample App Auto Insurance Automation/Page_Enter Insurant Data/button_Next'))

WebUI.closeBrowser()

