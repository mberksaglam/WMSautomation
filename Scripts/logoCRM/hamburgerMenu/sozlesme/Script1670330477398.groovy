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

WebUI.callTestCase(findTestCase('logoCRM/girisEkrani/girisEkrani_login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenuCrm/yanMenuButon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/yanMenu-sozlesme'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-yenEkleButon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-coktanSecmeli'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-coktanSecmeli-silgiCheckbox'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-coktanSecmeli-tamam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-tanim'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-tanim2'), 'deneme soyad', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-firma'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-firma-ilkSira'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kisiGeriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozleme-yeni-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-satisTemsilcisi-test'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Tarih', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-grup'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kisiGeriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-tur'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kisiGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-asama'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-asama-baslangic'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-doviz'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-doviz-turkLirasi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-doviz-bilgilendirmeTamam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Sözleşme', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kullanicilaraBildir'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kullanicilaraBildir-begumCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kullanicalaraBildir-tamam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-incoterm'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-incoterm-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kaytTipi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-kayitTipi-none'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-sozlesmeTuru'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-sozlesmeTuru-danismanlik'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-yenilemeSwitch'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-yenilemeSwitch'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Adres', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-sozlesmeDurumu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-sozlesmeDurumu-devam'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-iliskiliFirsatlar'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-iliskiliFirsatlar-ilkSira'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-destekKaydi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-sozlesme/sozlesme-yeni-iliskiliFirsatlar-ilkSira'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

