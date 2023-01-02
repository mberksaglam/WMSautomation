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

Mobile.tap(findTestObject('WMS/millilestirme/giris_millilestirmeKutu'), 0)

Mobile.tap(findTestObject('WMS/millilestirme/millilestirme_devamEdenIsler_EkleKutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/millilestirme/ithalatOpFis_Nk349_yarimKutu'), 0)

Mobile.tap(findTestObject('genel/islemKutu2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/millilestirme/ithalatOpFis_Nk349_urunBarkoduSimge'), 0)

Mobile.tap(findTestObject('WMS/millilestirme/ithalatOpFis_Nk349_urunBarkoduElma'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/millilestirme/ithalatOpFis_Nk349_girisAmbarKutu'), 0)

Mobile.tap(findTestObject('WMS/millilestirme/Nk349_girisAmbar_Merkez0'), 0)

Mobile.tap(findTestObject('WMS/millilestirme/girisAmbar- TAMAM'), 0)

Mobile.tap(findTestObject('genel/Genel-KaydetButon'), 0)

Mobile.tap(findTestObject('WMS/millilestirme/millilestirme_CikisTusuKutu'), 0)

Mobile.tap(findTestObject('genel/islem_urun_temizleCikis_TAMAM'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

