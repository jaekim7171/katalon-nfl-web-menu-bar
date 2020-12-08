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

WebUI.comment('Open browser and close browser set in Test Listeners')

WebUI.comment('Desired Capabilities set for headless browser screen size')

WebUI.comment('Chrome not able to run multiple Call Test Cases. Maybe issue with Katalon 7.8')

WebUI.comment('Works in Firefox, Edge Chromium, Headless Chrome, Headless Firefox')

WebUI.navigateToUrl(GlobalVariable.BaseURL)

WebUI.callTestCase(findTestCase('shared'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Place due to home page not loading sometimes.'
if (WebUI.waitForPageLoad(GlobalVariable.WaitShort, FailureHandling.CONTINUE_ON_FAILURE) == false) {
    WebUI.refresh()

    WebUI.waitForPageLoad(GlobalVariable.WaitLong)

    WebUI.delay(GlobalVariable.DelayShort)
}

'Placed due to alert not displaying in headless firefox'
if (WebUI.verifyElementVisible(findTestObject('btn_home_alert_no_thanks'), FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('btn_home_alert_no_thanks'))

    WebUI.verifyElementNotPresent(findTestObject('btn_home_alert_no_thanks'), 0, FailureHandling.STOP_ON_FAILURE) == true
}

WebUI.callTestCase(findTestCase('CTC/menu_CTC'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CTC/submenu_CTC'), [:], FailureHandling.CONTINUE_ON_FAILURE)

