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

Mobile.tap(findTestObject('WMS/sayimFis/anaSayfaSayimKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_devamEdenler_eklemeKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_adresButon'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_onayTAMAM'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_AmbarKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarMerkez0'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarTAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunMalzeme01'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKaydet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_detayKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKaydetSon'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_devamEdenler_eklemeKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_AmbarKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarMerkez0'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarTAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunMalzeme01'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemTemizleKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemCikis-Temizle_TamamKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_sayfadanCikisSimge'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemCikis-Temizle_TamamKutu'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_devamEdenler_eklemeKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_AmbarKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarMerkez0'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_ambarTAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunKutu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemUrunMalzeme01'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemKaydet'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('WMS/sayimFis/sayim_islemCikis-Temizle_TamamKutu'), 0)

Mobile.swipe(900, 500, 300, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/sayimFis/sayimFisi_silButonu'), 0)

Mobile.tap(findTestObject('WMS/sayimFis/sayimFisi_silButonuTamam'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

