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

WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Lets Talk Tea'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__name'), 'lukas')

WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__email'), 'lukasfelano@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/input__subject'), 'tanya')

WebUI.setText(findTestObject('Object Repository/Page_Lets Talk Tea/textarea__message'), 'apakah ada teh tuk diet?')

WebUI.click(findTestObject('Object Repository/Page_Lets Talk Tea/input__form-submit'))

WebUI.closeBrowser()

