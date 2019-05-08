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

// open browser
WebUI.openBrowser('www.practiceselenium.com')

// pindah menu
WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Menu'))

// pilih produk
WebUI.click(findTestObject('Object Repository/Page_Menu/span_Check Out'))

// input data
WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_E-mail_email'), 'lukasfelano@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Name_name'), 'Lukas Felano Nayoan')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/textarea_Address_address'), 'Jalan Pramuka no 1, Bantul')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Check Out/select_Visa              Mastercard              American Express              Diners Club'), 
    'Visa', true)

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Card Number_card_number'), '4023839282959002')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Cardholder Name_cardholder_name'), 'Lukas Felano N')

WebUI.setText(findTestObject('Object Repository/Page_Check Out/input_Verification Code_verification_code'), '928491')

def email = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/input_E-mail_email'),'value')
def name = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/input_Name_name'),'value')
def address = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/textarea_Address_address'),'value')
def typeVisa = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/select_Visa              Mastercard              American Express              Diners Club'), 
,'value')
def number = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/input_Card Number_card_number'),'value')
def holder = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/input_Cardholder Name_cardholder_name'),'value')
def verifyCard = WebUI.getAttribute(findTestObject('Object Repository/Page_Check Out/input_Verification Code_verification_code'),'value')

if (email.contains("@gmail.com")|| email.contains("@yahoo.com") ){

println("Input "+email +" is not valid")

}

else if (txt== null || name== null || address== null || typeVisa== null || number== null || holder== null || verifyCard== null){

println("Please input All Data")

}

// end Input
WebUI.click(findTestObject('Object Repository/Page_Check Out/button_Place Order'))

// close
WebUI.closeBrowser()

