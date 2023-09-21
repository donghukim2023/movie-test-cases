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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://130.162.151.221')

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/h1_Movie List'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/div'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/a_'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_View Detail'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/img_Title_imgOne'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_, , -,'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_112'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_6'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/span_2023-02-08'), 
    30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Movie UI/Page_Movie Application  Movies/div_,'), 30)

WebUI.closeBrowser()

