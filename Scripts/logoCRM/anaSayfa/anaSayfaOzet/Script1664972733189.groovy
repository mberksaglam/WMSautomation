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

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_YarinkiEtkinlikler'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_BugunkiEtkinlikler'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_GecerliligiBuHaftaBitenTeklifler'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_YaklasanKisiDogumGunleri'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_AksiyonBekleyenTeklifler'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_OnayBekleyenTeklifler'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_BitmemisGorevler'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_BuHaftaBitecekFirsatlar'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/anaSayfa_ozetBilgilerim/anaSayfaOzetBilgiler_UIgeriTusu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenuCrm/yanMenuButon'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/yanMenuCrm/yanMenu-cikisYap'), 0)

