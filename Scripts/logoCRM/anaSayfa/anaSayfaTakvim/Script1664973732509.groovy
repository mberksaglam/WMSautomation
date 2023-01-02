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

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvimUploadButton'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_geriButon'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_ileriButon'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_yil2022ilk'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_yilDegistirme2021'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_yilDegistirme2021ikinci'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_yilDegistirme2022ikinci'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_ayDegisimiEkim'), 0)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_ayDegisimiCancel'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_11ekim'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_cancel11ekim'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_17ekim'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/anaSayfa_takvim/takvim_17ekimCancel'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CRM/yanMenuCrm/yanMenuButon'), 0)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('Object Repository/CRM/yanMenuCrm/yanMenu-cikisYap'), 0)

