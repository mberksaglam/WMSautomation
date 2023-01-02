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

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_bildirimSimgesi'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_filtreler'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_filtrelerBildirimButonu'), 
    0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_bildirimlerIlkSira'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_ilkBildirimlkiliKayitlar'), 
    0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_geriButonu'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_filtreCarpiButonu'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_siralamaButon'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_bildirimEkrani/anaSayfaBildirimler_siralamaTanim'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/altMenu/altMenu_anaSayfa'), 0)

Mobile.tap(findTestObject('CRM/yanMenuCrm/yanMenuButon'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/yanMenuCrm/yanMenu-cikisYap'), 0)

