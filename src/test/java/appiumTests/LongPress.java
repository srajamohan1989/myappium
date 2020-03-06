package appiumTests;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class LongPress extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver = launchApp();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
	//TAP on Element
	WebElement customAdaptor = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
	TouchAction tap = new TouchAction(driver);
	tap.tap(tapOptions().withElement(element(customAdaptor))).perform();
	
	//LONGPRESS on element
	//tap.longPress(longPressOptions().withElement(element(customAdaptor)).withDuration(ofSeconds(2))).release().perform();
	WebElement peopleName = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	tap.longPress(longPressOptions().withElement(element(peopleName)).withDuration(ofSeconds(2))).release().perform();
	System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).isDisplayed());
	}
}
