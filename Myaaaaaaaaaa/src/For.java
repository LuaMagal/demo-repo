import java.util.Random;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
Scanner scanner =  new Scanner(System.in);
Random num = new Random();
int  roll = 1;
do {
 System.out.println("1) Roll 1d20");
 System.out.println("2) Roll 1d4");
 System.out.println("3) Roll 1d6");
 System.out.println("4) Roll 1d8");
 System.out.println("5) Roll 1d10");
 System.out.println("6) Roll 1d12");
 System.out.println("0) stop");
 roll = scanner.nextInt();
 
 if(roll == 1){
 System.out.println();	 
 System.out.println("Your roll is " +num.nextInt(20));
 System.out.println();
 }else{
    	if(roll == 2){
    		System.out.println();
    		 System.out.println("Your roll is " + num.nextInt(4));
    		 System.out.println();}
    	else {
    		if(roll == 3){
    			System.out.println();
    			System.out.println("Your roll is " +num.nextInt(6));
    			System.out.println();
    		} else {
    			if(roll == 4){
    				System.out.println();
    				System.out.println("Your roll is " +num.nextInt(8));
    				System.out.println();
    			}else {
    				if(roll == 5) {
    					System.out.println();
    					System.out.println("Your roll is" +num.nextInt(10));
    					System.out.println();
    					
    				}else {
    					if (roll == 6) {
    						System.out.println();
    						System.out.println("Your roll is 6" +num.nextInt(12));
    						System.out.println();
    					}
    				}
    			}
    			
    		}
    		
    	}
        }
 }while(roll != 0);	
 scanner.close();  
 

       }  
	}
