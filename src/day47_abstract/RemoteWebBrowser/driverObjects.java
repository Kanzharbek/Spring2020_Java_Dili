package day47_abstract.RemoteWebBrowser;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com");
        driver1.maximize();
        driver1.quit();

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.firefox.com");
        driver2.maximize();
        driver2.quit();

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com");
        driver3.maximize();
        driver3.quit();

        InternetExplorer driver4 = new InternetExplorer();
        driver4.get("https://www.internetexplorer.com");
        driver4.maximize();
        driver4.quit();
    }
}
