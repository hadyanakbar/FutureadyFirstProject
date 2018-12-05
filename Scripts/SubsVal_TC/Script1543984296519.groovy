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

WebUI.navigateToUrl('https://www.futuready.com/')

WebUI.click(findTestObject('SubsVal_OR/a_Masuk'))

WebUI.setText(findTestObject('SubsVal_OR/input_Masuk Futuready_email'), 
    'hadyantaris@outlook.com')

WebUI.setEncryptedText(findTestObject('SubsVal_OR/input_Masuk Futuready_password'), 
    'fdb7XptOiRBV7ErEd46qXQ==')

WebUI.click(findTestObject('SubsVal_OR/button_Masuk'))

WebUI.click(findTestObject('SubsVal_OR/button_Langganan'))

WebUI.click(findTestObject('SubsVal_OR/label_Data wajib diisi'))

WebUI.verifyElementPresent(findTestObject('SubsVal_OR/label_Data wajib diisi'), 
    0)

WebUI.closeBrowser()

