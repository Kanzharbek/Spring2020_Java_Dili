package day47_abstract.RemoteWebBrowser;

public class ChromeDriver extends RemoteWebDriver {

    String  browserName = "Chrome";

    @Override
    public String get(String url) {
        return url;
    }

    @Override
    public void quit() {
        System.out.println("Quit " + browserName);
    }

    @Override
    public void maximize() { System.out.println("Maximize " + browserName); }
}
