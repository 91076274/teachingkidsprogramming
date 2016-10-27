package org.teachingkidsprogramming.section01forloops.variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

//
//-----Kata Question-----
// How would you make an equalateral hexagon...
// with 20 pixel thick sides?
// with multicolored lines?
// with side lengths of 25 that increase by two.
// Write out steps in English
// Then translate steps into code
// Make sure to run after each line
public class SquareToIncreasingThickHexagonMultiColor
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Grace and Shannon");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(10);
    //Make pen width 20 pixels
    Tortoise.setPenWidth(20);
    // change number of sides to 6
    int sides = 6;
    // start side length at 25
    int sideLength = 5;
    for (int i = 0; i < sides; i++)
    {
      //Change the color of the line to MultiColor
      Tortoise.setPenColor(PenColors.getRandomColor());
      // increase by 2 times
      sideLength = (sideLength * 2);
      Tortoise.move(sideLength);
      Tortoise.turn(360 / sides);
    }
  }
}
