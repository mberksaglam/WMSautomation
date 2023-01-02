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

Mobile.tap(findTestObject('WMS/uretimEmri/uretim_uretimEmriKutu'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis863Kutu'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_girdiAdresSimge'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_ciktiAdr_FRM1-TP0101'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_TAMAM'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_ciktiAdrSimge'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_ciktiAdr_FRM1-TP0101'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis893_ciktiAdr_Tamam'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis893_LotKutu'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('WMS/uretimEmri/uretimEmri_893fis_LotKutu'), 'LOT1', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/uretimEmri/UretimEmriLotlu_KaydetKutu_lotNoSonras'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmriLotlu_takiNoKutu'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmriLotl_lotSecimi_CheckBox'), 0)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmriLotlu_lotSecimi_Miktar'), 0)

Mobile.setText(findTestObject('WMS/uretimEmri/uretimEmriLotlu_lotSecimi_Miktar'), '375', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_sarfFire-TAMAM'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_fis122_sarfFire-TAMAM'), 0)

Mobile.delay(33, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('WMS/uretimEmri/uretimEmri_cikisAnaSayfaya'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

