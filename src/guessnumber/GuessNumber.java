
package guessnumber;
import java.util.Scanner;


public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Guess the number!");
        Scanner input=new Scanner(System.in);
        
        int sum=0;
        int guessing=0;
        
        
        int num1=45;
        while(true){
            
            int num=Integer.parseInt(input.nextLine());
            sum+=num;
            guessing++;
            
          
        if(num==45){
            System.out.println("Correct!" + " " + guessing);
            break;
        }
            
        if(num<45){
            System.out.println("The number is greater");
            
        }else if(num>45){
            System.out.println("The number is lesser");
            
        }

            
        }
       
        }
   
    }



