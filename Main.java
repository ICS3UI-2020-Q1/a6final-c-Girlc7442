import java.util.Scanner;

/**
 * Determines a deck count using the Hi-Lo technique
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user to enter the values of 5 cards
    System.out.println("Please enter the value of 5 cards:");

    //stores the 5 cards in an array
    int[] cards = new int[5];

    //takes the users integers to put them into the array
    for(int i = 0; i < 5; i++){
      cards[i] = input.nextInt();
    }

    //initializes the count at 0
    int count = 0;

    //will check the array for number that are less than or equal to six and greater than 1 in the array and add 1 to the count and will check for numbers greater than or equal to 10 in the array and subtract 1 from the count
    for(int i = 0; i < 5; i++){
      if(cards[i] <= 6 && cards[i] > 1){
        count = count + 1;
      }
      if(cards[i] >= 10){
        count = count - 1;
      }
    }
    
    //tells the user the count
    System.out.println("The count would be " + count);
  }
}
