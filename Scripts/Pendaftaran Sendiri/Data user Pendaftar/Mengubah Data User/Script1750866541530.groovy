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

WebUI.waitForElementPresent(findTestObject('Halaman Pendaftaran Sendiri/User Page/Button Hapus Foto'), 0)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Button Hapus Foto'))

WebUI.uploadFile(findTestObject('Halaman Pendaftaran Sendiri/User Page/Button Upload'), foto)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Divisi Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Operational - KP'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Unit Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi AMEX MERCHANT'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Tipe Kontrak Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Mitra'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Posisi Kerja Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Acting Sales Head b'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jabatan Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Area Sales Manager'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Lokasi Kerja Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Damora'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Tipe Shift Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Shift'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jadwal Kerja Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi Admin Warung Bukalapak'))

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Selfie Field'))

WebUI.delay(1)

WebUI.click(findTestObject('Halaman Pendaftaran Sendiri/User Page/Opsi No Selfie'))

WebUI.clearText(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jumlah Cuti Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Halaman Pendaftaran Sendiri/User Page/Jumlah Cuti Field'), '2')

WebUI.click(findTestObject('Halaman Dashboard/Menu Management'))

WebUI.click(findTestObject('Halaman Dashboard/Opsi Management User'))

WebUI.waitForElementPresent(findTestObject('Halaman Management User Page/Field Search'), 0)

WebUI.setText(findTestObject('Halaman Management User Page/Field Search'), 'Kelompok')

WebUI.click(findTestObject('Halaman Management User Page/Button Search'))

WebUI.verifyElementText(findTestObject('Halaman Management User Page/Daftar nama'), 'Kelompok 5')

