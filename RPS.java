import java.util.Scanner;

public class RPS

{

    public static void main(String[] args)

    {

        String userInput;

        int userChoice = -1, cpuChoice, timesWon = 0, timesLost = 0, timesTied = 0;

       boolean debug = false;

         

        Scanner kb = new Scanner(System.in);

        while( userChoice >= -1)

        {

            cpuChoice = (int)(Math.random() * 3);

             

            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");

            userInput = kb.next();



            if( userInput.equalsIgnoreCase("rock") || userInput.equalsIgnoreCase("r") )

                userChoice = 0;

            else if( userInput.equalsIgnoreCase("paper") || userInput.equalsIgnoreCase("p") )

                userChoice = 1;

            else if( userInput.equalsIgnoreCase("scissors") || userInput.equalsIgnoreCase("s") )

                userChoice = 2;

            else if( userInput.equalsIgnoreCase("debug") && debug == true)

                userChoice = 3;

            else

            {

                System.out.println("Invalid choice");

                break;

            }

             

            if( userChoice == 3) // Backdoor :)/>

                System.out.println("You won! You are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);

            else if( userChoice == 0 && cpuChoice == 0) // Rock v Rock

                System.out.println("You tied! Rock v Rock \nYou are: "+ +timesWon +":"+ timesLost +":"+ ++timesTied);

            else if( userChoice == 0 && cpuChoice == 1) // Rock v Paper

                System.out.println("You lost! Rock v Paper \nYou are: "+ +timesWon +":"+ ++timesLost +":"+ timesTied);

            else if( userChoice == 0 && cpuChoice == 2) // Rock v Scissors

                System.out.println("You won! Rock v Scissors \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);

            else if( userChoice == 1 && cpuChoice == 0) // Paper v Rock

                System.out.println("You won! Paper v Rock \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);

            else if( userChoice == 1 && cpuChoice == 1) // Paper v Paper

                System.out.println("You tied! Paper v Paper \nYou are: "+ timesWon +":"+ timesLost +":"+ ++timesTied);

            else if( userChoice == 1 && cpuChoice == 2) // Paper v Scissors

                System.out.println("You lost! Paper v Scissors \nYou are: "+ timesWon +":"+ ++timesLost +":"+ timesTied);

            else if( userChoice == 2 && cpuChoice == 0) // Scissors v Rock

                System.out.println("You lost! Scissors v Rock \nYou are: "+ timesWon +":"+ ++timesLost +":"+ timesTied);

            else if( userChoice == 2 && cpuChoice == 1) // Scissors v Paper

                System.out.println("You won! Scissors v Paper \nYou are: "+ ++timesWon +":"+ timesLost +":"+ timesTied);

            else if( userChoice == 2 && cpuChoice == 2) // Scissors v Scissors

                System.out.println("You tied! Scissors v Scissors \nYou are: "+ timesWon +":"+ timesLost +":"+ ++timesTied);

            else // Internal Error

            {

                System.err.println("Internal Error");

                break;

            }

             

            if(debug == true)

            {

           System.out.println("RAW INFO::userChoice=="+ userChoice +"::cpuChoice==="+ cpuChoice);

            
            }
             

            System.out.print("Play again(y/n)? ");

            userInput = kb.next();

             

            if( userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") )

            {

                continue;

            }

            else

            {

                break;

            }

        }

        kb.close();

    }

}
