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

WebUiBuiltInKeywords.click(findTestObject('HomePage/MENU/STRATEGY_LINK'))

WebUI.waitForElementClickable(findTestObject('STRATEGY/TOPICS/TRENDING_LINK'), 15)

WebUiBuiltInKeywords.mouseOver(findTestObject('STRATEGY/TOPICS/TRENDING_LINK'))

WebUiBuiltInKeywords.click(findTestObject('STRATEGY/TOPICS/TRENDING_LINK'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('STRATEGY/TRENDING/LEADERBOARD_HEADER'), 10)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('STRATEGY/TRENDING/FILES_HEADER'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('STRATEGY/TRENDING/SOCIAL_HEADER'), 5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('STRATEGY/TRENDING/FEED_HEADER'), 5)

WebUI.callTestCase(findTestCase('SCREEN_VERIFICATION/SOCIAL/Verify if all elements are present in Social'), [:], FailureHandling.STOP_ON_FAILURE)

