package interview_questions;

public class Number_divisible_By_3_5_15 {

    public static void main(String[] args) {

        for(int i = 3; i <=100; i++){
            if(i%3==0 && i%5==0 && i%15==0){
                System.out.print(i+" ");
            }else if(i%3==0  && i%15!=0){
                System.out.print(i+" ");
            }else if(i%5==0 && i%15!=0){
                System.out.print(i+" ");
            }
        }

    }


}
