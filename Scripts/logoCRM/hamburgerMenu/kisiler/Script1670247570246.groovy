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

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/yanMenu-kisiler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-yenEkleButon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetay-ad'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetay-ad'), 'deneme ad', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetay-soyad'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetay-soyad'), 'deneme soyad', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-isUnvani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-isUnvanCikis'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Notlar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-firma'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-firmalar-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-satisTemsilcisi-test'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-anaSektor'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-sektorler-banka'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-kisiRolu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiRolleri-calisan'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-notlar'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-notlar2'), 'kişiler deneme', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-kisiDetayi-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu-Evet'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-ilkSira-ucgen'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-ilkSira-iliskiliKayitlar'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktivitelerEkleArti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteOlustur'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-konu'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-konu'), 'deneme konu', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-firma'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-firma-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-kisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-kisiCarpiTusu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-satisTemsilcisi-test'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-geriTamam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-urunlerEkleArti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-listedenSec'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-urunIlkSira'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-urunIlkSira (1)'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-ilkUrun-geriTusu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-urunlerIlkSira-silButonu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-urunler-silEvet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-ekleArti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-yenTeklifOlustur'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-tanim'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-tanim2'), 'deneme tanım', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-firma'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-teklifler-firma-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-kisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-kisiCarpiTusu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-satisTemsilcisi-test'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-kisiler/kisiler-iliskiliKayitlar-aktiviteler-geriTamam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

