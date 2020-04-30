package day29_Wrapper_ArrayList;

public class parseMethod {

    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str); // 123

        System.out.println(str+1); // 1231
        System.out.println(a1+1);  //124

        byte b1 = Byte.parseByte(str);
        System.out.println(b1); // 123

        Byte B1 = b1;
        System.out.println(B1 + " is Byte Wrapper Class");

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        double d1 = Double.parseDouble(str2);
        System.out.println(f1+1);
        System.out.println(d1+2);

        String str3 = "3147483647";
        long l1 = Long.parseLong(str3); // 3147483647L
        System.out.println(l1+10);

        Long l2 = Long.parseLong(str3);
        System.out.println(l2+2);

        String result1 = "true"; // boolean' default value is "false"
        boolean a = true;
        boolean b = Boolean.parseBoolean(result1);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(!b);




    }
}
