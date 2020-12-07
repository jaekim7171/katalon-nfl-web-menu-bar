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

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Photos'), 'href', 'https://www.nfl.com/photos/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Super Bowl'), 'href', 'https://www.nfl.com/super-bowl/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Game Pass'), 'href', 'https://www.nfl.com/gamepass?icampaign=gpg-nav-gno-gamepass', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Salute to Service'), 'href', 'https://www.nfl.com/causes/salute/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Community'), 'href', 'https://www.nfl.com/community/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Inspire Change'), 'href', 'https://www.nfl.com/causes/inspire-change/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Hispanic Heritage'), 'href', 'https://www.nfl.com/causes/hispanic-heritage', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_NFL PRIDE'), 'href', 'https://www.nfl.com/causes/pride/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_Ways to Watch'), 'href', 'https://www.nfl.com/ways-to-watch/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_submenu_En Espaol'), 'href', 'https://www.foxdeportes.com/nfl/', 
    0)

