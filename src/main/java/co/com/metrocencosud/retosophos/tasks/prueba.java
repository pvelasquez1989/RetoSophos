package co.com.metrocencosud.retosophos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class prueba implements Task{


    private static ChromeDriver driver;


    private static String optionMaximizeWindow = "--start-maximized";
    private static String optionIgnoreCertificate = "--ignore-certificate-errors";
    private static final String  DRIVERROUTE= "webdriver.chrome.driver";
    private static final String  DRIVERPROPERTY= "src/test/resources/files/chromedriver.exe";

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.setProperty(DRIVERROUTE, DRIVERPROPERTY);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(optionMaximizeWindow);
        chromeOptions.addArguments(optionIgnoreCertificate);
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.metro.pe/especiales/cybermetro");
        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);

    }

    public static prueba Page(){
   return Tasks.instrumented(prueba.class);
    }
}