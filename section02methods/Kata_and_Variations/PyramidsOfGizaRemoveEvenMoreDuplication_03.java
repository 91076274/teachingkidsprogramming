package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//--------------Kata Question---------------//
// Where do you see duplicate lines of code
//     and how can you refactor to make this code more readable?
// Write out steps in English
// Then translate steps into code
// Make sure to run after each line
//--------------Kata Question---------------//
//Where do you see duplicate lines of code
//  and how can you refactor to make this code more readable?
//Write out steps in English
//Then translate steps into code
//Make sure to run after each line

//--------------Kata Question---------------//
//Where do you see duplicate lines of code
//and how can you refactor to make this code more readable?
//Write out steps in English
//Then translate steps into code
//Make sure to run after each line
public class PyramidsOfGizaRemoveEvenMoreDuplication_03
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    turnAndMove(-90, 220);
    turnAndMove(135, 100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    turnAndMove(135, 210);
  }
  private static void turnAndMove(int degrees, int length)
  {
    Tortoise.turn(degrees);
    Tortoise.move(length);
  }
  private static void moveUp()
  {
    //Look for duplicate lines of code
    //refactor code that moves tortoise up
    Tortoise.turn(-90);//!!!
    Tortoise.move(100);//!!!
  }
  private static void moveDown()
  {
    // move the tortoise down
    // refactor a method and name it moveDown()
    Tortoise.turn(90); //!!!
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
