package helpers;

        import org.openqa.selenium.Platform;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.remote.RemoteWebDriver;

        import javax.crypto.Mac;
        import java.net.MalformedURLException;
        import java.net.URI;

public class InitBrowserDriver {
    private WebDriver driver;

    public WebDriver chromeDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("65.0");
        capabilities.setPlatform(Platform.ANY);
        capabilities.setCapability("enableVNC", true);

        try {
           driver = new RemoteWebDriver(
                    URI.create("http://localhost:4444/wd/hub").toURL(),
                    capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
       }
       return driver;
    }
}
