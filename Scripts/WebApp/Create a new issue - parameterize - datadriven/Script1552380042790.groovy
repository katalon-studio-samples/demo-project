import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://id.atlassian.com/login?continue=https%3A%2F%2Fkatalon.atlassian.net%2Flogin%3FredirectCount%3D1')

WebUI.setText(findTestObject('Object Repository/WebApp/Page_Log in to continue - Log in with Atlassian account/input_Email_username'), 
    GlobalVariable.username)

WebUI.click(findTestObject('Object Repository/WebApp/Page_Log in to continue - Log in with Atlassian account/span_Continue'))

WebUI.setText(findTestObject('Object Repository/WebApp/Page_Log in to continue - Log in with Atlassian account/input_Email_username'), 
    GlobalVariable.username)

WebUI.click(findTestObject('Object Repository/WebApp/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/WebApp/Page_Sign in to your account/input_Enter password_passwd'), 
    GlobalVariable.encrypted_password)

WebUI.click(findTestObject('Object Repository/WebApp/Page_Sign in to your account/input_Forgot my password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/WebApp/Page_Sign in to your account/input_concat(Don  t show this again)_idSIButton9'))

WebUI.scrollToElement(findTestObject('Object Repository/WebApp/Page_System dashboard - Jira/h1_System dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/WebApp/Page_System dashboard - Jira/h1_System dashboard'), homepage_title)

WebUI.click(findTestObject('Object Repository/WebApp/Page_System dashboard - Jira/button_Dashboards_createGlobalItem'))

WebUI.setText(findTestObject('Object Repository/WebApp/Page_Create issue - Jira/input_Required_summary'), issue_sum)

WebUI.setText(findTestObject('Object Repository/WebApp/Page_Create issue - Jira/textarea_Lock  Unlock_description'), issue_desc)

WebUI.click(findTestObject('Object Repository/WebApp/Page_Create issue - Jira/input_Create another_Edit'))

WebUI.click(findTestObject('Object Repository/WebApp/Page_System dashboard - Jira/a_PAR-5 - This is my issue'))

WebUI.verifyElementText(findTestObject('Object Repository/WebApp/Page_PAR-5 This is my issue - Jira/h1_This is my issue'), 
    issue_sum)

WebUI.verifyElementText(findTestObject('Object Repository/WebApp/Page_PAR-5 This is my issue - Jira/p_It needs to be fixed asap'), 
    issue_desc)

WebUI.closeBrowser()

