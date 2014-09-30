import java.util.Scanner;

public class Lab8 {

public static void main(String[] args) {

  Scanner inp = new Scanner( System.in );

  int userNum;

  int computerNum;
  
  String answer = inp.nextLine();
  System.out.print("Do you want to continue Y/N: ");
  switch (answer)
  {
   case "Y":
   case "y":
   computerNum = 0 + (int) ( Math.random() * 10 );

   System.out.println ("Enter a number between 0 and 10");

   userNum = inp.nextInt();

   System.out.printf("Random number is %d\n", computerNum );

   if (userNum > computerNum) 
   { 
    System.out.println ("Too big");
   }

   else if (userNum < computerNum) 
   { 
     System.out.println ("Too Small");

    }

    else { System.out.println ("Match");

     }
   
          break;
    
   case "N":
   case "n":  System.out.println("Bye!");
         break;
   
  default :
	System.out.println("invalid choice");
        break;

  }

 }

}
