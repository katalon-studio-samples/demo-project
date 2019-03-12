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

Mobile.startApplication('kobiton-store:28005', true)

Mobile.tap(findTestObject('MobileApp/android.widget.Button0 - CREATE AN ACCOUNT'), 0)

Mobile.tap(findTestObject('MobileApp/android.widget.TextView0 - Create an Account'), 0)

Mobile.setText(findTestObject('MobileApp/android.widget.EditText0 - Email AddressPhone Number'), 'brian.ducson@gmail.com', 
    0)

Mobile.setText(findTestObject('MobileApp/android.widget.EditText1 - Password'), '@mypassword', 0)

Mobile.tap(findTestObject('MobileApp/android.widget.Button0 - SHOW'), 0)

Mobile.tap(findTestObject('MobileApp/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('MobileApp/android.widget.Button1 - SIGN UP'), 0)

Mobile.closeApplication()

