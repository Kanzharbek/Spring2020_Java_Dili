package day47_abstract.RemoteWebBrowser;

public class OperaDriver extends RemoteWebDriver {

    String browserName = "Opera";

    @Override
    public String get(String url) {
        return url;
    }

    @Override
    public void quit() {
        System.out.println("Quit " + browserName);
    }

    @Override
    public void maximize() {
        System.out.println("Maximize " + browserName);
    }
}
