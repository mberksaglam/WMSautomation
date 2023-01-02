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

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresIslemleri'), 0)

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresislemi-AraAlani'), 0)

Mobile.setText(findTestObject('WMS/adresArama/adresislemi-AraAlani'), 'FRM1.SV.', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresIslemi-araButonu'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresIslemleri-ilkSira'), 0)

Mobile.delay(2)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.swipe(540, 1800, 540, 1000)

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresIslemleri-geriButonu'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/WMS/adresArama/adresIslemleri-araAlani-FRM1.SV'), 0)

Mobile.clearText(findTestObject('WMS/adresArama/adresIslemleri-araAlani-FRM1.SV'), 0)

Mobile.delay(2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('WMS/adresArama/adresIslemi-araButonu'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devamEdenIsler_yanSekmeButon'), 0)

Mobile.tap(findTestObject('WMS/devamEdenIslerAlani/devameEdenIsler_yanSekme_Anasayfa'), 0)

