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

Mobile.tap(findTestObject('WMS/anaSayfa_altButon/anaSayfaGirisKutu'), 0)

Mobile.tap(findTestObject('WMS/kabul/anaSayfa_siparisKabulButton'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/siparisKabul_devamEdenIsler_Ekle'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_checkBox'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/siparisli_islemler_urunAcmaButonu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('genel/islemKutu2'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_urunBarkoduSimge'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_urunBarkodu_Kiraz'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_urunBarkodu_kaytTikButonu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_detay'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_ozet'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_189/cariNk_189_sonKaydetButonu'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('denemeSiparisEkleme'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_188/cariNk_188_checkBox'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/siparisli_islemler_urunAcmaButonu'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('genel/islemKutu2'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_188/cariNk_188_urunBarkoduSimge'), 0)

Mobile.tap(findTestObject('WMS/siparisliKabul/cari_nk_188/cariNk_188_urunBarkoduSalkmD'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tapAtPosition(100, 1985)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('genel/islem_urun_temizleCikis_TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('genel/urun_direktCikis_okTusu'), 0)

Mobile.tap(findTestObject('genel/islem_urun_temizleCikis_TAMAM'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

