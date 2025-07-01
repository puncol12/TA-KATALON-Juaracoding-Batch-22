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

WebUI.callTestCase(findTestCase('Pendaftaran Sendiri/Buka halmanan pendaftaran sendiri'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Button view data kelompok 3 SQA22'))

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/NIK field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Email Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Divisi Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Unit Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Tipe Kontrak Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Posisi Kerja Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jabatan Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Lokasi Kerja Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Tipe Shift Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jadwal Kerja Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Selfie Field'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jumlah Cuti Field'), 0)

WebUI.takeFullPageScreenshot()

