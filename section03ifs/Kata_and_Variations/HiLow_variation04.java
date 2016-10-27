package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer);
    //    int firstValue = MessageBox.askForNumericalInput("What would you like to be your minimum guess?");
    //    int secondValue =  MessageBox.askForNumericalInput("What would you like to be your maximum guess?");
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you think you need?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number! Any number between 1 and 100!");
      if (guess <= 0 || guess > 100)
      {
        MessageBox.showMessage("Error! You didn't follow the rules!");
        System.exit(0);
      }
      int guessRange = 10;
      if (guess + guessRange <= answer || guess - guessRange >= answer)
      {
        MessageBox.showMessage("You are close!");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    MessageBox.showMessage("You lost! The number was " + answer);
  }
}
