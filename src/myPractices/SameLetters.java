package myPractices;

public class SameLetters {

    public static void main(String[] args) {
        String a = "abc";
        String b = "bac";

        if(a.length()==b.length()){
            for (int i = 0; i < a.length(); i++){
                for (int j = 0; j < b.length(); j++){
                    if(a.charAt(i)==b.charAt(j)){
                        System.out.println(true);

                    }


                }
            }
        }



    }
}
