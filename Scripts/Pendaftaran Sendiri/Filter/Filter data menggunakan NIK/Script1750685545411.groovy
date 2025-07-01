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

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Dropdown button'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Dropdown NIK'))

WebUI.setText(findTestObject('Object Repository/Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Search Field'), 
    GlobalVariable.NIKTest)

WebUI.click(findTestObject('Object Repository/Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Button Search'))

WebUI.verifyElementText(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Hasil Filter NIK'), 
    'D7240022')

WebUI.takeFullPageScreenshot()

WebUI.clearText(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Search Field'))

WebUI.setText(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Search Field'), 'D8231347')

WebUI.click(findTestObject('Object Repository/Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Button Search'))

WebUI.verifyElementText(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Filter/Hasil Filter NIK'), 
    'D8231347')

WebUI.takeFullPageScreenshot()

