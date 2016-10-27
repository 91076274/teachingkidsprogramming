package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//--------------Kata Question---------------//
// How would you make sure that the guess is NOT zero 
// and end the game if the guess is zero?
// How would you make sure the guess is not a negative number
//  But, go to the next turn if the guess is negative?
// How would you make sure the guess is less than 100
//  and end the game if guess is greater than 100?
// Write the steps out in English
// Translate the steps to code
// Make sure to run after each line
public class HiLowNoZeroOr101AndNoMinusPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      //If statement guess = 0 or > 100
      if (guess == 0 || guess > 100)
      {
        //inform them why system exiting 
        MessageBox.showMessage("YOU DARE DISOBEY THE RULES?! OUT WITH YOU!!!");
        //break
        break;
      }
      if (guess < 0)
      {
        MessageBox.showMessage("Invalid input. Turn lost.");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else if (guess < answer && guess > 0)
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}