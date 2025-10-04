import java.util.*;
public class LuckyNumber{
    public static void main(String[] args){
        Scanner lucky=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=lucky.nextInt();
        if(isLucky(number)){
            System.out.println(number+"is a lucky number!");
        }
        else{
            System.out.println(number+"is not a lucky number.");
        }
        
    }
    public static boolean isLucky(int num){
        //define lucky number criteria:divisible by 3 or 7
        return(num%3==0)||(num%7==0);
    }
}