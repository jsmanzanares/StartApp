import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('HomePage/MENU/KPI_LINK'))

WebUI.waitForElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_1YEAR_LINK'), 30)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_7DAYS_LINK'), 5)

WebUI.callTestCase(findTestCase('SCREEN_VERIFICATION/KPI/Verify if KPIs topics were displayed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_28DAYS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_90DAYS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_6MONTHS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_ALL_TIME_LINK'), 5)

WebUI.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_1YEAR_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_INTERACTIONS_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_VIEWS_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_ON_TRACK_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_NEEDS_ACTION_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_LATE_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_ACHIEVED_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_ON_TRACK_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_NEEDS_ACTION_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_LATE_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/COMPANY_DASHBOARD/COMP_ACHIEVED_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_7DAYS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_28DAYS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_90DAYS_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_6MONTHS_LINK'), 5)

WebUI.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_1YEAR_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_ALL_TIME_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_INTERACTIONS_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_VIEWS_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_ON_TRACK_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_NEEDS_ACTION_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_LATE_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_ACHIEVED_BUTTON'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_ON_TRACK_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_NEEDS_ACTION_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_LATE_LINK'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('KPI/DASHBOARD/ME_DASHBOARD/ME_ACHIEVED_LINK'), 5)

WebUI.callTestCase(findTestCase('SCREEN_VERIFICATION/SOCIAL/Verify if all elements are present in Social'), [:], FailureHandling.STOP_ON_FAILURE)

