package day40_Encapsulation;

public class Credentials {

    private String UserName ;
    private String PassWord;

    public String getUserName(){
        return UserName;
    }

    public String getPassWord(){
        return PassWord;
    }

    public void setUserName(String UserName){
     this.UserName = UserName;
    }

    public void setPassWord(String Password){
        this.PassWord = Password;
    }
}

class CredentialsObject{

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        System.out.println(facebook.getUserName()); // null
        System.out.println(facebook.getPassWord()); // null

        facebook.setUserName("dilnaz"); // setting~initializing
        facebook.setPassWord("12345D"); // setting~initializing

        System.out.println(facebook.getUserName()); // dilnaz
        System.out.println(facebook.getPassWord()); // 12345D
    }
}