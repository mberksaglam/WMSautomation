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

Mobile.tap(findTestObject('WMS/uretimdenGiris/transferUrunToplama/urunToplamaPlanlanmis/anaSayfaTransferKutu'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transfer_SiparissizUrunTopKutu'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transfer_SiparissizDevamEdenIs_EklemeArti'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transfer_SiparissizDevamEdenIs_cariNK'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_ambarKutu'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_ambarMerkez0'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_ambar_TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/transfer_YerDeg_islemUrunBarkoduSimge'), 0)

Mobile.setText(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_urunBarkoduAraKutu'), 'ELMA', 0)

Mobile.tap(findTestObject('WMS/transferAmbarlarArası/transfer_yerDegistirme/YD2/transferYD_urunBarkoduAraButonu'), 0)

Mobile.tap(findTestObject('elmaDenemeKutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKaynakAdresSimge'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKaynakAdr_GR01'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKaynak-TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_islemKaydetKutu'), 0)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_cariNK_detayKutu'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/transferSiparissizUrunTop/transferSiparissiz_KaydetSon'), 0)

Mobile.tap(findTestObject('WMS/uretimdenGiris/transferUrunToplama/transferUrunToplama_kaydetGonderKutu'), 0)

Mobile.tap(findTestObject('WMS/uretimdenGiris/transferUrunToplama/transferUrunToplama_kaydetGonder-TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

