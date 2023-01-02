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

Mobile.tap(findTestObject('WMS/kabul/giris_kabul'), 0)

Mobile.tap(findTestObject('WMS/kabul/giris_kabul_ekle'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nalkursan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nalkursan_ambar'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_ambar_merkez_0'), 0)

Mobile.tap(findTestObject('genel/TAMAM'), 0)

Mobile.tap(findTestObject('WMS/kabul/cariNk_girisKabul_islem/cari_nalkursan_islem_kutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/kabul/cariNk_girisKabul_islem/cari_nalkursan_islem_urunSimge'), 0)

Mobile.tap(findTestObject('WMS/kabul/cariNk_girisKabul_islem/cari_nk_islem_urun_malzeme01Kutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_urun_mal01_miktarArt'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_urun_mal01_miktarArt'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_urun_mal01_miktarArt'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_urun_mal01_miktarArt'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_urun_mal01_kayitTik'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_detay'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_ozet'), 0)

Mobile.tap(findTestObject('WMS/kabul/ambar/cari_nk_mal01/cari_nk_kaydetSon'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

