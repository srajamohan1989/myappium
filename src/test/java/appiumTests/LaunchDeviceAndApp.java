package appiumTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchDeviceAndApp {

	public static AndroidDriver<AndroidElement> launchApp() throws Exception {
		// TODO Auto-generated method stub
		File f = new File("src/test/resources");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		/*
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6 Test device");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		*/
		cap.setCapability("deviceName", "Nexus 6 Test device");
		//Redmi real device udid -> 63aac6e3; Emulator Nexus 6 udid -> emulator-5554
		cap.setCapability("udid", "emulator-5554"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//cap.setCapability(MobileCapabilityType.APP, path);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		return driver;
	}
}
