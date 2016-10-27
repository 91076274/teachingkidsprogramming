package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_playAgain
{
  public static void main(String[] args)
  {
    //While loop b/c we dont know how many times the user will want to play
    //need a variable to play agin
    int playAgain = 1;
    while (playAgain == 1)
    {
      int answer = NumberUtils.getRandomInt(1, 100);
      MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
      int tries = 0;
      for (; tries < 2; tries++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number");
        if (guess == answer)
        {
          Sound.playBeep();
          MessageBox.showMessage("You won!");
          // System.exit(0);
          break;
        }
        else if (guess > answer)
        {
          MessageBox.showMessage("Too high");
        }
        else
        {
          MessageBox.showMessage("Too low");
        }
      }
      if (tries == 2)
        MessageBox.showMessage("You lost");
      playAgain = MessageBox.askForNumericalInput("Enter '1' to play again. Or the 'enter'key to stop playing.");
    }
  }
}