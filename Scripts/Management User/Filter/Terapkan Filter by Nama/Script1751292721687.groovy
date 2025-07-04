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

WebUI.callTestCase(findTestCase('Pre Test/Halaman Management User as Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Halaman Management User Page/Dropdown Nama'))

WebUI.delay(2)

WebUI.click(findTestObject('Halaman Management User Page/Opsi Nama'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.sendKeys(findTestObject('Halaman Management User Page/Field Search'), 'Kelompok 5')

WebUI.click(findTestObject('Halaman Management User Page/Button Search'))

WebUI.verifyElementText(findTestObject('Halaman Management User Page/Hasil  Flter Kelompok 5'), 'Kelompok 5')

WebUI.takeFullPageScreenshot()

