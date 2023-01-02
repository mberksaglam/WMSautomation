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

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/yanMenu-firmalar'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ekleButonu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ekstraAlan'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ekstraAlan-kitapCheckbox'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-tamamButonu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-unvan'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-unvanAlani'), 'firma deneme', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Ana Sektör')

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-satisTemsilcisi2'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-saticTemsilcisi-test'), 0)

Mobile.scrollToText('Etiketler')

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-anaSektor'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-sektorler-Banka'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-altSektor'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-altSektor-BankaSatis'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-firmaRolu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-firmaRolleri-isOrtagi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-notlar'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-notlar2'), 'firma not', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-etiketler'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-etiketlerAlani'), 'firma etiket', 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu-Evet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSiraUcgen'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-adreslerArti'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-adreslerKapat'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-telefonlarArti'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-telefonDetay-turu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-telefonDetay-turu-fax'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-telefonDetay-ulkeKodu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-telefonDetay-ulke-geriTusu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu-Evet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-kisiEkleArti'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-yeniKisilerOlustur'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-kisiDetay-ad'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-kisiDetayi-ad2'), 'deneme1', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-kisiDetay-soyadi'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-kisiDetay-soyad2'), 'deneme2', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-kisiDetay-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu-Evet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-iliskiliKayitlar-aktiviteler'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-iliskiliKayitlar-aktiviteEkleArti'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-iliskiliKayitlar-aktivitelerEkle-yeniAktivite'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-iliskiliKayitlar-aktiviteDetay-konu'), 0)

Mobile.setText(findTestObject('CRM/tyanMenu-firmalar/firmalar-iliskiliKayitlar-aktiviteDetay-konu2'), 'konu1', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-iliskiliKayitlar-aktiviteDetay-kisi'), 0)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-ilkSira-aktivite-KisiGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/geriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/tyanMenu-firmalar/firmalar-geriTusu'), 0)

