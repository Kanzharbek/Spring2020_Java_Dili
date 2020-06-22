package day51_recap;

/*
        create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
 */
public interface Volume {

    boolean hasVolume = true;  // public, static, final

    double calculateVolume(); // public, abstract

}

interface PI {
    /*
    create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
     */
    double PI = 3.13;
}
