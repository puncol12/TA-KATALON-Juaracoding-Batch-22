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

WebUI.click(findTestObject('Object Repository/HalamanUtama/MenuManagement'))

WebUI.click(findTestObject('Object Repository/HalamanUtama/SubMenuPendaftaranUser'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/HalamanPendaftaranUser/LogoUploadUser'), 'C:\\Users\\vitoa\\Katalon Studio\\WebHadirAbsensi\\test-data\\imagebiru.png')

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianNIK'), 'D6230547')

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianNamaKaryawan'), 'Atalia')

WebUI.setText(findTestObject('Object Repository/HalamanLogin/InputEmailLogin'), 'atal@admin.hadir')

WebUI.setEncryptedText(findTestObject('Object Repository/HalamanLogin/InputPasswordLogin'), 'S2AZ2CswOAOlQb1Nd5D/WQ==')

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianDivisi'), '123456')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_123456'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianUnit'), '123456')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_123456_1'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianPosisiKerja'), 'Admin Recruitment')

WebUI.click(findTestObject('HalamanPendaftaranUser/li_Admin Recruitment'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianJabatan'), 'staff 1')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Staff 1'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianAtasan'), 'd7231985')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_D7231985 - asdasd'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianAtasanClientV3'), '')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianAtasanClientV3'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Nama - Air Asia'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianTipeKontrak'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Magang'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianLokasiKerja'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_DIKA 1'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/DropDownNon Shift'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Non Shift'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianJadwalKerja'), 'Admin Warung Bukalapak')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Admin Warung Bukalapak'))

WebUI.click(findTestObject('HalamanPendaftaranUser/DropDownSelfie'))

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/li_Selfie'))

WebUI.setText(findTestObject('Object Repository/HalamanPendaftaranUser/KolomPengisianJumlahCuti'), '1')

WebUI.click(findTestObject('Object Repository/HalamanPendaftaranUser/ButtonSubmit'))

WebUI.delay(5)

WebUI.closeBrowser()

