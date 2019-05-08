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

WebUI.openBrowser("www.practiceselenium.com")

// pindah menu
WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Menu'))

// input data
WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__email'), "lukasfelano@gmail.com")
WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__name'), "Lukas Felano Nayoan")
WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__subject'), "Kesehatan Teh")
WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/textarea__message'), "Apakah ada teh yang bisa digunakan untuk diet?")

// end Input
WebUI.click(findTestObject('Object Repository/Page_Lets Talk Tea/input__form-submit'))

def email = WebUI.getAttribute(findTestObject('Object Repository/Page_Lets Talk Tea/input__email'),'value')
def name = WebUI.getAttribute(findTestObject('Object Repository/Page_Lets Talk Tea/input__name'),'value')
def subject = WebUI.getAttribute(findTestObject('Object Repository/Page_Lets Talk Tea/input__subject'),'value')
def text = WebUI.getAttribute(findTestObject('Object Repository/Page_Lets Talk Tea/textarea__message'),'value')

if (email.contains("@gmail.com")|| email.contains("@yahoo.com") ){

println("Input "+email +" is not valid")

}

else if(subject == null){
	subject = "Tea Fans" //default subject
}

else if (email == null || name == null || text == null){

println("Please input Data to send Message")

}

// close
WebUI.closeBrowser()