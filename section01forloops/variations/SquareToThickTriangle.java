package org.teachingkidsprogramming.section01forloops.variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

//
//-----Kata Question-----
// How would you make an equalateral triangle...
// with 20 pixel thick sides?
// Write out steps in English
// Then translate steps into code
// Make sure to run after each line
public class SquareToThickTriangle
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Grace and Shannon");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(20);
    // Make three sides
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
