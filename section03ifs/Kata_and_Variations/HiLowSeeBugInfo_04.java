package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//--------------Kata Question---------------//
// What happens when you enter letters?
//  How can you see what your guess is exactly?
// Write the steps out in English
// Translate the steps to code
// Make sure to run after each line
public class HiLowSeeBugInfo_04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game
    //Show the user their guess
    MessageBox.showMessage("Your guess is" + guess);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      //If statement guess < 1
      if (guess == 0)
      {
        //inform them why system exiting 
        MessageBox.showMessage("YOU DARE DISOBEY THE RULES?! OUT WITH YOU!!!");
        //break
        break;
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
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}