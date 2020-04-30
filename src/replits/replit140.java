package replits;

import java.util.Scanner;

public class replit140 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("select image:");
        System.out.println("1)sunset");
        System.out.println("2)earth");
        System.out.println("3)desert");

        int n = scan.nextInt();

        if(n==1){
            printSunset();
        }else if(n==2){
            printEarth();
        }else if(n==3){
            printDesert();
        }else{
            System.out.println("Inavlid");
        }


    }

    public static void printSunset()
    {
        System.out.print("_\\/_                 |                _\\/_\r\n" +
                "/o\\\\             \\       /            //o\\\r\n" +
                " |                 .---.                |\r\n" +
                "_|_______     --  /     \\  --     ______|__\r\n" +
                "1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
    }//end print_sunset

    public static void printEarth()
    {

        System.out.print("22        _____\r\n" +
                "    ,-:` \\;',`'-, \r\n" +
                "  .'-;_,;  ':-;_,'.\r\n" +
                " /;   '/    ,  _`.-\\\r\n" +
                "| '`. (`     /` ` \\`|\r\n" +
                "|:.  `\\`-.   \\_   / |\r\n" +
                "|     (   `,  .`\\ ;'|\r\n" +
                " \\     | .'     `-'/\r\n" +
                "  `.   ;/        .'\r\n" +
                "jgs `'-._____.");

    }//print_earth

    public static void printDesert()
    {

        System.out.print(" 33   .    _    +     .  ______   .          .\r\n" +
                " (      /|\\      .    |      \\      .   +\r\n" +
                "     . |||||     _    | |   | | ||         .\r\n" +
                ".      |||||    | |  _| | | | |_||    .\r\n" +
                "   /\\  ||||| .  | | |   | |      |       .\r\n" +
                "__||||_|||||____| |_|_____________\\__________\r\n" +
                ". |||| |||||  /\\   _____      _____  .   .\r\n" +
                "  |||| ||||| ||||   .   .  .         ________\r\n" +
                " . \\|`-'|||| ||||    __________       .    .\r\n" +
                "    \\__ |||| ||||      .          .     .\r\n" +
                " __    ||||`-'|||  .       .    __________\r\n" +
                ".    . |||| ___/  ___________             .\r\n" +
                "   . _ ||||| . _               .   _________\r\n" +
                "_   ___|||||__  _ \\\\--//    .          _\r\n" +
                "     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" +
                "_  ^      .  -    . \\.|");

    }//end


}


