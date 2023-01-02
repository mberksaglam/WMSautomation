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

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/anaSayfa_transferKutu'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_yerDegistirme'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfeYerDegistirme_devamEden_EklemeKutuArti'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDegis_urunAdresSimge'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDegis_urunAdres_TAMAM'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDegis_urunAmbarKutu'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_AmbarMerkez0'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_AmbarTAMAMkutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDegis_urunAdresSimge'), 0)

Mobile.setText(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYD_araButonu2'), 'FRM1.GR.01-01', 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYD_adresAraButon'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_adres_FRM1.GR.01-01'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_adres-TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_islemUrunBarkoduSimge'), 0)

Mobile.setText(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_urunBarkoduAraKutu'), 'ELMA', 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_urunBarkoduAraButonu'), 0)

Mobile.tap(findTestObject('elmaDenemeKutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1000, 540, 1800)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_islemElma_BilgiAlan'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_islemElmaBilgi_TAMAM'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDeg_islemKaydetYuvarlak'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDeg_islemHedefAdresSimge'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDeg_islemHedefAdres_FrmTP0101'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYerDeg_hedefAdresTAMAMkutu'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_urunIslemKAYDETyazi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYD_detayKutu'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transferYD_urunKaydetSonSembol'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

