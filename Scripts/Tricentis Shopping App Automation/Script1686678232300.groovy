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

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop/a_Computers'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Computers/img'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Desktops/input_Build it_button-2 product-box-add-to-_ba36b3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/select_2 GB                                _2cffd5'), 
    '17', true)

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/input_Microsoft Office  50.00_product_attri_560d4c'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/input_Qty_add-to-cart-button-16'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/input__product_attribute_16_3_6'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/input_Qty_add-to-cart-button-16'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Build your own computer/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart'))

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Shopping Cart/input_Zip  postal code_estimateshipping'))

WebUI.takeScreenshotAsCheckpoint('full_view', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Shopping Cart/div_Enter your destination to get a shippin_793931'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Shopping Cart/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '53', true)

WebUI.click(findTestObject('Object Repository/Tricentis Shopping App Automation/Page_Demo Web Shop. Shopping Cart/input_Zip  postal code_estimateshipping'))

WebUI.closeBrowser()

