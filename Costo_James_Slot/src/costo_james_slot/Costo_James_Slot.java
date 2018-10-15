package costo_james_slot;
import java.util.Scanner;
import java.util.Random;

/*
Assignment/Project Title: Slot Machine Simulation (Chpt_4)
File Name: Costo_James_Slot
Date Compiled Last: null
Author: James Costo
Compiled in NetBeans 8.2

By submitting this project, I am taking the integrity oath that I 
have not copied any line(s) of code – partially or completely - from 
any other individual, former student work, textbook, online resources, 
website, and any reference available anywhere.
 */
public class Costo_James_Slot 
{
    public static void main(String[] args) 
    {
        // Variable Declaration and Initialization
        double inputBet,
               inputTotal = 0,
               outputBet = 0,
               outputTotal = 0;
        String result = "",
               resultA = "",
               resultB = "",
               resultC = "",
               quant = "";
        int die,
            resultANum = 0,
            resultBNum = 0,
            resultCNum = 0;
        Random rand = new Random(); // Creates randomized value
        boolean repeat = false;
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            // Get User's Bet
            System.out.print("Please enter your bet: ");
            inputBet = keyboard.nextDouble(); // Get bet
            inputTotal += inputBet; // Add bet to total
            
            // Determine Results
            for (int i=0 ; i<3 ; i++)
            {
                // Generate a Random Number
                die = rand.nextInt(5);
                
                // Assign Results
                switch (i)
                {
                    case 0:
                        resultANum = die;
                        break;
                    case 1:
                        resultBNum = die;
                        break;
                    case 2:
                        resultCNum = die;
                        break;
                }
            }
            
            // Determine Winnings
            if (resultANum == resultBNum || 
                resultANum == resultCNum || 
                resultBNum == resultCNum)
            {
                outputBet = 2 * inputBet;
                quant = "twice";
            }
            else if (resultANum == resultBNum && 
                     resultBNum == resultCNum && 
                     resultCNum == resultANum)
            {
                outputBet = 3 * inputBet;
                quant = "three times";
            }
            else
            {
                outputBet = 0;
                quant = "despite";
            }
            
            outputTotal += outputBet; // Add payout to total payout
            
            // Determine Result
            for(int i = 0, x = 0 ; i < 3 ; i++)
            {
                switch (i)
                {
                    case 0:
                        x = resultANum;
                        break;
                    case 1:
                        x = resultBNum;
                        break;
                    case 2:
                        x = resultCNum;
                        break;
                }
                    
                switch (x)
                {
                    case 0:
                        result = "Cherries";
                        break;
                    case 1:
                        result = "Oranges";
                        break;
                    case 2:
                        result = "Plums";
                        break;
                    case 3:
                        result = "Bells";
                        break;
                    case 4:
                        result = "Melons";
                        break;
                    case 5:
                        result = "Bars";
                        break;
                }
                
                switch (i)
                {
                    case 0:
                        resultA = result;
                        break;
                    case 1:
                        resultB = result;
                        break;
                    case 2:
                        resultC = result;
                        break;
                }
            }
            
            // Output
            String fOutput = "";
            
            System.out.println(fOutput.format("%s\n%s\n%s", resultA, resultB, resultC));
            System.out.println(fOutput.format("You have won $%.2f, %s "
                    + "your inital bet of $%.2f.", outputBet, quant, inputBet));
            
            System.out.println(fOutput.format("In total, you have won $%.2f "
                    + "and bet $%.2f.", outputTotal, inputTotal));
            
            System.out.print("Would you like to go again? Type Y if so, "
                    + "anything else if not. ");
            
            String input = keyboard.nextLine();
            input.substring();
            
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y"))
            {
                repeat = true;
            }
            else
            {
                repeat = false;
            }
            
        } while (repeat);
    }
}
