package MobileProgrammingLLC.PageLibraries;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_WebViewPage {
	public UiCatalog_WebViewPage(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='http://apple.com']") IOSElement UrlTF;
	public IOSElement getUrlTF() {
		return UrlTF;
	}
	
	@iOSFindBy(className="XCUIElementTypeStaticText") List<IOSElement> SteppersStaticTFs;
	public List<IOSElement> getSteppersStaticTFs(){
		return SteppersStaticTFs;
	}

	@iOSFindBy(accessibility="Clear text") IOSElement ClearTextIcon;
	public IOSElement getClearTextIcon() {
		return ClearTextIcon;
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='Enter an address']") IOSElement BlankUrlTF;
	public IOSElement getBlankUrlTF() {
		return BlankUrlTF;
	}
}
