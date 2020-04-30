package replits;

public class replit167_UniqueChar_method {
    public static void main(String[] args) {

        String str = "SantaClara";
        System.out.println(Uniques(str));
        System.out.println(uniqueChars(str));

    }
    public static String Uniques(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += "" + str.charAt(i);
            }
        }
        return result;
    }

    public static String uniqueChars(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

}
