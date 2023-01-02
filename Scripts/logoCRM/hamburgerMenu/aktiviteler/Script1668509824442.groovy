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

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yanMenu-aktiviteler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/aktiveteler-ekleButonu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-konu'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-konu'), 'aktivite deneme', 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-firmaAlani'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-firmaCikisTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kisiler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kisiler-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-satisTemsilcisi-test'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-oncelik'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-oncelik-dusuk'), 0)

Mobile.scrollToText('Etiketler', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-durum'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-durum-aktif'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-tur'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-tur-eposta'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kategori'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kategori-ilkZiyaret'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kampanya'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kampanya-yeni'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-notlar'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-notlarKlavyeli'), 'not deneme', 0)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-etiketler'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-etiketlerKlavyeli'), 'etiket deneme', 0)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kullanicilaraBildir'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kullanicilaraBildir-begum-checkbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part1/yM-aktiviteler-kullanicilaraBildir-kaydet'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-ilkSira-ucgen'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-urunEkleArti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-urunEkle-listedenSec'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-urunler-ilkSira'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-mobilUrun'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-mobilUrun-geriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar-destekler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar-destekler-destekEkle'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar-destekler-destekEkle-listedenSec'), 
    0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar-destekKayit-ilkSira'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-iliskiliKayitlar-destekler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkDestek-genel'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkDestek-gorseller'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkDestek-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-gorevler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-gorevler-gorevEkle'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-gorevler-yeniGorev-listedenSec'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-gorevler-yeniGorev-ilkSira-test4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-gorevler-yeniGorev-test4'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkDestek-geriTusu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-takvim'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/part2/yM-aktiviteler-destekler-ilkDestek-geriTusu'), 0)

