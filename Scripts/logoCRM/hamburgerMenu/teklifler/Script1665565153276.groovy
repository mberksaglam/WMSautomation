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

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/yanMenu-teklifler'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-ekleButonu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-coktanSecmeliAlan'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-coktanSecmeli_SilgiCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-coktanSecmeli-silgi-Tamam'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-AnaTeklifAlani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-anaTeklif-iptal'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-tanim'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-tanim'), 'deneme1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firmaAlani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firmalarIlkSira'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firmaCarpiIsareti'), 0)

Mobile.scrollToText('Grup', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-oncelikAlani (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-oncelikNormal'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1000, 540, 1800)

Mobile.swipe(540, 1000, 540, 1800)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firmaArti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firma-ekdtraAlanTestAlani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firma-ekstraAlan-kitapCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firma-ekstraAlan-Tamam'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firma-unvanAlani'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firma-unvanAlani'), 'firmaDeneme', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/geriTusu'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-aktiviteler/geriCikis-Evet'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kisiAlan'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kisiler-CikisIsareti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-lsatisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-satisTemsilcisi-tulayDag'), 0)

Mobile.scrollToText('Tür', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-grup-bastanUcuncuYerdeDurdugunda'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kisiler-CikisIsareti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-tur-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kisiler-CikisIsareti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-asama-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-asama-Baslangic'), 0)

Mobile.scrollToText('Notlar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-dovizKuru-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-dovizIptal'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-dovizIptal-Tamam'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-notlat-enSon'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-notlarAlan-enSon'), 'not deneme', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kampanyaEnSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kampanyalar-yeni'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kullanicilaraBildir-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kullanicilaraBildir-begumCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kullanicilaraBildir-Tamam'), 0)

Mobile.scrollToText('Sözleşme türü', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-incoterm-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-incoterm-carpi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kayit-tipi-enSon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-kayitTipi-none'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-sozlesme-switch-enSon'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-sozlesme-switch-enSon'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/tekliflerKayitlilar-ilkSira-676'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-teklifOzeti-yeniUrunEkleButon'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-teklifOzet-yeniUrunEkleme-UrunAlani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-yeniUrunEkleme-Urunler-ilkSiraCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-yeniUrunEkle-urunler-ikinciSiraCheckbox'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-teklifOzeti-urunEkle-ikinciUrun'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-teklifOzet-urunEkle-ikinciUrun-miktarDegistir'), 
    0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/urunMiktar-degistir-arti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/urunMiktar-degistir-arti'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/urunMiktarDegistir-eksi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/urunMiktarDegistir-Onayla'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-yeniUrunEkleme-urunler-Tamam'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzeti-ilkUrun'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzetiIlkUrun-satirTuru'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifDetay-ilkUrun-satirTr-Malzeme'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-anaTeklif'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-anaTeklif-iptal'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-anaUrun-switch'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-anaUrun-switch'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-opsiyonel-switch'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-opsiyonel-switch'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-birimAlani'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzet-ilkUrun-birim-Adet'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-urunler-dovizKuru'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-urunler-dovizTuru-dolar'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-urunler-dovizKuru-TamamAlani'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-urunler-indirimTuru'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifler-urunler-indirimTuru-brutIndirim'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklif-ozet-genel'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklif-ozet-toplamlar'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklif-ozet-onay'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklif-ozet-iliskiliKayitlar'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-iliskiliKayitlar-revizeler'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-aktivitelerButonu'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-aktiviteler-AktivitelerEkle'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-aktiviteler-yeniAktivite'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-aktiviteKonu'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-aktiviteKonu'), 'aktivite deneme', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-kisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-kisi-ilkSira'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-satisTemsilcisi'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-yeniAktivite-satisTemsilcisi-test'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-formlarButon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeri-ucNokta'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-ucNokta-formHazirla'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifOzeti-formHazirla-denemeTeklif'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-formHazirla-formlar-notlar'), 0)

Mobile.setText(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-formHazirla-formlar-notlar'), 'deneme form', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/yeniTeklifPart/teklifler-firmaDetay-Kaydet'), 0)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-formHazirla-formlar-kaydet-Goster'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CRM/yanMenu-Teklifler/kayitliTeklif/teklifozeti-formHazirla-formlar-formuGoster-geriTusu'), 0)

