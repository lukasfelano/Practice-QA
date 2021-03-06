import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.practiceselenium.com/')

WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Menu/span_Check Out'))

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_E-mail_email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Name_name'), Name)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/textarea_Address_address'), address)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Check Out/select_Visa              Mastercard              American Express              Diners Club'), 
    type, true)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Card Number_card_number'), number)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Cardholder Name_cardholder_name'), holder)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Verification Code_verification_code'), code)

WebUI.click(findTestObject('Object Repository/Page_Check Out/button_Place Order'))

WebUI.closeBrowser()

