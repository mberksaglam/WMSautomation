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

Mobile.tap(findTestObject('CRM/altMenu/altMenu-firmalar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_cokluDenemeOkTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_cokluDenemeOkTusu2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_firmalarArtiButonu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_firmalar_firmaDetayGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_firmalar_FirmaDetayCikis_Evet'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_kisiler'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_kisiler_yeni2Tusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_kisiler_yeni2Tusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_firmalarArtiButonu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_firmalar_firmaDetayGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_firmalar_FirmaDetayCikis_Evet'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktiviteler'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktiviteler13AralikTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktiviteler13AralikTusu2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktivitelerFiltre'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktivitelerFiltre_takvimGorunum'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktivitelerSiralama'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktiviteler_siralamaAktiviteTarihi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_aktivitelerTakvimGorunumuCarpiTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_teklifler'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_teklfler_ilkSıraKutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_genel'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_toplamlar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_onay'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayit_tarihce'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar_seceneklerUcNokta'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar_notlar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar_notlar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar_notlarGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/altMenu/altMenu_tekliflerIlkSira_iliskiliKayitlar_notlarGeriTusu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_anaSayfa'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/yanMenuCrm/yanMenuButon'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('Object Repository/CRM/yanMenuCrm/yanMenu-cikisYap'), 0)

