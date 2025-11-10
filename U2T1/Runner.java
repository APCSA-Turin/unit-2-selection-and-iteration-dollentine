import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!

     int randomNum = (int)(Math.random() * 6) + 1;
     if (randomNum == 1) {
        System.out.println ("It is certain!"); 
     } 
     
     if (randomNum == 2) {
        System.out.println("Reply hazy, try again!"); 
     } 
    
     if (randomNum == 3) {
        System.out.println ("Yes!"); 
     } 
     
     if (randomNum == 4) {
        System.out.println("Don't count on it"); 
     }
     
     if (randomNum == 5) {
        System.out.println("My reply is a no"); 
     } 
     
     if (randomNum == 6){ 
        System.out.println ("Cannot predcit now"); 
     }
   }

}
