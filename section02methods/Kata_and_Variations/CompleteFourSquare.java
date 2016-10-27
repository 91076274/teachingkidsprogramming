package org.teachingkidsprogramming.section02methods.Kata_and_Variations;
//------------FourSquare Kata---------------//

import org.teachingextensions.logo.Tortoise;

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    // Show the Tortoise-- #1
    Tortoise.show();
    // set speed to fastest possible -- #8
    Tortoise.setSpeed(10);
    // repeat following 4 times --# 6.1
    for (int i = 0; i < 4; i++)
    {
      // refactor the following to drawSquare() -- #5.1
      drawSquare();
      //turn 90 degrees -- #7
      Tortoise.turn(90);
      //repeat --#6.2
    }
  }
  private static void drawSquare()
  {
    // ---- start of method ---- # 5.2
    // repeat the following 4 times -- 5.1
    for (int i = 0; i < 4; i++)
    {
      //move 50 pixels-- #2
      Tortoise.move(50);
      // turn 90 degrees -- #3
      Tortoise.turn(90);
      // repeat -- #4.2
    }
    // end of method -- # 5.3
  }
}