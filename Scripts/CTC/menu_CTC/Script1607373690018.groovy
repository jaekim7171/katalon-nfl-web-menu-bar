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

WebUI.verifyElementAttributeValue(findTestObject('Menu/img_menu_NFL'), 'href', 'https://www.nfl.com/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Scores'), 'href', 'https://www.nfl.com/scores/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Schedule'), 'href', 'https://www.nfl.com/schedules/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Video'), 'href', 'https://www.nfl.com/videos/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Teams'), 'href', 'https://www.nfl.com/teams/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Players'), 'href', 'https://www.nfl.com/players/', 0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Stats'), 'href', 'https://www.nfl.com/stats/player-stats/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Standings'), 'href', 'https://www.nfl.com/standings/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Pro Bowl Vote'), 'href', 'https://www.nfl.com/pro-bowl/ballot/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('SubMenu/link_subemnu_NFL Network'), 'href', 'https://www.nfl.com/network/watch/nfl-network-live?icampaign=net-nav-gnv-nfl_network_cta', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_NFL Films'), 'href', 'https://www.nfl.com/nfl-films/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Fantasy'), 'href', 'https://nfl-fantasy.smart.link/amlt9iran?site_id=ndc_nav&creative_id=2020_global_nav', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Tickets'), 'href', 'https://www.ticketmaster.com/nfl?wt.mc_id=NFL_LEAGUE_TICKETS_LINK&utm_source=NFL.com&utm_medium=client&utm_campaign=NFL_LEAGUE&utm_content=TICKETS_LINK', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Shop'), 'href', 'https://www.nflshop.com/?_s=bm-nflcom-2017-Header-Shop-Tab', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Menu/link_menu_Sign In'), 'href', 'https://www.nfl.com/account/sign-in', 
    0)

WebUI.click(findTestObject('Menu/menu_dots'))

