package day49_Polymorphisim_Intro.warmUpTask;

public class iPhoneObjects {

    public static void main(String[] args) {
        iPhone iphone11 = new iPhone("11Pro", 1350, "small");
        iphone11.download();
        iphone11.calling(12345);
        iphone11.texting(6789);
        iphone11.faceTiming(12345);
        iphone11.selfie();
    }
}
