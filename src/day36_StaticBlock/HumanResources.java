package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

    static {
        dev1.setInfo("Namik", "Developer", 120000, 1234);
        dev2.setInfo("Dilnaz", "SDET", 115000, 1124);
        dev3.setInfo("Kanjar", "SDET", 110000, 2828);
        dev4.setInfo("Muhtar", "Java teacher", 200000, 1111);
        dev5.setInfo("Ali", "Developer", 150000, 1919);

    }


}
