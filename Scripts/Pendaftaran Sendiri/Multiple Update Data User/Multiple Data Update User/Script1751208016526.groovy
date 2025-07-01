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

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Check Box User Kelompok 3 SQA22 v2 (1)'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management User Page/Check Box User Yanwar'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Button Multiple Update dichecklist'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Divisi Multiple Update'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi 123456'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Posisi Kerja'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi Admin Support JC'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Jabatan Multiple Data'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi staff 2'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Tipe Kontrak Multiple Data'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi Mitra'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Lokasi Kerja Multiple Data'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi DIKA 1'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Jadwal Kerja Multiple Data'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi BCA Life'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Input Selfie Multiple Data'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Opsi Selfie'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/Management Pendaftaran Sendiri/Multiple Data/Button Submit Multiple Data'))

