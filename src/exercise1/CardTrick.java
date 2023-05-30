package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Rashed Albatayneh May30, 2023 
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(14));
            card.setSuit(Card.SUITS[random.nextInt(3)]);

            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number 0 - 13");
        int input = keyboard.nextInt();
        for (int i = 0; i < 7; i++) {
            if(hand[i].getValue() == input){
                printInfo();
                break;
            }
        }
        
        
        
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Rashed, but you can call me prof, Rashed or sir");
        System.out.println();
        
        System.out.println("To be millioner");
        System.out.println(" i wanr a certificate");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Making money");
        System.out.println("Football");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my bycle");

        System.out.println();
        
    
    }

}
