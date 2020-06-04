package day47_abstract.RemoteWebBrowser;

public abstract class RemoteWebDriver {

    public String BrowserName;

    public abstract String get(String url);

    public abstract void quit();

    public abstract void maximize();


}
