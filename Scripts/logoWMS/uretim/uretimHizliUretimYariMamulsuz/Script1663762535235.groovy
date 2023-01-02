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

Mobile.tap(findTestObject('WMS/uretimEmri/anaSayfa_uretimKutu'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretimKutu'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_girisAmbari'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_merkez0'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretimTAMAM'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_cikisAmbari'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_cikisDeposu'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretimTAMAM'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_islem'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/hizliUretim/uretim_hizliUretim_urunBarkoduSimge'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim_mamulMaddeNeon'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim-girdiAdresiSembol'), 0)

Mobile.swipe(540, 1800, 540, 500)

Mobile.swipe(540, 1800, 540, 900)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim-frm1GR0101'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim-girdiAdresTAMAM'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim_lotNo'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('WMS/hizliUretim/hizliUretim_seriNo'), 'LOT123', 0)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim_kaydet'), 0)

Mobile.tap(findTestObject('WMS/hizliUretim/hizliUretim_sarfFireTAMAM'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

