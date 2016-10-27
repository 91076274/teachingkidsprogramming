package org.teachingkidsprogramming.section01forloops.variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

//
//-----Kata Question-----
// How would you make an equalateral hexagon...
// with 20 pixel thick sides?
// with multicolored lines?
// Write out steps in English
// Then translate steps into code
// Make sure to run after each line
public class SquareToThickHexagonMultiColor
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
    for (int i = 0; i < sides; i++)
    {
      //Change the color of the line to MultiColor
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
