package day44_Exceptions;

public class Browser {
    /*
    openBrowser(): opens the default browser
	closeBrowser(): closes the default browser
     */

    void openBrowser() {
        System.out.println("Opening default browser");
    }

    public void closeBrowser() {
        System.out.println("Closing default browser");
    }
}

class Chrome extends Browser {

    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}

class Firefox extends Browser {

    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}

class Opera extends Browser {

    public void openBrowser() {
        System.out.println("Opening Opera Browser");
    }

    public void closeBrowser() {
        System.out.println("Closing Opera Browser");
    }
}

class Safari extends Browser{

}



